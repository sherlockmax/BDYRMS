package com.bdy.controller;

import java.io.PrintWriter;
import java.util.List;

import javax.json.JsonArray;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.bdy.model.KitchenView;
import com.bdy.service.KitchenService;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;

public class KitchenViewAction extends ActionSupport implements ServletRequestAware,ServletResponseAware,Preparable {

	HttpServletRequest request;
	HttpServletResponse response;
	List<KitchenView> viewlist;
//	private String message;
//	
//	public String getMessage() {
//		return message;
//	}
//
//	public void setMessage(String message) {
//		this.message = message;
//	}

	public List<KitchenView> getViewlist() {
		return viewlist;
	}

	public void setViewlist(List<KitchenView> viewlist) {
		this.viewlist = viewlist;
	}

	@Override
	public void setServletResponse(HttpServletResponse response) {
		this.response = response;	
	}

	@Override
	public void setServletRequest(HttpServletRequest request) {
		this.request = request;		
	}
	KitchenService service;
	@Override
	public void prepare() throws Exception {
		WebApplicationContext context = WebApplicationContextUtils.getRequiredWebApplicationContext(ServletActionContext.getServletContext());
		service=(KitchenService)context.getBean("KitchenService");
	}

	@Override
	public String execute() throws Exception {
	viewlist=service.getAllOrderlistsForView();
//	message="Hello AJAX Struts2";
//	request.setAttribute("view",viewlist);
		return Action.SUCCESS;
	}



//	public void myExecute() throws Exception {
//		response.setContentType("text/html;charset=UTF-8");
//		PrintWriter out = response.getWriter();
//		JsonArray jsonArray = service.getAllOrderlists();
//		out.write(jsonArray.toString());
//	}
//	
	

}
