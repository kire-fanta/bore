package com.apiregionmali.kir.TOURSITMALI.service;


import com.apiregionmali.kir.TOURSITMALI.modele.regions;


import java.util.List;

public interface regionService {
    regions CreerRegion(regions Region);
    List<regions> Lire();
    regions modifier(long id, regions Region);
    String supprimer(long id);
}
