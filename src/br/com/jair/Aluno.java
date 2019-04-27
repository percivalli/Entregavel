package br.com.jair;

import java.util.Objects;

public class Aluno {
    private String nome;
    private String sobrenome;
    private Integer RA;

    public Aluno(String nome, String sobrenome, Integer RA) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.RA = RA;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public Integer getRA() {
        return RA;
    }

    public void setRA(Integer RA) {
        this.RA = RA;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return Objects.equals(RA, aluno.RA);
    }
}
