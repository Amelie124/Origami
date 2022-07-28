package com.example.demo.service;

import com.example.demo.DAO.CategorieDAO;
import com.example.demo.model.Categorie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CategorieServiceImp implements CategorieService {

    @Autowired
    CategorieDAO categorieDAO;


    @Override
    public Categorie saveCategorie(Categorie cat) {
        return categorieDAO.save(cat);
    }

    @Override
    public Categorie updateCategorie(Categorie cat) {
        return categorieDAO.save(cat);
    }

    @Override
    public void deleteCategorie(Categorie cat) {
        categorieDAO.delete(cat);
    }

    @Override
    public void deleteByIDCategorie(Long id) {
        categorieDAO.deleteById(id);

    }

    @Override
    public Categorie getCategorie(Long id) {
        return categorieDAO.findById(id).get();
    }

    @Override
    public List<Categorie> getAllCategorie() {
        return categorieDAO.findAll();
    }
}
