package br.com.etec.nara.cursoapi.repository.aluno;

import br.com.etec.nara.cursoapi.repository.filter.ALunoFilter;
import br.com.etec.nara.cursoapi.repository.projections.AlunoDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface AlunoRepositoryQuery {

    public Page<AlunoDto> filtrar(ALunoFilter aLunoFilter, Pageable pageable);

}
