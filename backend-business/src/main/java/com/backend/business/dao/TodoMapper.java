package com.backend.business.dao;

import java.util.List;
import java.util.Map;

import com.backend.business.vo.TodoInfo;
import com.backend.business.vo.TodoLog;

public interface TodoMapper {

	List<TodoInfo> getTodoList(Map<String, Object> params);

	List<TodoInfo> getGiveupList(Map<String, Object> params);

	TodoInfo getTodoInfo(Long id);

	int addTodoInfo(TodoInfo info);

	int updateTodoInfo(TodoInfo info);

	int deleteTodoInfo(Long id);

	int addTodoLog(TodoLog todoLog);

	List<TodoLog> getTodoLogList(Long id);
}
