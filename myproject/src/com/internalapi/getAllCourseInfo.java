package com.internalapi;

import com.Dao.getAllCourseDao;

import net.sf.json.JSONObject;

public class getAllCourseInfo {
	public static JSONObject getallcourse(){
		return getAllCourseDao.getallcoursedao();
	}
}
