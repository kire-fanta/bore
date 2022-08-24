package com.apiregionmali.kir.TOURSITMALI.service;

import com.apiregionmali.kir.TOURSITMALI.modele.regions;
import com.apiregionmali.kir.TOURSITMALI.reposotory.reposotoryregions;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@AllArgsConstructor
@Service
public class regionServiceImpl implements regionService {

    final private reposotoryregions RegionRepos;
    @Override
    public regions CreerRegion(regions Region) {
        return null;
    }

    @Override
    public List<regions> Lire() {
        return null;
    }

    @Override
    public regions modifier(int id, regions Region) {
        return RegionRepos.findById(id).map(r->{

        });
    }

    @Override
    public String supprimer(long id) {
        return null;
    }
}
