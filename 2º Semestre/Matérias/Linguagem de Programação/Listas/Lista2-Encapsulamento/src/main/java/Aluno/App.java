package Aluno;

import Aluno.Aluno;

public class App {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        Aluno aluno2 = new Aluno();

        aluno1.setRa("001");
        aluno1.setNome("Berto");
        aluno1.setCurso("Sistemas Operacionais");
        aluno1.setNota1(9.2);
        aluno1.setNota2(90.8);

        aluno1.getRa();
        aluno1.getNome();
        aluno1.getCurso();
        aluno1.getMediaNotas();

        System.out.println(String.format(
                "RA: %s \n" +
                "Nome: %s \n" +
                "Curso: %s \n" +
                "Notas: %.1f e %.1f \n" +
                "Média: %.1f",
                aluno1.getRa(), aluno1.getNome(), aluno1.getCurso(),
                aluno1.getNota1(), aluno1.getNota2(), aluno1.getMediaNotas())
        );
    }
}
