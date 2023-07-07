package Desafio_Módulo_5;

public class Pessoa {
    private String nome;
    private TeleSena[] teleSena;
    private double premio;
    private int quantTeleSena;

    public Pessoa(String nome, TeleSena[] teleSena, int quantTeleSena, double premio) { //1° Método construtor de Pessoa
        this.nome = nome;
        this.teleSena = new TeleSena[15];
        this.premio = premio;
        this.quantTeleSena = quantTeleSena;
    }

    public Pessoa(String nome, TeleSena[] teleSena, int quantTeleSena) { //2° Método construtor de Pessoa
        this.nome = nome;
        this.teleSena = teleSena;
        this.quantTeleSena = quantTeleSena;
    }

    public String getNome() { //Métodos get e set utilizados
        return nome;
    }

    public TeleSena[] getTeleSena() {
        return teleSena;
    }

    public double getPremio() {
        return premio;
    }

    public void setPremio(double premio) {
        this.premio = premio;
    }

    public int getQuantTeleSena() { 
        return quantTeleSena;
    }

    public String toString() {
        String ret = "";
        ret += "Nome: "+nome+"\n";
        ret += "Quantidade de tele-senas: "+quantTeleSena+"\n";
        return ret;
    }
}
