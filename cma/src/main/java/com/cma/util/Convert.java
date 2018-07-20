package com.cma.util;

import java.util.Map;

public class Convert {
	public static String getUrlParamsByMap(Map<String, Object> map) {
        if (map == null) {
            return "";
        }
        StringBuffer sb = new StringBuffer();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            sb.append(entry.getKey() + "=" + entry.getValue());
            sb.append("&");
        }
        sb.deleteCharAt(sb.length()-1);
        String s = sb.toString();
        if (s.endsWith("&")) {
            s = s.substring(0, s.length()-1);
        }
        return s;
    }
}
