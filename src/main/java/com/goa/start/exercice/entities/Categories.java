package com.goa.start.exercice.entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Categories implements Serializable {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;
    private String Nom;
    private int Qt;
    @Temporal(TemporalType.DATE)
    private Date Date_Creation;
    @Temporal(TemporalType.DATE)
    private Date Date_modif;

}
