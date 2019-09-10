package com.example.lpukipathshala.DataModels;

import java.util.List;

public class UserDetails {
    private String fname;
    private String lname;
    private String phone;
    private String email;
    private String location;
    private String about;
    public UserDetails(String fname, String lname, String phone, String email, String location, String about) {
        this.fname = fname;
        this.lname = lname;
        this.phone = phone;
        this.email = email;
        this.location = location;
        this.about = about;
    }
    public  UserDetails() {}

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }
}