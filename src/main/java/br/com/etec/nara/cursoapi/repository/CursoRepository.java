package br.com.etec.nara.cursoapi.repository;

import br.com.etec.nara.cursoapi.model.Curso;
import br.com.etec.nara.cursoapi.repository.curso.CursoRepositoryQuery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CursoRepository extends JpaRepository<Curso, Integer>, CursoRepositoryQuery {
}
