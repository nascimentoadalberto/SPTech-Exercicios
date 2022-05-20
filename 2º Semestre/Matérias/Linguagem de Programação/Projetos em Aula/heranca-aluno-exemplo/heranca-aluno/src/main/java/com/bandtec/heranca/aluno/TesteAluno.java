package com.bandtec.heranca.aluno;

import java.util.ArrayList;
import java.util.List;

public class TesteAluno {
    public static void main(String[] args) {
        Aluno a1 = new Aluno(123, "José");
        AlunoGraduacao a2 = new AlunoGraduacao(10.0, 10.0, 234, "Maria");
        Faculdade faculdade = new Faculdade("SPTech");
        
//        System.out.println(a1);
//        System.out.println(a2);

//        faculdade.matricularAluno(a1);
//        faculdade.matricularAluno(a2);
//
//        if (a1 instanceof AlunoGraduacao) {
//            System.out.println("true");
//        } else {
//            System.out.println("false");
//        }

        Aluno a3 = new AlunoGraduacao(10.0, 9.95, 951, "marcio");
        System.out.println(a3.getClass());
    }
}
