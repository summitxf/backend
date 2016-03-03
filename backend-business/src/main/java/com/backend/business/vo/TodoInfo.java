package com.backend.business.vo;

import java.io.Serializable;
import java.util.Date;

public class TodoInfo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3782306482923726953L;
	private Long id;
	private String todoName;
	private int todoType;
	private Date createdTime;
	private Boolean isGiveup;
	private Date logTime;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTodoName() {
		return todoName;
	}

	public void setTodoName(String todoName) {
		this.todoName = todoName;
	}

	public int getTodoType() {
		return todoType;
	}

	public void setTodoType(int todoType) {
		this.todoType = todoType;
	}

	public Date getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}

	public Boolean getIsGiveup() {
		return isGiveup;
	}

	public void setIsGiveup(Boolean isGiveup) {
		this.isGiveup = isGiveup;
	}

	public Date getLogTime() {
		return logTime;
	}

	public void setLogTime(Date logTime) {
		this.logTime = logTime;
	}

}
