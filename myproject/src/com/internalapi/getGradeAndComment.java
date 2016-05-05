package com.internalapi;

import com.Dao.getCourseDao;
import com.Dao.getGradeAndCommentDao;
import net.sf.json.JSONObject;


public class getGradeAndComment {
	public static JSONObject getgradeandcomment(String course){
		return getGradeAndCommentDao.getgradeandcommentdao(course);
	}
}
