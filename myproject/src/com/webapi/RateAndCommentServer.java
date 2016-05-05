package com.webapi;

import javax.swing.JOptionPane;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import net.sf.json.JSONObject;
import java.util.Optional;
import com.webapi.RateComment;
import jdk.nashorn.internal.parser.JSONParser;
import com.internalapi.Rate_Comment;

@Path("/rateandcomment")
public class RateAndCommentServer {
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@JsonIgnore
	public JSONObject RateAndComment(JSONObject json){
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!");
		return Rate_Comment.ratecomment(json);
	}

}
