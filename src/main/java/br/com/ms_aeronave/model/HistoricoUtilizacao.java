package br.com.ms_aeronave.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class HistoricoUtilizacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /*
    @ManyToOne
    private Aeronave aeronave;

    @ManyToOne
    private Voo voo;

     */

    private LocalDateTime dataUso;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getDataUso() {
        return dataUso;
    }

    public void setDataUso(LocalDateTime dataUso) {
        this.dataUso = dataUso;
    }
}