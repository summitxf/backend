package com.backend.service.vo;

import java.io.Serializable;

public class ResultData implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8206853702991322063L;

	public static final String SUCC_STATUS = "0";
	public static final String FAIL_STATUS = "1";

	public static final String SUCC_MSG = "success";
	public static final String FAIL_MSG = "fail";

	private String resultCode;

	private String msg;

	private Object data;

	public ResultData() {
	}

	public ResultData(String resultCode, String msg) {
		this.resultCode = resultCode;
		this.msg = msg;
	}

	public ResultData(String resultCode, Object data) {
		this.resultCode = resultCode;
		this.data = data;
	}

	public ResultData(String resultCode, String msg, Object data) {
		this.resultCode = resultCode;
		this.msg = msg;
		this.data = data;
	}

	public String getResultCode() {
		return resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
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
