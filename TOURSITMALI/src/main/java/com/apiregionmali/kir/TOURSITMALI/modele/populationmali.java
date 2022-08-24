package com.apiregionmali.kir.TOURSITMALI.modele;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "Populationmali")
@Getter
@Setter

public class populationmali{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int nbre_habitants;

    private int Année;
    private  String langueparler;
    private  String activités;

    @ManyToOne
    private regions regionskire ;



}
