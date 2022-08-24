package com.apiregionmali.kir.TOURSITMALI.service;

import com.apiregionmali.kir.TOURSITMALI.modele.populationmali;
import com.apiregionmali.kir.TOURSITMALI.modele.regions;

import java.util.List;

public interface populationservice {
    populationmali modifier (int id,  populationmali  population);
   populationmali creer (  populationmali population );
    List<populationmali> lire( );
    String supprimer (int id );
}

