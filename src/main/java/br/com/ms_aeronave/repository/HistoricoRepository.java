package br.com.ms_aeronave.repository;

import br.com.ms_aeronave.model.HistoricoUtilizacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HistoricoRepository extends JpaRepository<HistoricoUtilizacao, Long> {}