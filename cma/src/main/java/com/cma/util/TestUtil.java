package com.cma.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class TestUtil {

	public static byte[] loadData(String path) {		 
        File file = new File(path);  
        Long filelength = file.length();  
        byte[] filecontent = new byte[filelength.intValue()];  
        try {  
            FileInputStream in = new FileInputStream(file);  
            in.read(filecontent);  
            in.close();  
        } catch (FileNotFoundException e) {  
            e.printStackTrace();  
        } catch (IOException e) {  
            e.printStackTrace();  
        }  
        return filecontent;
	}
	
	@SuppressWarnings("unchecked")
	public static List<Map<String, Object>> getListMapByJson(byte[] filecontent) {
		List<Map<String, Object>> result = null;
		try {
			String data = new String(filecontent, "UTF-8");
			JSONArray myJsonArray = new JSONArray(data);
			result = new ArrayList<Map<String, Object>>();
			for (int i = 0; i < myJsonArray.length(); i++) {
				JSONObject jsons = myJsonArray.getJSONObject(i);
				Iterator<String> iter = jsons.keys();
				Map<String, Object> temp = new LinkedHashMap<String, Object>();
				while (iter.hasNext()) {
					String key = iter.next();
					Object value = jsons.get(key);				
					temp.put(key, value);
				}
				result.add(temp);			
			}
		} catch (JSONException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return result;
		
	}
	
	public static String getUrlParamsByMap(Map<String, Object> dataMap) {
        if (dataMap == null) {
            return "";
        }
        StringBuffer stringBuilder = new StringBuffer();
        for (Map.Entry<String, Object> entry : dataMap.entrySet()) {
        	if (!"id".equals(entry.getKey()) 
        			&& !"create_time".equals(entry.getKey()) 
        			&& !"modify_time".equals(entry.getKey()) 
        			&& !"is_leaving".equals(entry.getKey())
        			&& !"leaving_date".equals(entry.getKey())) {
        		String temp = entry.getKey();
        		if (temp.contains("_")) {
        			int index = temp.indexOf("_");
        			String f = temp.substring(0, index);
        			String b = temp.substring(index + 1);
        			temp = f + Character.toUpperCase(b.charAt(0)) + b.substring(1);
        		}
        		stringBuilder.append(temp + "=" + entry.getValue());
            	stringBuilder.append("&");
        	}	
        }
        stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        String result = stringBuilder.toString();
        if (result.endsWith("&")) {
        	result = result.substring(0, result.length() - 1);
        }
        return result;
    }
	
	public static void main(String[] args) {
		byte[] testData = TestUtil.loadData("D:\\Git\\Project\\private\\user.json");
		List<Map<String, Object>> datas = TestUtil.getListMapByJson(testData);
		StringBuffer stringBuilder = new StringBuffer();
		for (Map.Entry<String, Object> entry : datas.get(0).entrySet()) {
        	if (!"id".equals(entry.getKey()) 
        			&& !"create_time".equals(entry.getKey()) 
        			&& !"modify_time".equals(entry.getKey()) 
        			&& !"is_leaving".equals(entry.getKey())
        			&& !"leaving_date".equals(entry.getKey())) {
        		String temp = entry.getKey();
        		if (temp.contains("_")) {
        			int index = temp.indexOf("_");
        			String f = temp.substring(0, index);
        			String b = temp.substring(index + 1);
        			temp = f + Character.toUpperCase(b.charAt(0)) + b.substring(1);
        		}
        		stringBuilder.append(temp + "=" + entry.getValue());
            	stringBuilder.append("&");
        	}
		}
	}
}
