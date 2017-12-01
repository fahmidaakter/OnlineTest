/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fahmida.dao;

import com.fahmida.domain.StudentReq;
import com.fahmida.domain.User;
import java.util.List;

/**
 *
 * @author J2EE-33
 */
public interface StudentReqDao {
    void save(StudentReq s);

    void update(StudentReq s);

    void delete(int id);

    List<StudentReq> getList();

    User getStudent(int id);
    
    }

