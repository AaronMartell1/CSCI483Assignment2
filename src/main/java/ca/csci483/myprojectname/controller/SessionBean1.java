/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.csci483.myprojectname.controller;

import ca.csci483.myprojectname.utils.DataUtils;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;



/**
 *
 * @author Aaron Martell
 */

@SessionScoped
@Named("sessionBean1")
public class SessionBean1 implements Serializable {

    private final ApplicationBean1 ab = (ApplicationBean1) DataUtils.findBean("applicationBean1");
    
    
    private StudentList stuList;
    private ReviewList revList;
    private Student currentUser;
    private Review currentReview;
    
    @PostConstruct
    public void init(){
        this.currentUser = new Student();
        this.currentReview = new Review();
        initLists();
    }
    
    //Method to initilize the StudentList and ReviewList with the relevent data stored in their respective .txt files
    public void initLists(){
        
        
    }
    
    
    /**
     * <p>
     * Construct a new session data bean instance.</p>
     */
    public SessionBean1() {
    }

    //More themes at: https://repository.primefaces.org/org/primefaces/themes/
    private String theme = "smoothness";

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    
    /**
     * @return the stuList
     */
    public StudentList getStuList() {
        return stuList;
    }

    /**
     * @param stuList the stuList to set
     */
    public void setStuList(StudentList stuList) {
        this.stuList = stuList;
    }

    /**
     * @return the currentUser
     */
    public Student getCurrentUser() {
        return currentUser;
    }

    /**
     * @param currentUser the currentUser to set
     */
    public void setCurrentUser(Student currentUser) {
        this.currentUser = currentUser;
    }

    /**
     * @return the currentReview
     */
    public Review getCurrentReview() {
        return currentReview;
    }

    /**
     * @param currentReview the currentReview to set
     */
    public void setCurrentReview(Review currentReview) {
        this.currentReview = currentReview;
    }

    /**
     * @return the revList
     */
    public ReviewList getRevList() {
        return revList;
    }

    /**
     * @param revList the revList to set
     */
    public void setRevList(ReviewList revList) {
        this.revList = revList;
    }
    
}
