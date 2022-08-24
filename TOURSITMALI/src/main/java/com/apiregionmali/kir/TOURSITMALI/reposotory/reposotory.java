package com.apiregionmali.kir.TOURSITMALI.reposotory;

import com.apiregionmali.kir.TOURSITMALI.modele.pays;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface reposotory extends JpaRepository<pays, Integer> {
    @Query(value = "select localité from pays where id = 3 ",nativeQuery = true)
    Iterable<Object[]>getRegionSansP();


}
