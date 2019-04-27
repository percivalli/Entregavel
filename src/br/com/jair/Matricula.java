package br.com.jair;

import java.util.Date;

public class Matricula {

    private Aluno aluno;
    private Curso curso;
    private Date dataDeMatricula;

    public Matricula(Aluno aluno, Curso curso) {
        this.aluno = aluno;
        this.curso = curso;
        this.dataDeMatricula = new Date();
    }
}
