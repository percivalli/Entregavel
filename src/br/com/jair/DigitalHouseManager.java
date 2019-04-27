package br.com.jair;

import java.util.ArrayList;
import java.util.List;

public class DigitalHouseManager {
    List<Aluno> alunos = new ArrayList<>();
    List<Professor> professores = new ArrayList<>();
    List<Curso> cursos = new ArrayList<>();
    List<Matricula> matriculas = new ArrayList<>();

    public void registrarCurso(String nome, Integer codigoCurso,
                               Integer quantidadeMaximaDeAlunos) {
        cursos.add(new Curso(nome, codigoCurso, quantidadeMaximaDeAlunos));
    }

    public void excluirCurso(Integer codigoCurso) {
        for (Integer i = 0; i < cursos.size(); i++) {
            if (cursos.get(i).equals(codigoCurso)) {
                cursos.remove(i);
                break;
            }

        }

    }

    public void registrarProfessorAdjunto(String nome, String
            sobrenome, Integer codigoProfessor, Integer quantidadeDeHoras) {
        professores.add(new ProfessorAdjunto(nome, sobrenome, codigoProfessor, quantidadeDeHoras));
    }

    public void registrarProfessorTitular(String nome, String
            sobrenome, Integer codigoProfessor, String especialidade) {
        professores.add(new ProfessorTitular(nome, sobrenome, Integer, String));
    }

    public void excluirProfessor(Integer codigoProfessor){
        for (Integer i = 0; i < codigoProfessor; i++) {
            if (professores.get(i).equals(codigoProfessor;)) {
                professores.remove(i);
                break;
            }
            
        }
    }

    public void matricularAluno(String nome, String sobrenome,
                                Integer codigoAluno) {
        alunos.add(new Aluno(nome, sobrenome, codigoAluno));
    }

    public void matricularAluno(Integer codigoAluno, Integer
            codigoCurso) {

    }



}
