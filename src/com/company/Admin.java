package com.company;

import javafx.util.Pair;

import java.util.ArrayList;
import java.util.Map;

public class Admin {
    private Map<String, String> loginPassword;
    private String name;
    public void addUser(String username, String password){
        loginPassword.put(username, password);
    }
    public void removeUser(String username){
        if(loginPassword.containsKey(username)){
            loginPassword.remove(username);
        }
        else
            System.out.println("User hasn't found");
    }
    public String getLogs(String s){

    }
    @Override
    public boolean equals(Object obj){
        if(obj instanceof Admin){
            Admin ad = (Admin)obj;
            if (ad.loginPassword.equals(this.loginPassword)){
                return true;
            }
            else
                return false;
        }
        else return false;
    }
}
