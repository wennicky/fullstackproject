package com.webapi;

public class Popular {
	
	String courseid;
	String coursename;
	
	public Popular(){}
	
	public Popular(String courseid, String coursename){
		this.courseid=courseid;
		this.coursename=coursename;
	}
	
	public void setId(String courseid){
		this.courseid=courseid;
	}
	
	public void setName(String coursename){
		this.coursename=coursename;
	}
	
	public String getId(){
		return courseid;
	}
	
	public String getName(){
		return coursename;
	}
}
