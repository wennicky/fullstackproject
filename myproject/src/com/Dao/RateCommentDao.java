package com.Dao;

import net.sf.json.JSONObject;
import java.sql.*; 
import com.webapi.RateComment;

public class RateCommentDao {

	public static JSONObject ratecommentdao(JSONObject json){
		
		String username = (String) json.get("Username");
		String courseid = (String) json.get("Courseid");
		int grade = (int)json.get("Grade");
		String comment = (String) json.get("Comment");
		
		System.out.println(username);
		System.out.println(courseid);
		System.out.println(grade);
		System.out.println(comment);
		
		String url="jdbc:mysql://localhost:3306/ratemycourse";
	    String user="root";
	    String password="caihong1993";
	    JSONObject result = new JSONObject();
	    
	    try{
	    	Class.forName("com.mysql.jdbc.Driver");
	    	//System.out.println("OK,DownLoad the driver");
	    	Connection conn=DriverManager.getConnection(url, user, password);
	    	String sql1="select UserName from usercomments where UserName='"+username+"' and CourseId='"+courseid+"'";
	    	Statement sm1=conn.createStatement();
	        ResultSet rs1=sm1.executeQuery(sql1);
	        if(rs1.next()){
	    	    String error = "{\"result\":\"You have rated this course!\"}";
	    	    result=JSONObject. fromObject (error);
	        }
	        else{
	        	String sql2="insert into usercomments values ('"+username+"','"+courseid+"',"+grade+",'"+comment+"')";
	        	Statement sm2=conn.createStatement();
	        	sm2.execute(sql2);
	    	    String success = "{\"result\":\"SUCCESS!\"}";
	    	    result=JSONObject. fromObject (success);
	    	    
	        }
	    }catch(Exception e){
	    	e.printStackTrace();
	    } 
	    return result;
	}
}
