package com.Dao;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import com.webapi.CourseInfo;
import java.sql.*;
import java.util.ArrayList;


public class getAllCourseDao {
	public static JSONObject getallcoursedao(){
		String CourseId=null;
		String CourseName=null;
		String Professor=null;
		String Description=null;
		
		String url="jdbc:mysql://localhost:3306/ratemycourse";
	    String user="root";
	    String password="caihong1993";
	    
	    ArrayList List = new ArrayList();
	    
	    try{
	    	Class.forName("com.mysql.jdbc.Driver");
	    	Connection conn=DriverManager.getConnection(url, user, password);
	        String sql="select * from course";
	        Statement sm=conn.createStatement();
	        ResultSet rs=sm.executeQuery(sql);
	        while(rs.next()){
	        	CourseId=rs.getString(1);
	        	CourseName=rs.getString(2);
	        	Professor=rs.getString(3);
	        	Description=rs.getString(4);
	        	
	        	CourseInfo courseinfo=new CourseInfo();
	        	
	        	courseinfo.setId(CourseId);
	        	courseinfo.setName(CourseName);
	        	courseinfo.setProfessor(Professor);
	        	courseinfo.setDescription(Description);
	        	
	        	List.add(courseinfo);
	        }
	    }catch(Exception e){
	    	e.printStackTrace();
	    }
	    JSONArray jsonarray = JSONArray.fromObject(List);
	    JSONObject courseinfo = new JSONObject();
	    courseinfo.put("arrayName",jsonarray);
	    return courseinfo;
	}
}
