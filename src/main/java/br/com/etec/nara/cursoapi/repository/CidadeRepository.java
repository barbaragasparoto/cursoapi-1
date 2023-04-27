package br.com.etec.nara.cursoapi.repository;

import br.com.etec.nara.cursoapi.model.Cidade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CidadeRepository extends JpaRepository<Cidade, Integer> {
}
