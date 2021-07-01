package com.exam.nguyenhoanglinh.service;

import com.exam.nguyenhoanglinh.entity.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAllProducts();
    Product addProduct(Product p);
    Product sellProduct(int id , int q);
}
