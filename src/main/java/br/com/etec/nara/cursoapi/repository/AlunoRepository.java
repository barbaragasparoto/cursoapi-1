package br.com.etec.nara.cursoapi.repository;

import br.com.etec.nara.cursoapi.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Long> {
}
