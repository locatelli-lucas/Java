public class Aluno {
    private String nome;
    private Grau ga, gb;

    public Aluno(String nome) {
        this.nome = nome;
        this.ga = new GrauA();
        this.gb = new GrauB();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Grau getGa() {
        return ga;
    }

    public void setGa(Grau ga) {
        this.ga = ga;
    }

    public Grau getGb() {
        return gb;
    }

    public void setGb(Grau gb) {
        this.gb = gb;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", ga=" + ga +
                ", gb=" + gb +
                '}';
    }

    public double calculaNotaFinal(GrauA ga, GrauB gb) {
        return ga.calculaNotaGrauFinal()*0.33 + gb.calculaNotaGrauFinal()*0.67;
    }
}
