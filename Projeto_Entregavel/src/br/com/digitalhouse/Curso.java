package br.com.digitalhouse;

import java.util.ArrayList;
import java.util.List;
public  class  Curso {
    private String nomeCurso;
    private Integer codigoCurso;
    private Integer quantidadeMaximaDeAlunos;
    private Professor professorAdjunto;
    private Professor professorTitular;

    public Curso(String nomeCurso, int codigoCurso, Integer quantidadeMaximaDeAlunos) {

        this.nomeCurso = nomeCurso;
        this.codigoCurso = codigoCurso;
        this.quantidadeMaximaDeAlunos = quantidadeMaximaDeAlunos;

    }
    public Curso (Integer codigoCurso ){

    }

    public String getNomeCurso() {

        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public Integer getCodigoCurso() {
        return codigoCurso;
    }

    public void setCodigoCurso(Integer codigoCurso) {
        this.codigoCurso = codigoCurso;
    }

    public Professor getProfessorAdjunto() {
        return professorAdjunto;
    }

    public void setProfessorAdjunto(Professor professorAdjunto) {
        this.professorAdjunto = professorAdjunto;
    }

    public Professor getProfessorTitular() {
        return professorTitular;
    }

    public void setProfessorTitular(Professor professorTitular) {
        this.professorTitular = professorTitular;
    }

    public boolean adicionarAluno(Aluno umAluno){
        return true;
    }

    public void excluirAluno(Aluno umAluno){

    }

    @Override
    public String toString() {
        return "\nCurso\n " + "Nome: " + nomeCurso + ", CodCurso: " + codigoCurso + ", MaxAluno: " + quantidadeMaximaDeAlunos;
    }
}
