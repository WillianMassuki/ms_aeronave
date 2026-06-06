package br.com.ms_aeronave.model;

import br.com.ms_aeronave.enuns.StatusVoo;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Voo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;

    private String numeroVoo;

    private String LocalOrigem;

    private String LocalDestino;

    /*
    @ManyToOne
    @JoinColumn(name = "aeronave_id")
    private Aeronave aeronave;

     */

    /*
    @Enumerated(EnumType.STRING)
    private StatusVoo status;

     */

    /*
    @ManyToMany(mappedBy = "voo")
    private Set<Passageiro> passengers = new HashSet<>();

     */

    /*
    @ManyToOne
    @JoinColumn(name = "gate_id")
    private Portao portao;

     */

    @Column(nullable = false)
    private LocalDateTime dataHoraPrevistaSaida;

    @Column(nullable = false)
    private LocalDateTime dataHoraPrevistaChegada;

    private LocalDateTime horarioRealDecolagem;

    private LocalDateTime horarioRealPouso;

    /*
    @ManyToOne
    @JoinColumn(name = "companhia_id")
    private CompanhiaAerea companhiaAerea;

     */

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getNumeroVoo() {
        return numeroVoo;
    }

    public void setNumeroVoo(String numeroVoo) {
        this.numeroVoo = numeroVoo;
    }

    public String getLocalOrigem() {
        return LocalOrigem;
    }

    public void setLocalOrigem(String localOrigem) {
        LocalOrigem = localOrigem;
    }

    public String getLocalDestino() {
        return LocalDestino;
    }

    public void setLocalDestino(String localDestino) {
        LocalDestino = localDestino;
    }


    public LocalDateTime getDataHoraPrevistaSaida() {
        return dataHoraPrevistaSaida;
    }

    public void setDataHoraPrevistaSaida(LocalDateTime dataHoraPrevistaSaida) {
        this.dataHoraPrevistaSaida = dataHoraPrevistaSaida;
    }

    public LocalDateTime getDataHoraPrevistaChegada() {
        return dataHoraPrevistaChegada;
    }

    public void setDataHoraPrevistaChegada(LocalDateTime dataHoraPrevistaChegada) {
        this.dataHoraPrevistaChegada = dataHoraPrevistaChegada;
    }

    public LocalDateTime getHorarioRealDecolagem() {
        return horarioRealDecolagem;
    }

    public void setHorarioRealDecolagem(LocalDateTime horarioRealDecolagem) {
        this.horarioRealDecolagem = horarioRealDecolagem;
    }

    public LocalDateTime getHorarioRealPouso() {
        return horarioRealPouso;
    }

    public void setHorarioRealPouso(LocalDateTime horarioRealPouso) {
        this.horarioRealPouso = horarioRealPouso;
    }
}