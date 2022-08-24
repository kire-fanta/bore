package com.apiregionmali.kir.TOURSITMALI.service;

import com.apiregionmali.kir.TOURSITMALI.modele.populationmali;
import com.apiregionmali.kir.TOURSITMALI.reposotory.reposotorypopulation;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
@AllArgsConstructor
public class implpopulation implements populationservice{

    @Autowired
    private final reposotorypopulation rp;
    @Override
    public populationmali modifier(int id, populationmali pop) {
        return rp.findById(id)
                .map(p-> {
            p.setNbre_habitants(pop.getNbre_habitants());
            p.setLangueparler(pop.getLangueparler());
            p.setAnnée(pop.getAnnée());
            p.setActivités(pop.getActivités());

            return rp.save(p);
    }).orElseThrow(()-> new RuntimeException("Population non existe"));
    }

    @Override
    public populationmali creer(populationmali pop) {
        return rp.save(pop);
    }


    @Override
    public List<populationmali> lire() {
        return rp.findAll();
    }

    @Override
    public String supprimer(int id) {
         rp.deleteById(id);
         return "Pop sup";
    }
}
