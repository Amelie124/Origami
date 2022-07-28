package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="produit")

public class Produit {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column (name="idProduit")
    private Long id;
    @Column (name= "nomProduit")
    private String nom;
    @Column
    private Double prixProduit;
    @Column
    private Date dateCreation;
    @ManyToOne
    private Categorie categorie;
}
