package com.business;

import java.util.ArrayList;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import com.webapi.Popular;
import com.webapi.CourseSort;

public class PopularSort {
	public static JSONObject popular(ArrayList<Popular> List){
		int size=List.size();
		System.out.println(size);
		for(int i=0;i<size;i++){
			//System.out.println(List.get(i).getId());
			//System.out.println("!!!!!!!!!!!!!!!!!!");
		}
		JSONObject popularcourse = new JSONObject();
		//ArrayList<CourseSort> cs=new ArrayList();
		CourseSort[] cs=new CourseSort[size];
		//score.scores[i] = new Student();
		for(int i=0;i<size;i++){
			cs[i]=new CourseSort();
		}
		cs[0].setCourseid(List.get(0).getId());
		cs[0].setCoursename(List.get(0).getName());
		cs[0].Count();
		int index=1;
		for(int i=1;i<size;i++){
			for(int j=0;j<index;j++){
				if((cs[j].getCourseid()).equals(List.get(i).getId())){
					cs[j].Count();
					break;
				}
			}
			cs[index].setCourseid(List.get(i).getId());
			cs[index].setCoursename(List.get(i).getName());
			cs[index].Count();
			index++;
		}
		for(int i=0;i<index;i++){
			//System.out.println(cs[i].getCourseid());
			//System.out.println(cs[i].getCount());
			//System.out.println("!!!!!!!!!!!!!!!!!!");
			
		}
		if(index<=3){
			JSONArray jsonarray = JSONArray.fromObject(cs);
			popularcourse.put("popular",jsonarray);
		}else{
			CourseSort[] cs1=new CourseSort[3];
			int max=0;
			int tempindex=0;
			for(int i=0;i<3;i++){
				for(int j=0;j<index;j++){
					if(cs[j].getCount()>max){
						max=cs[j].getCount();
						tempindex=j;
					}
				}
				cs1[i]=new CourseSort();
				cs1[i].setCourseid(cs[tempindex].getCourseid());
				cs1[i].setCoursename(cs[tempindex].getCoursename());
				cs1[i].setCount(max);
				cs[tempindex].resetCount();
				max=0;
				tempindex=0;
			}
			JSONArray jsonarray = JSONArray.fromObject(cs1);
			popularcourse.put("popular",jsonarray);
		}
		return popularcourse;
	}
}

