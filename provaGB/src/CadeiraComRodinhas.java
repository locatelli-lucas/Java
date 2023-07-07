public class CadeiraComRodinhas extends Cadeira{
    private int ano;
    private int mes;
    private int dia;

    public CadeiraComRodinhas(Cor cor, int ano, int mes, int dia) {
        super(cor);
        this.ano = ano;
        this.mes = mes;
        this.dia = dia;
    }

    public CadeiraComRodinhas(Cor cor, Aluno aluno, int ano, int mes, int dia) {
        super(cor, aluno);
        this.ano = ano;
        this.mes = mes;
        this.dia = dia;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    @Override
    public String toString() {
        return "CadeiraComRodinhas{" +
                "ano=" + ano +
                ", mes=" + mes +
                ", dia=" + dia +
                "} " + super.toString();
    }
}
