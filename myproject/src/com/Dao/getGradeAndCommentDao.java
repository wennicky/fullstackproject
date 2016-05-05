package com.Dao;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import java.sql.*;
import java.util.ArrayList;
import com.webapi.GradeAndComment; 

public class getGradeAndCommentDao {
	public static JSONObject getgradeandcommentdao(String course){
		
		String url="jdbc:mysql://localhost:3306/ratemycourse";
	    String user="root";
	    String password="caihong1993";
	    
	    ArrayList List = new ArrayList();
	    
	    try{
	    	Class.forName("com.mysql.jdbc.Driver");
	    	Connection conn=DriverManager.getConnection(url, user, password);
	        String sql="select UserName, Grade, Comments from usercomments where CourseId='"+course+"'";
	        Statement sm=conn.createStatement();
	        ResultSet rs=sm.executeQuery(sql);
	        while(rs.next()){
	        	String username=rs.getString(1);
	        	int grade=rs.getInt(2);
	        	String comment=rs.getString(3);
	        	GradeAndComment gradecomment = new GradeAndComment();
	        	gradecomment.setUsername(username);
	        	gradecomment.setGrade(grade);
	        	gradecomment.setComment(comment);
	        	
	        	System.out.println(gradecomment.getUsername());
	        	System.out.println(gradecomment.getGrade());
	        	System.out.println(gradecomment.getComment());
	        	
	        	List.add(gradecomment);
	        }
	    }catch(Exception e){
	    	e.printStackTrace();
	    }
	    //JSONObject gradeandcomment = new JSONObject();
	    //gradeandcomment = JSONObject. fromObject (jsonString);
	    JSONArray jsonarray = JSONArray.fromObject(List);
	    JSONObject gradeandcomment = new JSONObject();
	    gradeandcomment.put("arrayName",jsonarray);
	    return gradeandcomment;
	}
}
