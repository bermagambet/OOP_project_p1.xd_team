package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Admin extends User {
    private ArrayList<User> users;
    private String username;
    private String password;
    private String name;

    public Admin(String name){
        this.name = name;
    }

    public String getAdminName(){
        return this.name;
    }

    public void setAdminName(String name){
        this.name = name;
        Scanner sc = new Scanner(System.in);
        String[] f_s_name = name.split(" ");
        this.username = f_s_name[0] + "_" + f_s_name[1].substring(0, 1);
        System.out.println("Please, enter your new password:");
        String s1 = sc.nextLine();
        this.password = s1;
    }

    @Override
    public void register(){
        Scanner sc = new Scanner(System.in);
        String[] f_s_name = name.split(" ");
        this.username = f_s_name[0] + "_" + f_s_name[1].substring(0, 1);
        System.out.println("Please, enter your new password:");
        String s1 = sc.nextLine();
        this.password = s1;
    }
    public void addUser(Object user){
            User uss = (User)user;
            uss.register();
            users.add(uss);

    }
    public void deleteUser(User user){
        if (this.users.contains(user)){
            this.users.remove(user);
        }
    }
    public void updateUser(User user){
        //coming soon
    }
    public void checkLogs(){
        //coming soon
    }
    @Override
    public String toString(){
        return "Admin's name: " + this.name;
    }
    @Override
    public boolean equals(Object obj){
        if(obj instanceof Admin){
            if(this.name.equals(((Admin)obj).name)){
                return true;
            }
            else return false;
        }
        else return false;
    }
}
