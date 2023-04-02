package com.subhadip.microservice1.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.subhadip.microservice1.dto.ProductRequestDTO;
import com.subhadip.microservice1.dto.ProductResponseDTO;
import com.subhadip.microservice1.model.Product;
import com.subhadip.microservice1.repository.ProductRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    public void createProduct(ProductRequestDTO productRequest) {
        Product product = Product.builder()
                .name(productRequest.getName())
                .description(productRequest.getDescription())
                .price(productRequest.getPrice())
                .build();
        productRepository.save(product);

    }

    private ProductResponseDTO mapToProductResponseDTO(Product dbProduct) {
        ProductResponseDTO productResponse = ProductResponseDTO.builder()
                .id(dbProduct.getId())
                .name(dbProduct.getName())
                .description(dbProduct.getDescription())
                .price(dbProduct.getPrice())
                .build();
        return productResponse;
    }

    public List<ProductResponseDTO> getAllProduct() {
        List<Product> dbProducts = productRepository.findAll();

        return dbProducts.stream().map(product -> mapToProductResponseDTO(product)).toList();
        // this is the use of Lambda method
        // both same 
        // return dbProducts.stream().map(this::mapToProductResponseDTO).toList();
    }

}
