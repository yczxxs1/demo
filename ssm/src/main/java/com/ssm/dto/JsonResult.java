package com.ssm.dto;

import java.io.Serializable;

public class JsonResult<T> implements Serializable {

	private static final long serialVersionUID = 1L;
	
	public static final boolean SUCCESS=true;
	public static final boolean ERROR=false;


	private boolean result;

	private T data;

	private String message = "";
	

	public JsonResult() {
		super();
		// TODO Auto-generated constructor stub
	}

	public JsonResult(boolean result, T data, String message) {
		super();
		this.result = result;
		this.data = data;
		this.message = message;
	}
	
	public JsonResult(boolean result, T data) {
		super();
		this.result = result;
		this.data = data;
	}
	
	public JsonResult(T data){
		this(SUCCESS,data);
	}
	
	public JsonResult(String error){
		this(ERROR,null,error);
	}
	
	public JsonResult(Throwable e){
		this(ERROR,null,e.getMessage());
	}



	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public boolean isResult() {
		return result;
	}

	public void setResult(boolean result) {
		this.result = result;
	}
	
	@Override
	public String toString() {
		return "JsonResult [result=" + result + ", message=" + message + ", data=" + data + "]";
	}


}
