package com.ru.product.bo;

import com.ru.product.dao.ProductDAO;
import com.ru.product.dao.ProductDAOimpl;
import com.ru.product.dto.Product;

public class ProductBOimpl implements ProductBo {
	private static ProductDAO dao = new ProductDAOimpl();

	@Override
	public void create(Product product) {
		dao.create(product);
	}

	@Override
	public Product findProduct(int id) {
		return dao.read(id);
	}

}
