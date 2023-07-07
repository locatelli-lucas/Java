public class Main {
    public static void main(String[] args) {
        int x = ((int) (Math.random() * 50))+1;
        System.out.println(x);
        Turma t = new Turma(x);
        //boolean estaCheia = (t.getAlunos().length == x);
        for(int j = 0; j < t.getAlunos().length; j++) {
            if(t.getAlunos()[j] == null) {
                for(int i = 0; i < x; i++) {
                    String nome = "Aluno "+i;
                    t.insereAluno(new Aluno(nome));
                    t.alteraNotasGrauA(nome, ((int) (Math.random() * 10)), ((int) (Math.random() * 10)));
                    t.alteraNotasGrauB(nome, ((int) (Math.random() * 10)), ((int) (Math.random() * 10)), ((int) (Math.random() * 10)));
                    System.out.println("O aluno foi inserido na turma");
                }
            } else {
                System.out.println("O aluno não foi inserido na turma");
                //break;
            }
        }

        System.out.println(t.mediaNotasTurmas());
        for(int i = 0; i < t.getAlunos().length; i++) {
            if(t.getAlunos()[i].calculaNotaFinal((GrauA)t.getAlunos()[i].getGa(), (GrauB)t.getAlunos()[i].getGb()) >= 6)
                System.out.println(t.getAlunos()[i].getNome()+": Passou por média!");
            else
                System.out.println(t.getAlunos()[i].getNome()+": Ficou em Grau C");
        }
    }
}
