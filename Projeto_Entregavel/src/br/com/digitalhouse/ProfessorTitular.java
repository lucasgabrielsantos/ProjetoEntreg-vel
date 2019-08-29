package br.com.digitalhouse;

public class ProfessorTitular extends Professor {


    private String especialidade;

    public ProfessorTitular(String nome, String sobreNome, Integer codigoProfessor, String especialidade) {
        super(nome, sobreNome, codigoProfessor);
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}
