package persistence;

import model.Boat;

import java.util.List;

public interface BoatDao {

    void create(Boat boat);
    void update(Boat boat);
    void delete(Boat boat);
    List<Boat> retrieveAll();
}
