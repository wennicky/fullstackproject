package com.internalapi;

import net.sf.json.JSONObject;
import com.Dao.getCourseDao;

public class getCourse {

	public static JSONObject getcourse(String course) {
		
		return getCourseDao.getcoursedao(course);
	}
		
}
