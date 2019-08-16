package com.example.demo.model;

import java.io.Serializable;

public class CustomEmployee implements Serializable {

    private String fname;
    private String lname;

    public CustomEmployee(String fname, String lname) {
        this.fname = fname;
        this.lname = lname;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String FNAME) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String LNAME) {
        this.lname = lname;
    }

}
