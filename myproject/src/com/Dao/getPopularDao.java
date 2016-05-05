package com.Dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import com.webapi.Popular;
import net.sf.json.JSONObject;

public class getPopularDao {
	public static ArrayList<Popular> getpopulardao(){
	
	String CourseId=null;
	String CourseName=null;
	String Professor=null;
	String Description=null;
	
	String url="jdbc:mysql://localhost:3306/ratemycourse";
    String user="root";
    String password="caihong1993";
    Popular popular=new Popular();
    ArrayList<Popular> List = new ArrayList<Popular>();
    try{
    	Class.forName("com.mysql.jdbc.Driver");
    	Connection conn=DriverManager.getConnection(url, user, password);
        String sql="select course.CourseId,course.CourseName from course,usercomments where course.CourseId=usercomments.CourseId";
        Statement sm=conn.createStatement();
        ResultSet rs=sm.executeQuery(sql);
        int temp=0;
        while(rs.next()){
        	CourseId=rs.getString(1);
        	CourseName=rs.getString(2);
        	//popular.setId(CourseId);
        	//popular.setName(CourseName);
        	List.add(new Popular(CourseId,CourseName));
        	//List.get(temp).setId(CourseId);
        	//List.get(temp).setName(CourseName);
        
        	//System.out.println(List.get(temp).getId());
        	
        	//temp++;
        	//System.out.println(popular.getId());
        }
    }catch(Exception e){
    	e.printStackTrace();
    }
    //System.out.println(List.size());
    for(int i=0;i<List.size();i++){
    	//System.out.println("List:"+List.get(i).getId());
    }
    return List;
	}
}




	