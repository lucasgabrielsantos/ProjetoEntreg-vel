package br.com.digitalhouse;

public class Professor {
    private String nome;
    private String sobreNome;
    private Integer tempoDeCasa;
    private Integer codigoProfessor;

    public Professor(String nome, String sobreNome, Integer codigoProfessor) {
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.codigoProfessor = codigoProfessor;
    }

    public Integer getCodigoProfessor() {
        return codigoProfessor;
    }

    public void setCodigoProfessor(Integer codigoProfessor) {
        this.codigoProfessor = codigoProfessor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public Integer getTempoDeCasa() {
        return tempoDeCasa;
    }

    public void setTempoDeCasa(Integer tempoDeCasa) {
        this.tempoDeCasa = tempoDeCasa;
    }
}

