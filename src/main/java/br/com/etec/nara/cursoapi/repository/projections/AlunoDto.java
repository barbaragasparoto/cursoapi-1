package br.com.etec.nara.cursoapi.repository.projections;

public class AlunoDto {

    private Long id;
    private String nomealuno;
    private String nomeciadde;
    private String uf;
    private String nomecurso;

    public AlunoDto(Long id, String nomealuno, String nomeciadde, String uf, String nomecurso) {
        this.id = id;
        this.nomealuno = nomealuno;
        this.nomeciadde = nomeciadde;
        this.uf = uf;
        this.nomecurso = nomecurso;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomealuno() {
        return nomealuno;
    }

    public void setNomealuno(String nomealuno) {
        this.nomealuno = nomealuno;
    }

    public String getNomeciadde() {
        return nomeciadde;
    }

    public void setNomeciadde(String nomeciadde) {
        this.nomeciadde = nomeciadde;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getNomecurso() {
        return nomecurso;
    }

    public void setNomecurso(String nomecurso) {
        this.nomecurso = nomecurso;
    }
}
