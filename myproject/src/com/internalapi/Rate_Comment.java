package com.internalapi;

import net.sf.json.JSONObject;
import com.Dao.RateCommentDao;
import com.webapi.RateComment;

public class Rate_Comment {
	
	public static JSONObject ratecomment(JSONObject json){
		
		return RateCommentDao.ratecommentdao(json);
				
	}
	
}
