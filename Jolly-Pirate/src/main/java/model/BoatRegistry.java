package model;

import persistence.BoatDao;
import persistence.BoatDaoImpl;

import java.util.List;

public class BoatRegistry implements DataRegistry<Boat>, SaveOnExit {

    private final BoatDao boatDao;
    private final List<Boat> boats;

    public BoatRegistry() {
        boatDao = new BoatDaoImpl();
        boats = boatDao.retrieveAll();
    }

    // --- In-memory storage (Implements DataRegistry) --- //
    @Override
    public void add(Boat boat) {
        boats.add(boat);
    }
    @Override
    public void delete(Boat boat) {
        boats.remove(boat);
    }
    @Override
    public Boat retrieve(String id) {
        for (Boat b : boats) {
            if (id.equals(b.getId()))
                return b;
        }
        return null;
    }
    @Override
    public List<Boat> getAll() {
        return boats;
    }
    @Override
    public boolean isEmpty() {
        return boats.size() == 0;
    }

    // --- Updating database (Implements SaveOnExit) --- //
    @Override
    public void deleteAll() {
        for(Boat dbBoat : boatDao.retrieveAll()) {
            boolean flag = false;
            for(Boat inMemoryBoat : boats) {
                if (dbBoat.getId().equals(
                        inMemoryBoat.getId())) {
                    flag = true;
                    break;
                }
            }
            if(!flag) {
                boatDao.delete(dbBoat);
            }
        }
    }
    @Override
    public void createAll() {
        for(Boat inMemoryBoat : boats) {
            boolean flag = false;
            for(Boat dbBoat : boatDao.retrieveAll()) {
                if (inMemoryBoat.getId().equals(
                        dbBoat.getId())) {
                    flag = true;
                    break;
                }
            }
            if(!flag)
                boatDao.create(inMemoryBoat);
        }
    }
    @Override
    public void updateAll() {
        for(Boat dbBoat : boatDao.retrieveAll()) {
            boolean flag = false;
            for(Boat inMemoryBoat : boats) {
                if (dbBoat.equals(inMemoryBoat)) {
                    flag = true;
                    break;
                }
            }
            if(flag)
                boatDao.update(dbBoat);
        }
    }
    @Override
    public void saveDataOnExit() {
        deleteAll();
        createAll();
        updateAll();
    }

}
