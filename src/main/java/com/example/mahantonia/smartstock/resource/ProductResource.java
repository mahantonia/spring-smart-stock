package com.example.mahantonia.smartstock.resource;

import com.example.mahantonia.smartstock.model.Product;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
public class ProductResource {

    @GetMapping
    public String getAllProduct() {
        System.out.println(" Entrou no metodo GET");
        return "Lista de produtos";

    }

    @GetMapping("/{id}")
    public Product getProduct(@PathVariable("id") Long id) {
        System.out.println(id);

        Product p = new Product(1L, "Mouse" , "Mouse Gamer", 75f);
        return p;
    }

    @DeleteMapping("/{id}")
    public String deletProduct(@PathVariable("id") Long id) {
        return "Deletar produto";
    }

}
