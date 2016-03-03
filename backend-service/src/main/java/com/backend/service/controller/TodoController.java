package com.backend.service.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.backend.business.service.TodoService;
import com.backend.business.vo.TodoInfo;

@Controller
@RequestMapping("/todo")
public class TodoController {

	@Resource
	private TodoService todoService;

	@RequestMapping("/{query}")
	@ResponseBody
	public List<TodoInfo> getTodoList(@PathVariable String query) {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("querystring", query);
		List<TodoInfo> list = todoService.getTodoList(params);
		return list;
	}
}
