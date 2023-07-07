public class Turma {
    private Aluno[] alunos;

    public Turma(int quantMaxAlunos) {
        this.alunos = new Aluno[quantMaxAlunos];
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public boolean insereAluno(Aluno a) {
        for(int i = 0; i < alunos.length; i++) {
            if(alunos[i] == null) {
                alunos[i] = a;
                return true;
            }
        }

        return false;
    }

    public double mediaNotasTurmas() {
        int soma = 0;
        int quantAlunos = 0;
        for(int i = 0; i < alunos.length; i++) {
            if(alunos[i] != null) {
               soma += alunos[i].calculaNotaFinal((GrauA)alunos[i].getGa(), (GrauB)alunos[i].getGb());
               quantAlunos++;
            }
        }
        if(soma != 0) {
            return soma/quantAlunos;
        } else
            return -1;
    }

    public void alteraNotasGrauA(String nome, int notaProva, int notaTrabalho) {
        for(int i = 0; i < alunos.length; i++) {
            if(alunos[i].getNome().equals(nome) && alunos[i] != null) {
                    GrauA grauA = (GrauA) alunos[i].getGa();
                    grauA.setNotaTrab(notaTrabalho);
                    grauA.setNotaProva(notaProva);
                    return;
                }
            }
        }

    public void alteraNotasGrauB(String nome, int notaAtiv, int notaSemin, int notaPartic) {
        for(int i = 0; i < alunos.length; i++) {
            if(alunos[i].getNome().equals(nome) && alunos[i] != null) {
                GrauB grauB = (GrauB) alunos[i].getGb();
                grauB.setNotaAtiv(notaAtiv);
                grauB.setNotaSemin(notaSemin);
                grauB.setNotaPartic(notaPartic);
                return;
            }
        }
    }
}
