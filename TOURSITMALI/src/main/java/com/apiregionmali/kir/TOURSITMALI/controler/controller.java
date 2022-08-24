package com.apiregionmali.kir.TOURSITMALI.controler;


import com.apiregionmali.kir.TOURSITMALI.modele.pays;
import com.apiregionmali.kir.TOURSITMALI.service.paysservicees;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import org.hibernate.sql.Update;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Api(value = "hello", description = "Sample hello world application")
@RequestMapping("/kire")
@AllArgsConstructor

public class controller {
    private final paysservicees Payservice;
    // @ApiOperation =swagger documatation
    @ApiOperation(value = "Just to test the sample test api of My App Service")
    @PostMapping("/create")
    public pays create (@RequestBody pays Pays ){
        return Payservice.creer(Pays);
    }

    @ApiOperation(value = "Just to test the sample test api of My App Service")
    @GetMapping("/read")
    public List <pays> read() {
        return Payservice.lire();

    }

    @ApiOperation(value = "modif kire")
    @PutMapping ("/update/{id}")
    public  pays Update(@PathVariable int id, pays Pays){
        return Payservice.modifier(id,Pays);
    }

    @ApiOperation(value = "Just to test the sample test api of My App Service")
    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable int id ){
        return Payservice.supprimer(id);



    }
}
