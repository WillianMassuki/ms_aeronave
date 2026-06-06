package br.com.ms_aeronave.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Passageiro {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long codigoPassageiro;
}
