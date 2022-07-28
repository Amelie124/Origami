package com.example.demo.controllers;

import com.example.demo.model.Categorie;
import com.example.demo.service.CategorieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CategorieController {

    @Autowired
    CategorieService categorieService;
    @RequestMapping(value ="/showCreate",method = RequestMethod.GET )
    public String showCreate()
    {
        return "createCategorie";
    }


    @RequestMapping(value ="/saveCategorie",method = RequestMethod.POST)
    public String saveCategorie(@ModelAttribute Categorie categorie)
    {

         categorieService.saveCategorie(categorie);

        return "createCategorie";
    }
}
