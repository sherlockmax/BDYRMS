package com.bdy.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.bdy.model.BdyDiscount;
import com.bdy.model.BdyFood;
import com.bdy.model.BdyFoodkind;
import com.bdy.model.BdySetdetail;
import com.bdy.service.ManageService;
@WebServlet("/secure/updatefoodkind")
public class ManageUpdateFoodKindServlet extends HttpServlet {

	
	ManageService service;
	
	@Override
	public void init() throws ServletException {
		WebApplicationContext context = WebApplicationContextUtils
				.getRequiredWebApplicationContext(this.getServletContext());
		service = (ManageService)context.getBean("ManageService");
	}

	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		this.doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		List<BdySetdetail> detail = service.getAllDetail();
		List<BdyDiscount> discount = service.getAllDiscount();
		List<BdyFood> foods = service.getAllFood();
		
		String fkId = request.getParameter("fkId");
		String fkname = request.getParameter("fkname");
		String fkperiod = request.getParameter("fkperiod");
		String fkma = request.getParameter("fkma");
		String fkseq = request.getParameter("fkseq");		
		int id = Integer.parseInt(fkId);
		Double period = Double.parseDouble(fkperiod);
		int ma = Integer.parseInt(fkma);
		int seq = Integer.parseInt(fkseq);
		
		List<BdyFoodkind> foodkind = service.updateFoodKind(id,fkname, period, ma, seq);
		request.setAttribute("pags", "2");
		request.setAttribute("resultFood", foods);
		request.setAttribute("resultDetail", detail);
		request.setAttribute("resultdiscount", discount);
		request.setAttribute("resultfoodkind", foodkind);
		request.getRequestDispatcher("/secure/manageIndex.jsp").forward(request, response);
	}

	
}
