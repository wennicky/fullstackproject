package com.webapi;

import javax.swing.JOptionPane;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import com.internalapi.getAllCourseInfo;
import net.sf.json.JSONObject;
import java.util.Optional;

@Path("/allcourse")

public class AllCourseInfoServer {
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public JSONObject AllCourseInfo(){
		return getAllCourseInfo.getallcourse();
	}
	
}
