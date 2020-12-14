/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;


public class User {

    public User() {
    }

    public String getuUsername() {
        return uUsername;
    }

    public void setuUsername(String uUsername) {
        this.uUsername = uUsername;
    }

    public String getuPassword() {
        return uPassword;
    }

    public void setuPassword(String uPassword) {
        this.uPassword = uPassword;
    }

    public String getuEmail() {
        return uEmail;
    }

    public void setuEmail(String uEmail) {
        this.uEmail = uEmail;
    }

    public int getuType() {
        return uType;
    }

    public void setuType(int uType) {
        this.uType = uType;
    }

    public User(String uUsername, String uPassword, String uEmail, int uType) {
        this.uUsername = uUsername;
        this.uPassword = uPassword;
        this.uEmail = uEmail;
        this.uType = uType;
    }
    private String uUsername;
    private String uPassword;
    private String uEmail;
    private int uType;


}
