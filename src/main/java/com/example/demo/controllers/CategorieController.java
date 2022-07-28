package com.example.demo.controllers;

import com.example.demo.model.Categorie;
import com.example.demo.service.CategorieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class CategorieController {

    @Autowired
    CategorieService categorieService;
    @RequestMapping(value ="/createCategorie",method = RequestMethod.GET )
    public String showCreate()
    {
        return "createCategorie";
    }
    @RequestMapping(value ="/saveCategorie",method = RequestMethod.POST)
    public String saveCategorie(@ModelAttribute Categorie categorie)
    {
        categorieService.saveCategorie(categorie);
        return "listCategorie";
    }
    @RequestMapping(value ="/listCategorie",method = RequestMethod.GET )
    public String showlist( Model model)
    {
        model.addAttribute("list",categorieService.getAllCategorie());

        return "listCategorie";
    }
    @RequestMapping(value ="/Categorie/{id}",method = RequestMethod.GET )
    public String showcategorie(@PathVariable("id") Long id,Model model)
    {
        model.addAttribute("list",categorieService.getCategorie(id));

        return "listCategorie";
    }
    @RequestMapping(value ="/updateCategorie/{id}",method = RequestMethod.GET )
    public String showUpdate(@PathVariable("id") Long id,Model model)
    {
        model.addAttribute("list",categorieService.getCategorie(id));


        return "updateCategorie";
    }
    @RequestMapping(value ="/saveCategorie",method = RequestMethod.PUT)
    public String saveCategory(@ModelAttribute Categorie categorie)
    {
        categorieService.saveCategorie(categorie);
        return "listCategorie";
    }

}
