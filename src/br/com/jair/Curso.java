package br.com.jair;

import java.util.List;
import java.util.Objects;
import java.util.ArrayList;

public class Curso {

    private String nome;
    private Integer codigo;
    private ProfessorTitular professorTitular;
    private ProfessorAdjunto professorAdjunto;
    private Integer quantidadeMaxima;
    private List<Aluno> alunos;

    List<Aluno> aluno = new ArrayList<>();


    public Curso(String nome, Integer codigo, Integer quantidadeMaxima) {
        this.nome = nome;
        this.codigo = codigo;
        this.quantidadeMaxima = quantidadeMaxima;
    }

    public Curso() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public ProfessorTitular getProfessorTitular() {
        return professorTitular;
    }

    public void setProfessorTitular(ProfessorTitular professorTitular) {
        this.professorTitular = professorTitular;
    }

    public ProfessorAdjunto getProfessorAdjunto() {
        return professorAdjunto;
    }

    public void setProfessorAdjunto(ProfessorAdjunto professorAdjunto) {
        this.professorAdjunto = professorAdjunto;
    }

    public Integer getQuantidadeMaxima() {
        return quantidadeMaxima;
    }

    public void setQuantidadeMaxima(Integer quantidadeMaxima) {
        this.quantidadeMaxima = quantidadeMaxima;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    @Override
    public String toString() {
        return "Curso" +
                "\nNome: " + this.nome +
                "\nCódigo: " + this.codigo +
                "\nQuantidade Atual de Alunos: " + this.aluno.size() +
                "\nQuantidade Máxima de Alunos: " + this.quantidadeMaxima + "\n";

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Curso curso = (Curso) o;
        return Objects.equals(codigo, curso.codigo);
    }

    public Boolean adicionarUmAluno(Aluno umAluno) {
        if (quantidadeMaxima()) {
            alunos.add(umAluno);
            return true;
        } else {
            return false;
        }
    }

    private boolean quantidadeMaxima() {
        return true;
    }

    public void excluirAluno(Aluno umAluno) {
        for (int i = 0; i < aluno.size(); i++) {
            if (aluno.get(i).equals(umAluno)) {
                aluno.remove(i);
                break;
            }

        }

    }

    public boolean validaQuantidadeMaxima() {
        if (aluno.size() >= quantidadeMaxima) {
            System.out.println(this.toString());
            System.out.println("Não há mais vagas para este curso!");
            return false;
        } else {
            return true;
        }
    }

}
