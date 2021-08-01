package persistence;

import model.Boat;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BoatDaoImpl implements BoatDao {

    private final LocalConnection localConnection;
    private final DaoUtil boatDaoUtil;

    public BoatDaoImpl() {
        boatDaoUtil = new BoatDaoUtil();
        localConnection = LocalConnection.getInstance();
    }

    @Override
    public void create(Boat boat) {
        try {
            Connection connection = localConnection.getConnection();
            PreparedStatement create = connection.prepareStatement(boatDaoUtil.create());
            create.setFloat(1, boat.getLength());
            create.setString(2, boat.getType());
            create.setString(3, boat.getMemberId());
            create.setString(4, boat.getId());
            create.execute();
        }catch(SQLException ex) {
            System.exit(1);
        }
    }

    @Override
    public void update(Boat boat) {
        try {
            Connection connection = localConnection.getConnection();
            PreparedStatement update = connection.prepareStatement(boatDaoUtil.update());
            update.setFloat(1, boat.getLength());
            update.setString(2, String.valueOf(boat.getType()));
            update.setString(3, boat.getId());
            update.executeUpdate();
        }catch(SQLException ex) {
            System.exit(1);
        }
    }

    @Override
    public void delete(Boat boat) {
        try {
            Connection connection = localConnection.getConnection();
            PreparedStatement delete = connection.prepareStatement(boatDaoUtil.delete());
            delete.setString(1, boat.getId());
            delete.execute();
        }catch(SQLException ex) {
            System.exit(1);
        }
    }

    @Override
    public List<Boat> retrieveAll() {
        List<Boat> list = new ArrayList<>();
        try {
            Connection connection = localConnection.getConnection();
            PreparedStatement retrieve = connection.prepareStatement(boatDaoUtil.getAll());
            ResultSet rs = retrieve.executeQuery();
            while (rs.next()) {
                Boat boat
                        = new Boat(rs.getFloat(1),
                        rs.getString(3),
                        rs.getString(4));
                boat.setType(rs.getString(2));
                list.add(boat);
            }
        } catch (SQLException ex) {
            System.exit(1);
        }
        return list;
    }
}
