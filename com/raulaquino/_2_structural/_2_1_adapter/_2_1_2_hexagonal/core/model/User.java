package com.raulaquino._2_structural._2_1_adapter._2_1_2_hexagonal.core.model;

public class User {
    private String name;
    private String email;
    private String pass;

    public User(String name, String email, String pass) {
        this.name = name;
        this.email = email;
        this.pass = pass;
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

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    @Override
    public String toString() {
        return "Combo [name=" + name + ", email=" + email + "]";
    }
}
