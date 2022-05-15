package com.onetrust.ecommerce.service;

import com.onetrust.ecommerce.models.Product;
import com.onetrust.ecommerce.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImple implements ProductService {

    public ProductServiceImple(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Autowired
    ProductRepository productRepository;

    @Override
    public Long createProduct(Product product) {


        return productRepository.save(product).getProd_id();
    }


    @Override
    public Product getProduct(Long id) {
        return productRepository.findById(id).orElseThrow(RuntimeException::new);
    }

    @Override
    public void deleteProduct(Long id) {
        productRepository.deleteById(id);

    }

    @Override
    public List<Product> getAllProducts() {

        return productRepository.findAll();

    }


    @Override
    public Product updateProduct(Long id, Product product) {

        Product oldProdcut = productRepository.findById(id).orElseThrow(RuntimeException::new);
        oldProdcut.setProd_name(product.getProd_name());
        oldProdcut.setPrice(product.getPrice());
        oldProdcut.setProd_desc(product.getProd_desc());
        oldProdcut.setProd_care_tip(product.getProd_care_tip());
        oldProdcut.setPlant_height(product.getPlant_height());
        oldProdcut.setPlant_width(product.getPlant_width());
        oldProdcut.setCategory_id(product.getCategory_id());
        oldProdcut.setUnits_in_stock(product.getUnits_in_stock());


        return productRepository.save(oldProdcut);
    }

    @Override
    public List<Product> getProductByCategory(String cat_id) {
        return productRepository.getProductByCategoryId(cat_id);
    }
}
//    public void testSave(){
//        productRepository.save(new Product(
//
//                "Fertilizer",
//                "Lorem Epsum " ,
//                "K ,Mg ,Ca",
//                150.0f,
//                "https://project-ingarden-images.s3.ap-south-1.amazonaws.com/kari-shea-tcgMBsW4zlU-unsplash.jpg",
//                20,
//                "1",
//                20.5f,
//                40.5f));
//
//
//    }
//}
