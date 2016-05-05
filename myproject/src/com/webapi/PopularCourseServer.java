package com.webapi;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import org.codehaus.jackson.annotate.JsonIgnore;
import net.sf.json.JSONObject;
import com.internalapi.PopularCourse;
import com.internalapi.Rate_Comment;

@Path("/rateandcomment1")
public class PopularCourseServer {
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@JsonIgnore
	public JSONObject RateAndComment(JSONObject json){
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!");
		return Rate_Comment.ratecomment(json);
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public JSONObject MostPopularCourse(){
		return PopularCourse.popularcourse();
	}

}
