public class Grau {
    private String dataInicio;
    private String dataFinal;

    public Grau(String dataInicio, String dataFinal) {
        this.dataInicio = dataInicio;
        this.dataFinal = dataFinal;
    }

    public Grau() {
        this.dataInicio = null;
        this.dataFinal = null;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public String getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(String dataFinal) {
        this.dataFinal = dataFinal;
    }

    @Override
    public String toString() {
        return "Grau{" +
                "dataInicio='" + dataInicio + '\'' +
                ", dataFinal='" + dataFinal + '\'' +
                '}';
    }
}
