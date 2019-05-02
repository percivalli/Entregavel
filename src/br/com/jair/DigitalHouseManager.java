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
        System.out.println("Cadastro de curso.");
        Curso curso = new Curso(nome, codigoCurso, quantidadeMaximaDeAlunos);

        if ((cursos.contains(curso))) {
            System.out.println("Erro no cadastro do curso." +
                    "\n Código de curso já cadastrado.\n");
        } else {
            cursos.add(curso);
            System.out.println("Curso cadastrado com sucesso!");
            System.out.println(curso.toString());
        }
    }

    public void excluirCurso(Integer codigoCurso) {
        int pos = posicaoList(cursos, codigoCurso, 1);
        boolean exclui = true;
        System.out.println("Exclusão de Curso");
        if (pos >= 0) {
            for (Matricula matricula : matriculas) {
                if (matricula.getCurso().equals(cursos.get(pos))) {
                    System.out.println("Erro ao excluir um curso!" +
                            "\n Este curso possui matrículas e não poderá ser excluido!\n");
                    exclui = false;
                    break;
                }
            }
            if (exclui) {
                System.out.println(cursos.get(pos).toString());
                cursos.remove(pos);
                System.out.println("Curso excluído com sucesso!\n");
            }

        } else {

            System.out.println("Erro ao excluir um curso!" +
                    "\n Código de curso inexistente.\n");
        }
    }

    public void registrarProfessorAdjunto(String nome, String sobrenome,
                                          Integer codigoProfessor, Integer quantidadeDeHoras) {
        System.out.println("Cadastro de professor adjunto.");
        ProfessorAdjunto professorAdjunto = new ProfessorAdjunto(nome, sobrenome, codigoProfessor, quantidadeDeHoras);
        if ((professores.contains(professorAdjunto))) {
            System.out.println("Erro ao tentar cadastrar um professor adjunto!" +
                    "\n Código " + codigoProfessor + " de professor adjunto já cadastrado!\n");
        } else {
            professores.add(professorAdjunto);
            System.out.println("Professor adjunto cadastrado com sucesso.");
            System.out.println(professorAdjunto.toString());
        }
    }

    public void registrarProfessorTitular(String nome, String sobrenome,
                                          Integer codigoProfessor, String especialidade) {
        System.out.println("Cadastro de professor titular.");
        ProfessorTitular professorTitular = new ProfessorTitular(nome, sobrenome, codigoProfessor, especialidade);


        if ((professores.contains(professorTitular))) {
            System.out.println("Erro ao tentar cadastrar um professor titular!" +
                    "\n Codigo de professor titular já cadastrado!\n");
        } else {
            professores.add(professorTitular);
            System.out.println("Professor titular cadastrado com sucesso.");
            System.out.println(professorTitular.toString());
        }

    }

    public void excluirProfessor(Integer codigoProfessor) {
        int pos = posicaoList(professores, codigoProfessor, 2);
        boolean exclui = true;

        System.out.println("Exclusão de professor.");
        if (pos >= 0) {
            for (Curso curso : cursos) {
                System.out.println("Teste " + curso);
                System.out.println(curso.getProfessorAdjunto());
                System.out.println(curso.getProfessorTitular());
                System.out.println(professores);


                if (curso.getProfessorAdjunto().equals(professores.get(pos)) ||
                        curso.getProfessorTitular().equals(professores.get(pos))) {
                    System.out.println("Erro ao tentar excluir um professor!" +
                            "\n Professor está alocado a algum curso e não poderá ser excluido!\n");
                    exclui = false;
                    break;

                }
            }
            if (exclui) {
                System.out.println(professores.get(pos).toString());
                professores.remove(pos);
                System.out.println("Professor informado excluído com sucesso.\n");
            }
        } else {

            System.out.println("Erro ao tentar excluir um professor!" +
                    "\n Código de professor inexistente!\n");
        }
    }

    public void alocarProfessores(Integer codigoCurso, Integer codigoProfessorTitular,
                                  Integer codigoProfessorAdjunto) {
        int posCurso = posicaoList(cursos, codigoCurso, 1);
        int posProfT = posicaoList(professores, codigoProfessorTitular, 2);
        int posProfA = posicaoList(professores, codigoProfessorAdjunto, 2);
        System.out.println("Alocação de professores.");

        if (posCurso == -1) {
            System.out.println("Erro na alocação de um professor!" +
                    "\n Codigo de curso inexistente!\n");
        } else if (posProfT == -1) {
            System.out.println("Erro na alocação de um professor!" +
                    "\n Codigo de professor inexistente!\n");

        } else if (posProfA == -1) {
            System.out.println("Erro na alocação de um professor!" +
                    "\n Codigo de professor adjunto inexistente!\n");
        } else {
            System.out.println(cursos.get(posCurso).toString());
            cursos.get(posCurso).setProfessorTitular((ProfessorTitular) professores.get(posProfT));
            System.out.println("Professor Titular: " + professores.get(posProfT).getNome());
            cursos.get(posCurso).setProfessorAdjunto((ProfessorAdjunto) professores.get(posProfA));
            System.out.println("Professor Adjunto: " + professores.get(posProfA).getNome() + "\n");
        }

    }

    public void matricularAluno(String nome, String sobrenome,
                                Integer codigoAluno) {
        System.out.println("Cadastro de Aluno.");
        Aluno aluno = new Aluno(nome, sobrenome, codigoAluno);

        if ((alunos.contains(aluno))) {
            System.out.println("Erro no cadastro do aluno!" +
                    "\n Código de aluno já cadastrado!\n");
        } else {
            alunos.add(aluno);
            System.out.println("Aluno matriculado com sucesso.");
            System.out.println(aluno.toString());
        }
    }

    public void matricularAluno(Integer codigoAluno, Integer codigoCurso) {
        int posCurso = posicaoList(cursos, codigoCurso, 1);
        int posAluno = posicaoList(alunos, codigoAluno, 3);

        System.out.println("Matricular o aluno ao curso.");
        if (posCurso == -1) {
            System.out.println("Erro na matrícula do aluno!" +
                    "\n Codigo de curso inexistente!\n");
        } else if (posAluno == -1) {
            System.out.println("Erro na matrícula do aluno!" +
                    "\n Codigo de aluno inexistente!\n");
        } else if (cursos.get(posCurso).validaQuantidadeMaxima()) {
            matriculas.add(new Matricula(alunos.get(posAluno), cursos.get(posCurso)));

            System.out.println("Aluno matriculado com sucesso!");
            System.out.println(alunos.get(posAluno).toString());
            System.out.println(cursos.get(posCurso).toString());

        }
    }

    public void consultaCursoMatriculado(Integer codigoAluno) {
        int posAluno = posicaoList(alunos, codigoAluno, 3);
        boolean matriculado = false;

        System.out.println("Buscar o curso.");
        if (posAluno == -1) {
            System.out.println("Erro ao matricular o aluno!" +
                    "\n Codigo de aluno inexistente!\n");
        } else {
            for (Matricula matricula : matriculas) {
                if (matricula.getAluno().equals(alunos.get(posAluno))) {
                    System.out.println(matricula.getCurso().toString());
                    matriculado = true;
                }
            }

            if (!matriculado) {
                System.out.println("Aluno não matriculado!" +
                        "\n Aluno não está matriculado a nenhum curso!");
                System.out.println(alunos.get(posAluno).toString());
            }

        }
    }

    private int posicaoList(List lista, Integer codigoBusca, int tipoClasse) {
        for (int i = 0; i < lista.size(); i++) {

            if (tipoClasse == 1) {
                Curso curso = (Curso) lista.get(i);
                if (curso.getCodigo().equals(codigoBusca)) {
                    return i;
                }
            } else if (tipoClasse == 2) {
                Professor professor = (Professor) lista.get(i);
                if (professor.getCodigo().equals(codigoBusca)) {
                    return i;
                }
            } else if (tipoClasse == 3) {
                Aluno aluno = (Aluno) lista.get(i);
                if (aluno.getRA().equals(codigoBusca)) {
                    return i;
                }
            }
        }
        return -1;
    }
}

