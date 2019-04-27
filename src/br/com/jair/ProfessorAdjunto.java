package br.com.jair;

public class ProfessorAdjunto extends Professor {

    private Integer monitoria;

    public ProfessorAdjunto(String nome, String sobrenome, Integer RP, Integer monitoria) {
        super(nome, sobrenome, RP);
        this.monitoria = monitoria;
    }

    public Integer getMonitoria() {
        return monitoria;
    }

    public void setMonitoria(Integer monitoria) {
        this.monitoria = monitoria;
    }
}
