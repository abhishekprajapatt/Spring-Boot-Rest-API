package com.getuready.service;

import java.util.List;

import com.getuready.dto.ProductDto;
import com.getuready.dto.ProductResponse;
//import com.getuready.model.Product;

public interface ProductService {

	public Boolean saveProduct(ProductDto productDto);

	public List<ProductDto> getAllProducts();

	public ProductDto getProductById(Integer id);

	public Boolean deleteProduct(Integer id);

	public ProductResponse getProductsWithPagination(int pageNo, int pageSize, String sortBy, String sortDir);

}