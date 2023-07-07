public class GrauB extends Grau {
    private int notaAtiv;
    private int notaSemin;
    private int notaPartic;

    public GrauB(String dataInicio, String dataFinal, int notaAtiv, int notaSemin, int notaPartic) {
        super(dataInicio, dataFinal);
        this.notaAtiv = notaAtiv;
        this.notaSemin = notaSemin;
        this.notaPartic = notaPartic;
    }

    public GrauB() {
        this.notaAtiv = 0;
        this.notaSemin = 0;
        this.notaPartic = 0;
    }

    public int getNotaAtiv() {
        return notaAtiv;
    }

    public void setNotaAtiv(int notaAtiv) {
        this.notaAtiv = notaAtiv;
    }

    public int getNotaSemin() {
        return notaSemin;
    }

    public void setNotaSemin(int notaSemin) {
        this.notaSemin = notaSemin;
    }

    public int getNotaPartic() {
        return notaPartic;
    }

    public void setNotaPartic(int notaPartic) {
        this.notaPartic = notaPartic;
    }

    @Override
    public String toString() {
        return "GrauB{" +
                "notaAtiv=" + notaAtiv +
                ", notaSemin=" + notaSemin +
                ", notaPartic=" + notaPartic +
                "} " + super.toString();
    }

    public double calculaNotaGrauFinal() {
        return notaAtiv*0.3 + notaSemin*0.6 + notaPartic*0.1;
    }
}
