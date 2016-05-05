package com.webapi;

import javax.swing.JOptionPane;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.internalapi.PopularCourse;
import com.internalapi.Rate_Comment;

import net.sf.json.JSONObject;
import java.util.Optional;

@Path("/getpopular")
public class MostPopularCourseServer {
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public JSONObject MostPopularCourse(){
		return PopularCourse.popularcourse();
	}
}
