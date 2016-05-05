package com.webapi;

public class CourseSort {
	String courseid=null;
	String coursename=null;
	int count=0;
	
	public CourseSort(){}
	
	public void setCourseid(String courseid){
		this.courseid=courseid;
	}
	
	public void setCoursename(String coursename){
		this.coursename=coursename;
	}
	
	public void setCount(int count){
		this.count=count;
	}

	public void resetCount(){
		this.count=0;
	}
	
	public void Count(){
		this.count=this.count+1;
	}
	
	public String getCourseid(){
		return courseid;
	}
	
	public String getCoursename(){
		return coursename;
	}
	
	public int getCount(){
		return count;
	}
}
