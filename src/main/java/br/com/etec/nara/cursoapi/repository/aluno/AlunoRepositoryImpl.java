package br.com.etec.nara.cursoapi.repository.aluno;

import br.com.etec.nara.cursoapi.model.Aluno;
import br.com.etec.nara.cursoapi.model.Curso;
import br.com.etec.nara.cursoapi.repository.filter.ALunoFilter;
import br.com.etec.nara.cursoapi.repository.projections.AlunoDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;


public class AlunoRepositoryImpl implements AlunoRepositoryQuery{

    @PersistenceContext
    private EntityManager manager;

    @Override
    public Page<AlunoDto> filtrar (ALunoFilter aLunoFilter, Pageable pageable) {

        CriteriaBuilder builder = manager.getCriteriaBuilder();
        CriteriaQuery<AlunoDto> criteria = builder.createQuery(AlunoDto.class);
        Root<Aluno> root = criteria.from(Aluno.class);

        criteria.select(builder.construct(AlunoDto.class
        , root.get("id")
                , root.get("nomealuno")
                , root.get("cidade").get("nomecidade")
                , root.get("cidade").get("uf")
                , root.get("curso").get("nomecurso")

        ));


        Predicate[] predicates = criarRestricoes(alunoFilter, builder, root);
        criteria.where(predicates);
        criteria.orderBy(builder.asc(root.get("nomealuno")));

        TypedQuery<AlunoDto> query = manager.createQuery(criteria);
        adicionarRestricoesDePaginacao(query, pageable);


    }

    private void adicionarRestricoesDePaginacao(TypedQuery<AlunoDto> query, Pageable pageable) {
    }

}
