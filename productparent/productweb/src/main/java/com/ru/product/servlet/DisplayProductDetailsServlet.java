package com.ru.product.servlet;

import javax.servlet.http.HttpServlet;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ru.product.bo.ProductBOimpl;
import com.ru.product.dto.Product;


public class DisplayProductDetailsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ProductBOimpl bo = new ProductBOimpl();
		Product product = bo.findProduct(Integer.parseInt(request.getParameter("id")));
		
		PrintWriter out = response.getWriter();
		out.print("Product details");
		out.print("product Id: " + product.getId());
		out.print("product Id: " + product.getName());
		out.print("product Id: " + product.getDescription());
		out.print("product Id: " + product.getPrice());
		
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

}
