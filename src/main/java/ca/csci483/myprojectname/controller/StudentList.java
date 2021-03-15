/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.csci483.myprojectname.controller;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author aaron
 */

public class StudentList {
    
    private List<Student> studentList;
    
    
    //Initilize arraylist
    public void init(){
        
        studentList = new ArrayList<Student>();
    }
    
    //Add student to student Array List, called on press of registration button
    public void registerStudent(Student regStudent){
        studentList.add(regStudent);
   //     saveUserFile(regStudent);
    }
    
    
}
