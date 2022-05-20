public class Main {
    public static void main(String[] args) {
        AlunoGraduacao alunoGraduacao = new AlunoGraduacao(10.0, 10.0, 1, "Geraldo");

        Aluno aluno = new Aluno(2, "Giuliana");



        System.out.println(alunoGraduacao.getRa());
        System.out.println(alunoGraduacao.getNome());
        System.out.println(alunoGraduacao.getNotaContinuada());
        System.out.println(alunoGraduacao.getNotaIntegrada());


    }
}