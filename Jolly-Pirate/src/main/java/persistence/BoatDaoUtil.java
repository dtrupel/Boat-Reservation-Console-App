package persistence;

public class BoatDaoUtil implements DaoUtil {

    @Override
    public String create() {
        return "INSERT into boats (length, type, member_id, boat_id) VALUES (?,?,?,?)";
    }

    @Override
    public String update() {
        return "UPDATE boats SET length=?, type=? WHERE boat_id=?";
    }

    @Override
    public String delete() {
        return "DELETE FROM boats WHERE boat_id=?";
    }

    @Override
    public String getAll() {
        return "SELECT * FROM boats";
    }
}
