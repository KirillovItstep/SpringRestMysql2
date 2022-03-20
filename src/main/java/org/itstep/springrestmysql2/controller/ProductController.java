package org.itstep.springrestmysql2.controller;

import org.itstep.springrestmysql2.model.Product;
import org.itstep.springrestmysql2.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import java.util.ArrayList;
import java.util.List;

@Controller
public class ProductController {


    @RequestMapping(value = { "/", "/index" }, method = RequestMethod.GET)
    public String index(Model model) {
        return "index";
    }

    @RequestMapping(value = { "/addProduct" }, method = RequestMethod.GET)
    public String showAddProductPage(Model model) {
        Product product = new Product();
        model.addAttribute("product", product);
        return "addProduct";
    }
}
