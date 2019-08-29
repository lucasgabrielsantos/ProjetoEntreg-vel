package br.com.digitalhouse;

import java.util.ArrayList;
import java.util.List;


public class DigitalHouseManager {
    List<Aluno> alunos = new ArrayList<>();
    List<Curso> cursos = new ArrayList<>();
    List<Professor> professores = new ArrayList<>();
    List<Matricula> matriculas = new ArrayList<>();


    public void registrarCurso(String nome, Integer codigoCurso, Integer quantidadeMaximaDeAlunos) {
        Curso curso1 = new Curso(nome, codigoCurso, quantidadeMaximaDeAlunos);
        cursos.add(curso1);
        System.out.println("Curso " + nome + " registrado com sucesso");
        System.out.println(cursos.size());

    }

    public void excluirCurso(Integer codigoCurso) {
        Curso curso1 = null;
        for (Curso novoCurso : cursos) {
            if (codigoCurso.equals(novoCurso.getCodigoCurso())) {
                cursos.get(codigoCurso);
                cursos.remove(codigoCurso);
                System.out.println("curso excluido" + curso1.getNomeCurso());
            }
        }
    }

    public void registrarProfessorAdjunto(String nome, String sobrenome, Integer codigoProfessorAdjunto, Integer hrsMonitoria) {
        ProfessorAdjunto profadjunto = new ProfessorAdjunto(nome, sobrenome, codigoProfessorAdjunto, hrsMonitoria);
        professores.add(profadjunto);
        System.out.println("professor Adjunto, cadastro realizado com sucesso");
    }

    public void registrarProfessorTitular(String nome, String sobrenome, Integer codigoProfessor, String especialidade) {
        ProfessorTitular profTitular = new ProfessorTitular(nome, sobrenome, codigoProfessor, especialidade);
        professores.add(profTitular);
        System.out.println("Professor Titular, cadastrado realizado com sucesso");

    }

    public void excluirProfessor(Integer codigoProfessor) {
        for (Professor valor : professores) {
            if (valor.getCodigoProfessor().equals(codigoProfessor)) {
                professores.remove(codigoProfessor);
                System.out.println("professor" + codigoProfessor + "foi excluido");
            } else {
                System.out.println("professor não encontrado");
            }
        }

    }

    public void matricularAluno(String nome, String sobrenome, Integer codigoAluno) {
        Aluno aluno = new Aluno(nome, sobrenome, codigoAluno);
        alunos.add(aluno);
        System.out.println("aluno" + nome + sobrenome + "com codigo : " + codigoAluno + "adicionado com sucesso");


    }

    public void matricularAluno(Integer codigoAluno, Integer codigoCurso) {
        Aluno aluno = null;
        Curso curso = null;
        Matricula matricula;

        //for do curso
        for (int i = 0; i < cursos.size(); i++) {
            if (cursos.get(i).getCodigoCurso().equals(codigoCurso)) {
                //adquirindo conteudo da lista caso todas as condicoes forem true, atribuindo ao meu objeto null
                curso = cursos.get(i);
            }

        }

        for (int i = 0; i < alunos.size(); i++) {
            if (alunos.get(i).getCodigo().equals(codigoAluno)) {
                aluno = alunos.get(i);
            }
        }

        if (curso != null && aluno != null) {
            if (curso.adicionarAluno(aluno)) {
                matricula = new Matricula(aluno, curso);
                matriculas.add(matricula);
                System.out.println("matricula realizada com sucesso !!!");
            }
        } else if (aluno == null) {
            System.out.println("aluno nao encontrado !!!");
        } else if (curso == null) {
            System.out.println("curso nao econtrado !!!");
        }
    }

    public void alocarProfessores(Integer codigoCurso, Integer codigoProfessorTitular, Integer codigoProfessorAdjunto) {
        Curso curso = null;
        Professor professorTitular = null;
        Professor professorAdjunto = null;

        for (Curso listaCurso : cursos) {
            if (listaCurso.getCodigoCurso().equals(codigoCurso)) {
                curso = listaCurso;

            }
        }
        for (Professor listaProfTit : professores) {
            if (listaProfTit.getCodigoProfessor().equals(codigoProfessorTitular)) {
                professorTitular = listaProfTit;

            }
        }

        for (Professor listaProfAdj : professores) {
            if (listaProfAdj.getCodigoProfessor().equals(codigoProfessorAdjunto)) {
                professorAdjunto = listaProfAdj;

            }

        }
        if (codigoCurso != null && codigoProfessorTitular != null) {
            curso.setProfessorTitular(professorTitular);
            System.out.println("Professor " + professorTitular.getNome() + " adicionado ao curso " + curso.getNomeCurso() + " com sucesso!");
        }
        if (codigoCurso != null && codigoProfessorAdjunto != null) {
            curso.setProfessorAdjunto(professorAdjunto);

            System.out.println("Professor " + professorAdjunto.getNome() + " adicionado ao curso " + curso.getNomeCurso() + " com sucesso!");

        } else {
            System.out.println("Nao deu");
        }
    }
}
