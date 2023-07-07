package Churros;

public class Churros {
    private String sabor;
    private double preco;

    public Churros(String sabor, double preco) {
        this.sabor = sabor;
        this.preco = preco;
    }

    public Churros(String sabor) {
        this.sabor = sabor;
    }

    public Churros() {

    }

    public String getSabor() {
        return sabor;
    }

    public double getPreco() {
        return preco;
    }

    public String toString() {
        return "O sabor desse churros é de "+sabor+" e custa R$"+preco+"\n";
    }
    
}