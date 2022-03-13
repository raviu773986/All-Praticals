package com.ru.product.servlet;

import javax.servlet.http.HttpServlet;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ru.product.bo.ProductBOimpl;
import com.ru.product.dto.Product;


public class CreateProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Integer id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		String description = request.getParameter("description");
		Integer price = Integer.parseInt(request.getParameter("description"));
		
		Product product = new Product();
		product.setId(id);
		product.setName(name);
		product.setDescription(description);
		product.setPrice(price);
		
		ProductBOimpl bo = new ProductBOimpl();
		bo.create(product);
		
		PrintWriter out = response.getWriter();
		out.print("product created");
		
	}

}
