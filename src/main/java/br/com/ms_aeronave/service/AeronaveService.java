package br.com.ms_aeronave.service;

import br.com.ms_aeronave.model.Aeronave;
import br.com.ms_aeronave.repository.AeronaveRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class AeronaveService {

    private final AeronaveRepository aeronaveRepository;


    public AeronaveService(AeronaveRepository aeronaveRepository) {
        this.aeronaveRepository = aeronaveRepository;
    }

    // RF11 + RF12
    public Aeronave cadastrar(Aeronave aeronave) {
        return aeronaveRepository.save(aeronave);
    }

    /*
    // RF13 + RF14
    public Voo associarAeronave(Long codigo, Long aeronaveId) {
        Voo voo = vooRepository.findById(codigo)
                .orElseThrow(() -> new RuntimeException("Voo não encontrado"));

        Aeronave aeronave = aeronaveRepository.findById(aeronaveId)
                .orElseThrow(() -> new RuntimeException("Aeronave não encontrada"));


        return voo;
    }
    
     */

}