package com.in.springbootproject.test;

import com.in.springbootproject.entity.Product;
import com.in.springbootproject.repo.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class ProductRunner implements CommandLineRunner{

    @Autowired
    private ProductRepository repo;

    @Override
    public void run(String... args) throws Exception {
        System.out.println(repo.getClass().getName());

        Product p1 = new Product(1,"Mobile",3456.0);
        Product p2 = new Product(2,"TV",5000.0);
        Product p3 = new Product(3,"Watch",3000.0);
        //repo.save(p1);

        repo.saveAll(Arrays.asList(p1,p2,p3));

        Iterable<Product> data = repo.findAll();

        for(Product temp:data){
            System.out.println(temp);
        }

        System.out.println(repo.existsById(3));
        System.out.println(repo.count());//return noof records


    }
}
