package br.com.ms_aeronave.service;

import br.com.ms_aeronave.model.Aeronave;
import br.com.ms_aeronave.model.HistoricoUtilizacao;
import br.com.ms_aeronave.model.Voo;
import br.com.ms_aeronave.repository.AeronaveRepository;
import br.com.ms_aeronave.repository.HistoricoRepository;
import br.com.ms_aeronave.repository.vooRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class AeronaveService {

    private final AeronaveRepository aeronaveRepository;
    private final vooRepository vooRepository;
    private final HistoricoRepository historicoRepository;

    public AeronaveService(AeronaveRepository aeronaveRepository, vooRepository vooRepository,
                           HistoricoRepository historicoRepository) {
        this.aeronaveRepository = aeronaveRepository;
        this.vooRepository = vooRepository;
        this.historicoRepository = historicoRepository;
    }

    // RF11 + RF12
    public Aeronave cadastrar(Aeronave aeronave) {
        return aeronaveRepository.save(aeronave);
    }

    // RF13 + RF14
    public Voo associarAeronave(Long codigo, Long aeronaveId) {
        Voo voo = vooRepository.findById(codigo)
                .orElseThrow(() -> new RuntimeException("Voo não encontrado"));

        Aeronave aeronave = aeronaveRepository.findById(aeronaveId)
                .orElseThrow(() -> new RuntimeException("Aeronave não encontrada"));

       // voo.setAeronave(aeronave);
        vooRepository.save(voo);

        // RF14 - registrar histórico
        HistoricoUtilizacao historico = new HistoricoUtilizacao();
      //  historico.setAeronave(aeronave);
     ///   historico.setVoo(voo);
        historico.setDataUso(LocalDateTime.now());

        historicoRepository.save(historico);

        return voo;
    }

}