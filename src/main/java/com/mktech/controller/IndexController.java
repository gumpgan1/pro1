package com.mktech.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ceshi.Getdataimpl;

import com.google.gson.Gson;

public class IndexController extends HttpServlet {
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		Getdataimpl bardao = new Getdataimpl();

		// 调用bardao的select_all()方法把从数据库中读取所有的数据返回的是一个ArrayList，ArrayList里面放的是一个barBean

		List array = bardao.getTotal();

		System.out.println(array);

		// 设置返回时的编码格式
		response.setContentType("text/html; charset=utf-8");

		// 调用JSONArray.fromObject方法把array中的对象转化为JSON格式的数组
		// JSONArray json = JSONArray.fromObject(array);

		// System.out.println(json.toString());
		Gson gson = new Gson();
		String json = gson.toJson(array);

		// 返回给前段页面
		// PrintWriter out = response.getWriter();
		// out.println(json);
		// out.flush();
		// out.close();
		response.setContentType("text/html; charset=utf-8");
		response.getWriter().write(json);

	}

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);

	}
}
