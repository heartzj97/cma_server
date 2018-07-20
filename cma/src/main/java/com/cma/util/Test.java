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

public class Test {
	public static void main(String[] args) throws JSONException { 
		String encoding = "UTF-8";  
		String fileName = "D:\\Git\\Project\\private\\test.json";
        File file = new File(fileName);  
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
      
        try {
			String data = new String(filecontent, encoding);
			JSONArray myJsonArray = new JSONArray(data);
			List<Map<String, Object>> result = new ArrayList<Map<String, Object>>();
			for (int i = 0; i < myJsonArray.length(); i++) {
				JSONObject jsons = myJsonArray.getJSONObject(i);
				Iterator<String> iter = jsons.keys();
				Map<String, Object> temp = new LinkedHashMap<String, Object>();
				while (iter.hasNext()) {
					String key = iter.next();//取key
					Object value = jsons.get(key);//取value 				
					temp.put(key, value);
				}
				result.add(temp);			
			}
			
			System.out.println(myJsonArray);
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
//		} catch (JsonParseException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (JsonMappingException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
         
	}
}
