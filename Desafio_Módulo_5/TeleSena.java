package Desafio_Módulo_5;

public class TeleSena {
    private double valorVenda = 10; //Declaração do valor fixo de venda de uma tele-sena
    private int[] cj1, cj2; //Declaração dos dois conjuntos de números de cada tele-sena

    public TeleSena(double valorVenda, int[] cj1, int[] cj2) { //Construtor da classe
        this.valorVenda = valorVenda;
        this.cj1 = cj1;
        this.cj2 = cj2;
    }

    public double getValorVenda() { //
        return valorVenda;          //
    }                               //
                                    //
    public int[] getCj1() {         //Dclarados apenas os métodos get que foram utilizados
        return cj1;                 //
    }                               //
                                    //
    public int[] getCj2() {         //
        return cj2;                 
    }

    public String toString() {
        String ret = "";
        for(int i : cj1)
            System.out.println(i);
        for(int i : cj2)
            System.out.println(i);
        return ret;
    }
    
}