package com.backend.business.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.backend.business.dao.TodoMapper;
import com.backend.business.vo.TodoInfo;
import com.backend.business.vo.TodoLog;

@Service
public class TodoService {

	@Resource
	private TodoMapper todoMapper;

	public List<TodoInfo> getTodoList(Map<String, Object> params) {
		return todoMapper.getTodoList(params);
	}

	public List<TodoInfo> getGiveupList(Map<String, Object> params) {
		return todoMapper.getGiveupList(params);
	}

	public TodoInfo getTodoInfo(Long id) {
		return todoMapper.getTodoInfo(id);
	}

	public int addTodoInfo(TodoInfo info) {
		return todoMapper.addTodoInfo(info);
	}

	public int updateTodoInfo(TodoInfo info) {
		return todoMapper.updateTodoInfo(info);
	}

	public int deleteTodoInfo(Long id) {
		return todoMapper.deleteTodoInfo(id);
	}

	public int addTodoLog(TodoLog todoLog) {
		return todoMapper.addTodoLog(todoLog);
	}

	public List<TodoLog> getTodoLogList(Long id) {
		return todoMapper.getTodoLogList(id);
	}
}
