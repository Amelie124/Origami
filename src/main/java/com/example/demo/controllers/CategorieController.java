package com.example.demo.controllers;

import com.example.demo.model.Categorie;
import com.example.demo.service.CategorieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CategorieController {

    @Autowired
    CategorieService categorieService;
    @RequestMapping("/showCreate")
    public String showCreate()
    {
        return "createCategorie";
    }
    @RequestMapping("/saveCategorie")
    public String saveCategorie(@ModelAttribute("categorie") Categorie categorie,
                               ModelMap modelMap)
    {

        Categorie saveCategorie = categorieService.saveCategorie(categorie);

        return "createCategorie";
    }
}
