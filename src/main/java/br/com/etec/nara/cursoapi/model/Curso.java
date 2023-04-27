package br.com.etec.nara.cursoapi.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "curso")
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idcurso;

    private String nomecurso;

    public List<Aluno> getAlunocurso() {
        return alunocurso;
    }

    public void setAlunocurso(List<Aluno> alunocurso) {
        this.alunocurso = alunocurso;
    }

    @JsonIgnore
    @OneToMany(mappedBy = "curso")
    private List<Aluno> alunocurso = new ArrayList<>();


    public Integer getId() {
        return idcurso;
    }

    public void setId(Integer id) {
        this.idcurso = id;
    }

    public String getNomecurso() {
        return nomecurso;
    }

    public void setNomecurso(String nomecurso) {
        this.nomecurso = nomecurso;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Curso curso = (Curso) o;
        return idcurso.equals(curso.idcurso);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idcurso);
    }
}
