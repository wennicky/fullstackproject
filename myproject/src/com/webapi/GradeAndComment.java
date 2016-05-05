package com.webapi;

public class GradeAndComment {
	String username;
	int grade;
	String comment;
	
	public GradeAndComment(){}
	/*public GradeAndComment(String username,int grade,String comment){
		this.username=username;
		this.grade=grade;
		this.comment=comment;
	}*/
	
	public void setUsername(String username){
		this.username=username;
	}
	
	public void setGrade(int grade){
		this.grade=grade;
	}
	
	public void setComment(String comment){
		this.comment=comment;
	}
	
	public String getUsername(){
		return username;
	}
	
	public int getGrade(){
		return grade;
	}
	
	public String getComment(){
		return comment;
	}
}
