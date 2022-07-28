package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="categorie")
public class Categorie {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column (name="idCategorie")
    private Long id;
    @Column (name="nomCategorie")
    private String nom;
    @Column(name="prenomCategorie")
    private String prenom;
    @Column(name="telCategorie")
    private String telephone;
    @Column(name="emailCategorie")
    private String email;



}
