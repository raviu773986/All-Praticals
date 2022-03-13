package com.ru.product.bo;

import com.ru.product.dto.Product;

public interface ProductBo {
	void create(Product product);
	
	Product findProduct(int id);
	

}
