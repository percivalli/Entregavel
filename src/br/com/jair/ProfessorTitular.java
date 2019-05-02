package br.com.jair;

public class ProfessorTitular extends Professor {
    private String especialidade;

    public ProfessorTitular(String nome, String sobrenome, int codigo, String especialidade) {
        super(nome, sobrenome, 0, codigo);
        this.especialidade = especialidade;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}

