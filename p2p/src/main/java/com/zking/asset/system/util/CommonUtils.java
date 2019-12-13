package com.zking.asset.system.util;

import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class CommonUtils {
	
	/**
	 * 根据ResultSet数据集，利用反射机制动态赋值并返回List<T>
	 * @param rs ResultSet数据集
	 * @param clazz 实体类对象
	 * @return 返回List实体集合
	 * @throws Exception
	 */
	public static <T> List<T> toList(ResultSet rs,Class<T> clazz) throws Exception{
		//定义实体集合
		List<T> lst=new ArrayList<T>();
		//获取ResultSet的metadata列信息
		ResultSetMetaData metaData = rs.getMetaData();
		//获取对象属性集合
		Field[] fields=clazz.getDeclaredFields();
		//循环ResultSet
		while(rs.next()) {
			//反射机制实例化
			T obj = clazz.newInstance();
			for (int i = 0; i < metaData.getColumnCount(); i++) {
				//获取列名
				String columnName=metaData.getColumnLabel(i+1).toUpperCase();
				for (Field field : fields) {
					//判断属性名与列名是否相同
					if(field.getName().toUpperCase().equals(columnName)) {
						//获取属性对应的set方法名，方法名首字母大写
						String methodName="set"+field.getName().substring(0, 1).toUpperCase()+field.getName().substring(1);
						//获取属性对应的set方法
						Method method = obj.getClass().getDeclaredMethod(methodName, field.getType());
						//设置访问权限
						method.setAccessible(true);
						//执行set方法，将数据存储到对象中的相应属性中
						method.invoke(obj, rs.getObject(columnName));
						break;
					}
				}
			}
			lst.add(obj);
		}
		return lst;
	}
	
	
	
	/**
	 * 多表查询时返回结果集,利用反射机制赋值 
	 * @param rs
	 * @return 返回List<Map<String,Object>>
	 * @throws Exception
	 */
	public static List<Map<String,Object>> toList(ResultSet rs) {
		//定义实体集合
		List<Map<String,Object>> lst=new ArrayList<Map<String,Object>>();
		//获取ResultSet的metadata列信息	
		ResultSetMetaData metaData;
		try {
			metaData = rs.getMetaData();
		Map<String,Object> set=null;
		while(rs.next()) {
			set=new HashMap<String,Object>();
			for (int i = 0; i < metaData.getColumnCount(); i++) {
				String columnName=metaData.getColumnLabel(i+1);
				set.put(columnName, rs.getObject(columnName));
			}
			lst.add(set);
		}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lst;
	}
	
	
	public static void toJSONPager(HttpServletResponse req,boolean success,String msg,int total,Object rows) {
		
		try {
		ObjectMapper mapper=new ObjectMapper();
		Map<String,Object> json=new HashMap<String, Object>();
		json.put("success", success);
		json.put("msg",msg);
		json.put("total", total);
		json.put("rows", rows);
			mapper.writeValue(req.getOutputStream(),json);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
	
	public static void toJSONMessage(HttpServletResponse resp,boolean success,String msg) {
		try {
		ObjectMapper mapper=new ObjectMapper();
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("success", success);
		map.put("msg", msg);
		mapper.writeValue(resp.getOutputStream(), map);
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
	
	
	public static void toJSONObject(HttpServletResponse resp,boolean success,Object data) {
		try {
		ObjectMapper mapper=new ObjectMapper();
		Map<String, Object> map=new HashMap<String, Object>();

		map.put("code",0);
		map.put("msg","");
		map.put("count",1000);
		map.put("data", data);
			mapper.writeValue(resp.getOutputStream(), map);
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}


	public static void toJSONObjectRoot(HttpServletResponse resp,boolean success,Object data) {
		try {
			ObjectMapper mapper=new ObjectMapper();
			Map<String, Object> map=new HashMap<String, Object>();

			map.put("currency", data);
			mapper.writeValue(resp.getOutputStream(), map);
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
}
