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
public class Review {
    
    private String pubTitle;
    private String pubURL;
    private String summary;
    private String postives;
    private String negatives;
    private String majPoints;
    private String minPoints;
    
    
    //Saves newly created reviews into review array list
    public void saveReviewFile(Review newReview){
        try(PrintWriter out = new PrintWriter("Reviews.txt")){
            out.printf("%S", newReview.pubTitle);
            out.printf("%S", newReview.pubURL);
            out.printf("%s", newReview.summary);
            out.printf("%s", newReview.postives);
            out.printf("%s", newReview.negatives);
            out.printf("%s", newReview.majPoints);
            out.printf("%s" + "%n", newReview.minPoints);
            out.close();
        } catch(Exception ex){
            System.out.println(ex);
            
        }
    }
    
    /**
     * @return the pubTitle
     */
    public String getPubTitle() {
        return pubTitle;
    }

    /**
     * @param pubTitle the pubTitle to set
     */
    public void setPubTitle(String pubTitle) {
        this.pubTitle = pubTitle;
    }

    /**
     * @return the pubURL
     */
    public String getPubURL() {
        return pubURL;
    }

    /**
     * @param pubURL the pubURL to set
     */
    public void setPubURL(String pubURL) {
        this.pubURL = pubURL;
    }

    /**
     * @return the summary
     */
    public String getSummary() {
        return summary;
    }

    /**
     * @param summary the summary to set
     */
    public void setSummary(String summary) {
        this.summary = summary;
    }

    /**
     * @return the postives
     */
    public String getPostives() {
        return postives;
    }

    /**
     * @param postives the postives to set
     */
    public void setPostives(String postives) {
        this.postives = postives;
    }

    /**
     * @return the negatives
     */
    public String getNegatives() {
        return negatives;
    }

    /**
     * @param negatives the negatives to set
     */
    public void setNegatives(String negatives) {
        this.negatives = negatives;
    }

    /**
     * @return the majPoints
     */
    public String getMajPoints() {
        return majPoints;
    }

    /**
     * @param majPoints the majPoints to set
     */
    public void setMajPoints(String majPoints) {
        this.majPoints = majPoints;
    }

    /**
     * @return the minPoints
     */
    public String getMinPoints() {
        return minPoints;
    }

    /**
     * @param minPoints the minPoints to set
     */
    public void setMinPoints(String minPoints) {
        this.minPoints = minPoints;
    }
    
    
    
    
    
    
    
    
}
