package com.example.databaseApplication.services;

import com.example.databaseApplication.entities.Category;
import com.example.databaseApplication.entities.Product;
import com.example.databaseApplication.entities.User;
import com.example.databaseApplication.repositories.CategoryRepository;
import com.example.databaseApplication.repositories.ProductRepository;
import com.example.databaseApplication.repositories.UserRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class ProductService {

    private final ProductRepository productRepository;
    private final CategoryRepository categoryRepository;
    private final UserRepository userRepository;

    public ProductService(ProductRepository productRepository, CategoryRepository categoryRepository, UserRepository userRepository) {
        this.productRepository = productRepository;
        this.categoryRepository = categoryRepository;
        this.userRepository = userRepository;
    }

    public void createProductAndCategory() {
        Category category = new Category();
        category.setName("newCategory2");

        Product product = new Product();
        product.setName("newProduct2");
        product.setDescription("newProduct description2");
        product.setPrice(new BigDecimal("50"));
        product.setCategory(category);
        category.addProduct(product);

        productRepository.save(product);
    }

    @Transactional
    public void createProduct() {
        Category category = categoryRepository.findById(Byte.parseByte("1")).orElseThrow();
        Product product = new Product();
        product.setName("new Product 3");
        product.setDescription("new Product 3 description");
        product.setPrice(new BigDecimal("50"));
        product.setCategory(category);
        category.addProduct(product);
        productRepository.save(product);
    }

    @Transactional
    public void addProductsToWishlist() {
        User user = userRepository.findById(2L).orElseThrow();
        System.out.println(user);
    }

    @Transactional
    public void deleteProduct() {
        Product product = productRepository.findById(1L).orElseThrow();
        userRepository.findAll().forEach(user -> user.removeProductFromWishlist(product));
        categoryRepository.findAll().forEach(category -> category.removeProduct(product));
        productRepository.delete(product);
    }
}
