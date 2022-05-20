package com.bandtec.heranca.aluno;

import java.util.ArrayList;
import java.util.List;

public class Faculdade {
    private String faculdade;
    private List<Aluno> alunos;

    public Faculdade(String faculdade) {
        this.faculdade = faculdade;
        this.alunos = new ArrayList<>();
    }

    public void matricularAluno(Aluno aluno) {
        this.alunos.add(aluno);
        System.out.println("sucesso");
    }
}
