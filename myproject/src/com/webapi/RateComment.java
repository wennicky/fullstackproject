package com.webapi;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RateComment {
	String Username;
	String Courseid;
	int Grade;
	String Comment;
	
	public RateComment() {  
        // TODO Auto-generated constructor stub  
    }  
  
    public RateComment(String Username, String Courseid, int Grade, String Comment) {  
        super();  
        this.Username = Username;  
        this.Courseid = Courseid;  
        this.Grade = Grade;  
        this.Comment = Comment;  
    }  
	
	public String getUsername() {  
        return Username;  
    }  
	
    public void setUsername(String Username) {  
        this.Username = Username;  
    } 
    
    public String getCourseid() {  
        return Courseid;  
    }  
    public void setCourseid(String Courseid) {  
        this.Courseid = Courseid;  
    } 
    
	public int getGrade() {  
        return Grade;  
    }  
    public void setGrade(int Grade) {  
        this.Grade = Grade;  
    } 
    
	public String getComment() {  
        return Comment;  
    }  
    public void setComment(String Comment) {  
        this.Comment = Comment;  
    }  
    
}
