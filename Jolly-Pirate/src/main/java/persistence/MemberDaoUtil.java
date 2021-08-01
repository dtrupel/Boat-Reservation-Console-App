package persistence;

public class MemberDaoUtil implements DaoUtil {

    @Override
    public String create() {
        return "INSERT into members (name, personal_number, member_id) VALUES (?,?,?)";
    }

    @Override
    public String update() {
        return "UPDATE members SET name=?, personal_number=? WHERE member_id=?";
    }

    @Override
    public String delete() {
        return "DELETE FROM members WHERE member_id=?";
    }

    @Override
    public String getAll() {
        return "SELECT * FROM members";
    }

}
