package br.com.jair;

import java.util.List;
import java.util.Objects;

public class Curso {

    private String nome;
    private Integer codigo;
    private ProfessorTitular professorTitular;
    private ProfessorAdjunto professorAdjunto;
    private Integer quantidadeMaxima;
    private List<Aluno> alunos;

    public Curso(String nome, Integer codigo, Integer quantidadeMaxima) {
        this.nome = nome;
        this.codigo = codigo;
        this.quantidadeMaxima = quantidadeMaxima;

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Curso curso = (Curso) o;
        return Objects.equals(codigo, curso.codigo);
    }

    public Boolean adicionarUmAluno(Aluno umAluno) {
        if (alunos.size() < quantidadeMaxima) {
            alunos.add(umAluno);
        } else {
            return false;
        }
    }

    public void excluirAluno(Aluno umAluno) {
        for (int i = 0; i < alunos.size(); i++) {
            if (alunos.get(i).equals(umAluno)) {
                alunos.remove(i);
                break;
            }

        }

    }


}
