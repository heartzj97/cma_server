package com.cma.util;

/**
 * @Title: Result.java
 * @Description: 自定义响应数据结构
 * 				200：表示成功
 * 				500：表示错误，错误信息在msg字段中
 * 				555：异常抛出信息
 * @version V1.1.0
 */
public class Result {
    private Integer code;

    private String msg;
    
	private Object data;
	
	public static Result ok(Object data) {
        return new Result(data);
    }
	
	public static Result ok() {
        return new Result(null);
    }
		
	public static Result fail(String msg) {
		return new Result(210, msg, null);
	}
	
	public static Result errorMsg(String msg) {
        return new Result(500, msg, null);
    }
	
	public Result(Integer code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }
	
    public Result(Object data) {
        this.code = 200;
        this.msg = "成功";
        this.data = data;
    }

    public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}
}
