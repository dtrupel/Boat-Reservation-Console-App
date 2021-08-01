package persistence;

import model.Member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MemberDaoImpl implements MemberDao {

    private final LocalConnection localConnection;
    private final DaoUtil memberDaoUtil;

    public MemberDaoImpl() {
        memberDaoUtil = new MemberDaoUtil();
        localConnection = LocalConnection.getInstance();
    }

    @Override
    public void create(Member member) {
        try {
            Connection connection = localConnection.getConnection();
            PreparedStatement create = connection.prepareStatement(memberDaoUtil.create());
            create.setString(1, member.getName());
            create.setString(2, member.getPersonalNumber());
            create.setString(3, member.getMemberId());
            create.execute();
        }catch(SQLException ex) {
            System.exit(1);
        }
    }

    @Override
    public void update(Member member) {
        try {
            Connection connection = localConnection.getConnection();
            PreparedStatement update = connection.prepareStatement(memberDaoUtil.update());
            update.setString(1, member.getName());
            update.setString(2, member.getPersonalNumber());
            update.setString(3, member.getMemberId());
            update.executeUpdate();
        }catch(SQLException ex) {
            System.exit(1);
        }
    }

    @Override
    public void delete(Member member) {
        try {
            Connection connection = localConnection.getConnection();
            PreparedStatement delete = connection.prepareStatement(memberDaoUtil.delete());
            delete.setString(1, member.getMemberId());
            delete.execute();
        }catch(SQLException ex) {
            System.exit(1);
        }
    }

    @Override
    public List<Member> retrieveAll() {
        List<Member> list = new ArrayList<>();
        try {
            Connection connection = localConnection.getConnection();
            PreparedStatement retrieve = connection.prepareStatement(memberDaoUtil.getAll());
            ResultSet rs = retrieve.executeQuery();
            while(rs.next()) {
                Member member
                        = new Member(rs.getString(1),
                        rs.getString(2),
                        rs.getString(3));
                list.add(member);
            }
        }catch(SQLException ex) {
            System.exit(1);
        }
        return list;
    }
}
