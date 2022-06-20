package com.goa.start.exercice.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jdk.jshell.Snippet;
import lombok.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder

public class Produit implements Serializable {
    public static Snippet builder;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String Nom;
    private int Qt;
    private Boolean Disponible;
    @Temporal(TemporalType.DATE)
    private Date Date_Creation;
    @Temporal(TemporalType.DATE)
    private Date Date_modif;
    @ManyToOne
    @JoinColumn(name = "categories_id")
    @JsonIgnore
    private Categories categories;


}
