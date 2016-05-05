package com.webapi;

import javax.swing.JOptionPane;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import net.sf.json.JSONObject;
import java.util.Optional;
import com.internalapi.getCourse;
import com.internalapi.getGradeAndComment;

@Path("/course/{courseid}")

public class CourseInfoServer {
	
	@GET
	@Path("/info")
	@Produces(MediaType.APPLICATION_JSON)
	public JSONObject CourseInfo(@PathParam("courseid") String course){
		return getCourse.getcourse(course);
	}
	
	@GET
	@Path("/gradecomment")
	@Produces(MediaType.APPLICATION_JSON)
	public JSONObject CourseGradeAndComment(@PathParam("courseid") String course){
		return getGradeAndComment.getgradeandcomment(course);
	}
}