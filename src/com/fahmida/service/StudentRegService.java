package com.fahmida.service;

import com.fahmida.conn.MySqlDbConnection;
import com.fahmida.dao.StudentReqDao;
import com.fahmida.dao.UserDao;
import com.fahmida.domain.StudentReq;
import com.fahmida.domain.User;
import java.sql.Connection;
import java.util.List;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Sanjida Nasrin URMI
 */
public class StudentRegService implements StudentReqDao {

    Connection conn = MySqlDbConnection.getConnection();

    @Override
    public void save(StudentReq s) {
        try {
            if (s.getName() != null) {

                PreparedStatement stmt = conn.prepareStatement("insert into studentreg(name,email,age, subject) values(?,?,?,?)");

                stmt.setString(1, s.getName());
                stmt.setString(2, s.getEmail());
                stmt.setInt(3, s.getAge());
                stmt.setString(4, s.getSubject());

                int i = stmt.executeUpdate();
                System.out.println(i + " record inserted");
            }
            // con.close();
        } catch (SQLException ex) {
            Logger.getLogger(StudentRegService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(StudentReq s) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<StudentReq> getList() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public User getStudent(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
