package com.apiregionmali.kir.TOURSITMALI.modele;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="pays")
@Getter
@Setter
@NoArgsConstructor
public class pays {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nom;
    private String localite;

}
