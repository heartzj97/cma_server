package com.cma.util;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

import com.cma.pojo.Staff;


public class Convert {
	public static Object convertMap(Class<?> beanClass, Map<String, Object> map) {  
		if (map == null)     
            return null;         
        Object obj = null;
		try {
			obj = beanClass.newInstance();
	        BeanInfo beanInfo = Introspector.getBeanInfo(obj.getClass());      
	        PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();      
	        for (PropertyDescriptor property : propertyDescriptors) {    
	            Method setter = property.getWriteMethod();      
	            if (setter != null) {    
	                setter.invoke(obj, map.get(property.getName()));     
	            }    
	        }
        } catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IntrospectionException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}            
        return obj; 
    }     
	

	public static void main(String[] args) throws Exception {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("name", "乔老");
		map.put("gender", (byte) 1);
		Staff staff;// = new Staff();
		staff = (Staff)Convert.convertMap(Staff.class, map);
		
		System.out.println(staff.getGender());
	}
}
