public class CadeiraComMesa extends Cadeira{
    private double largura;
    private double profundidade;

    public CadeiraComMesa(Cor cor, double largura, double profundidade) {
        super(cor);
        this.largura = largura;
        this.profundidade = profundidade;
    }

    public CadeiraComMesa(Cor cor, Aluno aluno, double largura, double profundidade) {
        super(cor, aluno);
        this.largura = largura;
        this.profundidade = profundidade;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getProfundidade() {
        return profundidade;
    }

    public void setProfundidade(double profundidade) {
        this.profundidade = profundidade;
    }

    @Override
    public String toString() {
        return "CadeiraComMesa{" +
                "largura=" + largura +
                ", profundidade=" + profundidade +
                '}';
    }
}
