package model;

import java.util.List;
import java.util.Random;

public class BoatIdGenerator implements IdGenerator<Boat> {

    private static BoatIdGenerator idGenerator;

    private BoatIdGenerator(){
    }

    public static BoatIdGenerator getInstance() {
        if(idGenerator == null)
            idGenerator = new BoatIdGenerator();
        return idGenerator;
    }

    // --- Id generation --- //
    @Override
    public boolean idExists(List<Boat> boats, String id) {
        for (Boat boat : boats) {
            if (boat.getId().equals(id))
                return false;
        }
        return true;
    }

    @Override
    public String generateId(List<Boat> boats) {
        long id = 10_000 + new Random().nextInt(89_999);
        while(idExists(boats,String.valueOf(id)))
            id = 10_000 + new Random().nextInt(89_999);
        return String.valueOf(id);
    }
}
