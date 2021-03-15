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
public class ReviewList {
    
     private List<Review> reviewList;
    
    
    //Initialize Review Array List
    public void init(){
        
        reviewList = new ArrayList<Review>();
    }
    
    //Add new review to array list
    public void addReview(Review newReview){
        reviewList.add(newReview);
   
    }
}
