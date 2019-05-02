package br.com.jair;

import java.util.Objects;

public class Professor {

    private String nome;
    private String sobrenome;
    private Integer tempoCasa;
    private Integer codigo;

    public Professor(String nome, String sobrenome, Integer tempoCasa, Integer codigo) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.tempoCasa = tempoCasa;
        this.codigo = codigo;
    }

    public Professor() {
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
        return tempoCasa;
    }

    public void setRP(Integer RP) {
        this.tempoCasa = tempoCasa;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Professor" +
                "\nNome: " + nome +
                "\nSobrenome: " + sobrenome +
                "\nCódigo: " + codigo + "\n";

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Professor professor = (Professor) o;
        return Objects.equals(codigo, professor.codigo);
    }

}
