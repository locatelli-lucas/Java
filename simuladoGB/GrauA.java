public class GrauA extends Grau {
    private int notaTrab;
    private int notaProva;

    public GrauA(String dataInicio, String dataFinal, int notaTrab, int notaProva) {
        super(dataInicio, dataFinal);
        this.notaTrab = notaTrab;
        this.notaProva = notaProva;
    }

    public GrauA() {
        this.notaTrab = 0;
        this.notaProva = 0;
    }

    public GrauA(int notaTrab, int notaProva) {
        this.notaTrab = notaTrab;
        this.notaProva = notaProva;
    }

    public int getNotaTrab() {
        return notaTrab;
    }

    public void setNotaTrab(int notaTrab) {
        this.notaTrab = notaTrab;
    }

    public int getNotaProva() {
        return notaProva;
    }

    public void setNotaProva(int notaProva) {
        this.notaProva = notaProva;
    }

    @Override
    public String toString() {
        return "GrauA{" +
                "notaTrab=" + notaTrab +
                ", notaProva=" + notaProva +
                '}';
    }

    public double calculaNotaGrauFinal() {
        return notaTrab*0.3 + notaProva*0.7;
    }
}
