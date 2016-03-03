package com.backend.service.api;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.springframework.stereotype.Service;

import com.backend.business.service.TodoService;
import com.backend.business.vo.TodoInfo;
import com.backend.business.vo.TodoLog;
import com.backend.service.vo.ResultData;

@Path("/todo")
@Produces(MediaType.APPLICATION_JSON)
@Service
public class TodoApi {

	@Resource
	private TodoService todoService;

	@GET
	public ResultData getTodoList(@QueryParam(value = "query") String query) {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("querystring", query);
		List<TodoInfo> list = todoService.getTodoList(params);
		return new ResultData(ResultData.SUCC_STATUS, list);
	}

	@Path("/giveup")
	@GET
	public ResultData getGiveupList(@QueryParam(value = "query") String query) {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("querystring", query);
		List<TodoInfo> list = todoService.getGiveupList(params);
		return new ResultData(ResultData.SUCC_STATUS, list);
	}

	@Path("/{id}")
	@GET
	public ResultData getTodoInfo(@PathParam(value = "id") Long id) {
		TodoInfo info = todoService.getTodoInfo(id);
		return new ResultData(ResultData.SUCC_STATUS, info);
	}

	@POST
	public ResultData addTodoInfo(TodoInfo info) {
		int result = todoService.addTodoInfo(info);
		if (result > 0) {
			return new ResultData(ResultData.SUCC_STATUS, ResultData.SUCC_MSG);
		} else {
			return new ResultData(ResultData.FAIL_STATUS, ResultData.FAIL_MSG);
		}
	}

	@PUT
	public ResultData updateTodoInfo(TodoInfo info) {
		int result = todoService.updateTodoInfo(info);
		if (result > 0) {
			return new ResultData(ResultData.SUCC_STATUS, ResultData.SUCC_MSG);
		} else {
			return new ResultData(ResultData.FAIL_STATUS, ResultData.FAIL_MSG);
		}
	}

	@Path("/{id}")
	@DELETE
	public ResultData deleteTodoInfo(@PathParam(value = "id") Long id) {
		int result = todoService.deleteTodoInfo(id);
		if (result > 0) {
			return new ResultData(ResultData.SUCC_STATUS, ResultData.SUCC_MSG);
		} else {
			return new ResultData(ResultData.FAIL_STATUS, ResultData.FAIL_MSG);
		}
	}

	@Path("/log")
	@POST
	public ResultData addTodoLog(TodoLog todoLog) {
		int result = todoService.addTodoLog(todoLog);
		if (result > 0) {
			return new ResultData(ResultData.SUCC_STATUS, ResultData.SUCC_MSG);
		} else {
			return new ResultData(ResultData.FAIL_STATUS, ResultData.FAIL_MSG);
		}
	}

	@Path("/log/{id}")
	@GET
	public ResultData getTodoLogList(@PathParam(value = "id") Long id) {
		List<TodoLog> list = todoService.getTodoLogList(id);
		return new ResultData(ResultData.SUCC_STATUS, list);
	}
}
