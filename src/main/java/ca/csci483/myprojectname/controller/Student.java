/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.csci483.myprojectname.controller;

import java.io.PrintWriter;

/**
 *
 * @author aaron
 */
public class Student {
    
    private String uName;
    private String pWord;
    private String fName;
    private String lName;
    private String email;
    

    //Saves user info from registration page into Users file
    public void saveUserFile(Student newUser){
        try(PrintWriter out = new PrintWriter("Users.txt")){
            out.printf("%S", newUser.uName);
            out.printf("%S", newUser.pWord);
            out.printf("%s", newUser.fName);
            out.printf("%s" + "%n", newUser.lName);
            out.close();
        } catch(Exception ex){
            System.out.println(ex);
            
        }
    }
    
    
    
    
    /**
     * @return the uName
     */
    public String getuName() {
        return uName;
    }

    /**
     * @param uName the uName to set
     */
    public void setuName(String uName) {
        this.uName = uName;
    }

    /**
     * @return the pWord
     */
    public String getpWord() {
        return pWord;
    }

    /**
     * @param pWord the pWord to set
     */
    public void setpWord(String pWord) {
        this.pWord = pWord;
    }

    /**
     * @return the fName
     */
    public String getfName() {
        return fName;
    }

    /**
     * @param fName the fName to set
     */
    public void setfName(String fName) {
        this.fName = fName;
    }

    /**
     * @return the lName
     */
    public String getlName() {
        return lName;
    }

    /**
     * @param lName the lName to set
     */
    public void setlName(String lName) {
        this.lName = lName;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

}