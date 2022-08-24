package com.apiregionmali.kir.TOURSITMALI.service;

import com.apiregionmali.kir.TOURSITMALI.modele.pays;

import java.util.List;

public interface paysservicees {

    pays modifier  (int id, pays pays);

    pays creer (pays Pays );
    List<pays> lire();

    String supprimer(int id);

}
