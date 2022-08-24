package com.apiregionmali.kir.TOURSITMALI.modele;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="regions")
@Getter
@Setter
@NoArgsConstructor
public class regions {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nom;
    private String localite;
    private String superficie;
    private String langue;
    private String domaine;
    @ManyToOne
    private pays Pays;

}
