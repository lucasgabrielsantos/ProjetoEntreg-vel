package br.com.digitalhouse;

public class ProfessorAdjunto extends Professor {

    private Integer hrsMonitoria;

    public ProfessorAdjunto(String nome, String sobreNome, Integer codigoProfessorAdjunto, Integer hrsMonitoria) {
        super(nome, sobreNome, codigoProfessorAdjunto);
        this.hrsMonitoria = hrsMonitoria;
    }

    public Integer getHrsMonitoria() {
        return hrsMonitoria;
    }

    public void setHrsMonitoria(Integer hrsMonitoria) {
        this.hrsMonitoria = hrsMonitoria;
    }
}