package com.webapi;

public class CourseInfo {
	
	String courseid;
	String coursename;
	String professor;
	String description;
	
	public CourseInfo(){}
	
	public void setId(String courseid){
		this.courseid=courseid;
	}
	
	public void setName(String coursename){
		this.coursename=coursename;
	}
	
	public void setProfessor(String professor){
		this.professor=professor;
	}
	
	public void setDescription(String description){
		this.description=description;
	}
	
	public String getId(){
		return courseid;
	}
	
	public String getName(){
		return coursename;
	}
	
	public String getProfessor(){
		return professor;
	}
	
	public String getDescription(){
		return description;
	}
}
