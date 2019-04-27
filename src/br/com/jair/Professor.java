package br.com.jair;

import java.util.Objects;

public class Professor {

    private String nome;
    private String sobrenome;
    private Integer RP;

    public Professor(String nome, String sobrenome, Integer RP) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.RP = RP;
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

    public Integer getRP() {
        return RP;
    }

    public void setRP(Integer RP) {
        this.RP = RP;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Professor professor = (Professor) o;
        return Objects.equals(RP, professor.RP);
    }

}
