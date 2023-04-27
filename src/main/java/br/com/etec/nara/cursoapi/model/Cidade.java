package br.com.etec.nara.cursoapi.model;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "cidade")
public class Cidade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer idcidade;
    private String nomecidade;
    private String uf;

    public List<Aluno> getAlunocidade() {
        return alunocidade;
    }

    public void setAlunocidade(List<Aluno> alunocidade) {
        this.alunocidade = alunocidade;
    }

    @JsonIgnore
    @OneToMany(mappedBy = "cidade")
    private List<Aluno> alunocidade = new ArrayList<>();

    public Integer getId() {
        return idcidade;
    }

    public void setId(Integer id) {
        this.idcidade = id;
    }

    public String getNomecidade() {
        return nomecidade;
    }

    public void setNomecidade(String nomecidade) {
        this.nomecidade = nomecidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cidade cidade = (Cidade) o;
        return idcidade.equals(cidade.idcidade);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idcidade);
    }
}
