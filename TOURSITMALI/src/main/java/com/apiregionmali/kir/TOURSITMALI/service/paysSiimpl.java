package com.apiregionmali.kir.TOURSITMALI.service;

import com.apiregionmali.kir.TOURSITMALI.modele.pays;
import com.apiregionmali.kir.TOURSITMALI.reposotory.reposotory;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class paysSiimpl implements paysservicees{

    @Autowired
    private final reposotory reposotory;

    @Override
    public pays modifier(int id, pays pays) {

        return reposotory.findById(id)
                .map(v-> {

            v.setNom(pays.getNom());
            v.setLocalite(pays.getLocalite());
             return reposotory.save(v);

        }).orElseThrow(() -> new RuntimeException("PAYS NON TROUVER"));
    }

    @Override

    public pays creer(pays Pays) {
        return reposotory.save(Pays);
    }

    @Override
    public List<pays> lire() {
        return reposotory.findAll();
    }

    @Override
    public String supprimer(int id) {
        reposotory.deleteById(id);
        return "pays supprimer";
    }
}
