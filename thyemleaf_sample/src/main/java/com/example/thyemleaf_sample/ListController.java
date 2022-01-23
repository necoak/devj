package com.example.thyemleaf_sample;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
public class ListController {

    @GetMapping("/list")
    public String list(Model model) {

        ProductList productList  = new ProductList();
        List<Product> products = new ArrayList<Product>();

        // procuct1
        Product product1 = new Product();
        product1.setName("りんご");
        product1.setPrice(100);
        product1.setCost(20);
        product1.setDescription("青森産のサンつがるです");

        // product2
        Product product2 = new Product();
        product1.setName("なし");
        product1.setPrice(200);
        product1.setCost(90);
        product1.setDescription("福島産の幸水です");

        products.add(product1);
        products.add(product2);

        model.addAttribute("products" , products);
        return "list";
    }

    @PostMapping("/list")
    public String shoList(@ModelAttribute ProductList productList){
        return "showList";
    }

    @PostMapping(value = "/list/edit", params="add")
    public String addList(@ModelAttribute List<Product> products, Model model){
        products.add(new Product());
        return  "list";
    }

    /*
    @PostMapping(value = "/list/edit", params="remove")
    public String removeList(
            @ModelAttribute ProductList productList, Model model, HttpServletRequest request){
        int index = Integer.valueOf(request.getParameter("remove"));
        productList.removeList(index);
        return "list";
    }
*/
}
