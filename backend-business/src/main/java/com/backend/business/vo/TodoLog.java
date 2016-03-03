package com.backend.business.vo;

import java.io.Serializable;
import java.util.Date;

public class TodoLog implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6099654370288722111L;
	private Long id;
	private Long todoId;
	private Date logTime;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getTodoId() {
		return todoId;
	}

	public void setTodoId(Long todoId) {
		this.todoId = todoId;
	}

	public Date getLogTime() {
		return logTime;
	}

	public void setLogTime(Date logTime) {
		this.logTime = logTime;
	}
}
