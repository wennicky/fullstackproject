package com.Dao;

import net.sf.json.JSONObject;

import java.sql.*;
import java.util.ArrayList;




public class getCourseDao {
	
	public static JSONObject getcoursedao(String course){ 
		String CourseId=null;
		String CourseName=null;
		String Professor=null;
		String Description=null;
		
		String url="jdbc:mysql://localhost:3306/ratemycourse";
	    String user="root";
	    String password="caihong1993";

	    try{
	    	Class.forName("com.mysql.jdbc.Driver");
	    	//System.out.println("OK,DownLoad the driver");
	    	Connection conn=DriverManager.getConnection(url, user, password);
	    	String sql="select * from course where CourseId='"+course+"'";
	    	Statement sm=conn.createStatement();
	        ResultSet rs=sm.executeQuery(sql);
	        if(rs.next()){
	        	CourseId=rs.getString(1);
	        	CourseName=rs.getString(2);
	        	Professor=rs.getString(3);
	        	Description = rs.getString(4);
	        }
	    }catch(Exception e){
	    	e.printStackTrace();
	    }
	    
	    String jsonString="{\"CourseId\":\'"+CourseId+"',\"CourseName\":\'"+CourseName+"',\"Professor\":'"+Professor+"',\"Description\":\'"+Description+"'}";
	    //String jsonString =  "{\"courseid\":\"1\",\"coursename\":\"algorithm\",\"instructor\":\"Mike\"}";
	    JSONObject courseinfo = new JSONObject();
	    courseinfo = JSONObject. fromObject (jsonString);
	    return courseinfo;
	}
}
