package com.example.demo.service;

import com.example.demo.model.Categorie;

import java.util.List;

public interface CategorieService {

Categorie saveCategorie(Categorie cat);
Categorie updateCategorie(Categorie cat);
public void deleteCategorie(Categorie cat);
public void deleteByIDCategorie(Long id);
Categorie getCategorie(Long id);
List<Categorie> getAllCategorie();

}
