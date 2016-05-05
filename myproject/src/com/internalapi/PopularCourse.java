package com.internalapi;

import java.util.ArrayList;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import com.Dao.getPopularDao;
import com.webapi.Popular;
import com.business.PopularSort;

public class PopularCourse {
	public static JSONObject popularcourse(){
		
		ArrayList List = new ArrayList();
		List=getPopularDao.getpopulardao();
		//System.out.println(List.size());
		return PopularSort.popular(List);
	}
}
