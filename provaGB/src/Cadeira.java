public class Cadeira {
    private Cor cor;
    private Aluno aluno;

    public Cadeira(Cor cor) {
        this.cor = cor;
    }

    public Cadeira(Cor cor, Aluno aluno) {
        this.cor = cor;
        this.aluno = aluno;
    }

    public Cor getCor() {
        return cor;
    }

    public void setCor(Cor cor) {
        this.cor = cor;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    @Override
    public String toString() {
        return "Cadeira{" +
                "cor=" + cor +
                ", aluno=" + aluno +
                '}';
    }
}
