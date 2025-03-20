package com.raulaquino._2_structural._2_2_bridge._2_2_2_backend._2_2_2_2_model;

public class _2_2_2_2_1_User {
    private String name;
    private String email;
    private String password;

    public _2_2_2_2_1_User(String name, String email, String password){
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "_2_2_2_2_1_User{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
