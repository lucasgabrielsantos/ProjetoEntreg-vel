package br.com.digitalhouse;

public class Principal {

    public static void main(String[] args) {

        DigitalHouseManager dhManager = new DigitalHouseManager();
        dhManager.registrarCurso("FullStack",200001,3);
        dhManager.registrarCurso("Android", 20002,2);
        dhManager.registrarProfessorAdjunto("Lucas","Jason", 1234,20);
        dhManager.registrarProfessorTitular("Joao","da Massa",321,"NAODORME");
        // dhManager.excluirCurso(200001);
        dhManager.matricularAluno("Gabriel","Santos",123);
        dhManager.matricularAluno(123,200001);
        dhManager.alocarProfessores(200001,321,1234);


    }

}

