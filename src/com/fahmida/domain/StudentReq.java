/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fahmida.domain;

/**
 *
 * @author J2EE-33
 */
public class StudentReq {

    private int id;
    private String name;
    private String email;
     private int age;
    private String subject;

    public StudentReq(String name, String email, int age, String subject) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.subject = subject;
    }
   


   

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    
}
