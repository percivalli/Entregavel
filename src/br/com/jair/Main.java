package br.com.jair;

public class Main {
    public static void main(String[] args) {
        DigitalHouseManager digitalHouseManager = new DigitalHouseManager();

        digitalHouseManager.registrarCurso("Full Stack", 20001, 3);
        digitalHouseManager.registrarCurso("Android", 20002, 2);

        digitalHouseManager.registrarProfessorAdjunto("Nayara", "Nunes", 69, 25);
        digitalHouseManager.registrarProfessorAdjunto("Iris", "Soares", 15, 17);

        digitalHouseManager.registrarProfessorTitular("Camila", "Santos", 6, "JAVA");
        digitalHouseManager.registrarProfessorTitular("Danilo", "Percivalli", 34, "PHP");
        digitalHouseManager.registrarProfessorAdjunto("Robson", "Alessandro", 10, 12);

        digitalHouseManager.alocarProfessores(20001, 6, 15);
        digitalHouseManager.alocarProfessores(20002, 34, 69);


        //digitalHouseManager.excluirProfessor(99);

        digitalHouseManager.matricularAluno("Bozo", "Palhaço", 101);
        digitalHouseManager.matricularAluno("Desgraça", "de Java", 102);
        digitalHouseManager.matricularAluno("Cansei", "Desse Código", 103);

        digitalHouseManager.consultaCursoMatriculado(102);

        digitalHouseManager.matricularAluno(102, 20001);
        digitalHouseManager.matricularAluno(103, 20002);

        digitalHouseManager.excluirProfessor(6);
        digitalHouseManager.excluirCurso(20001);

        digitalHouseManager.matricularAluno(101, 20001);
        digitalHouseManager.matricularAluno(102, 20001);
        digitalHouseManager.matricularAluno(103, 20001);

        digitalHouseManager.consultaCursoMatriculado(12);
    }
}
