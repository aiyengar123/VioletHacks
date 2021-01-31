package com.example.currencyconverter;

public class UserModel
{
    private String username;
    private String password;

    //constructors

    public UserModel(String username, String password) {
        this.username = username;
        this.password = password;
    }

    //toString method
    public String toString() {
        return "UserModel{" +
                "username='" + username + '\'' +
        ", password='" + password + '\'' +
        '}';
    }

    //getters and setters
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}