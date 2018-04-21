package com.dex.model;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class KontniOkvir {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long kontniOkvirID;
    private String konto;
    private String nazivKonta;
    private String kontoCetvorocifreni;
    private String kontoSestocifreni;
    private String analitickiKonto;

}
