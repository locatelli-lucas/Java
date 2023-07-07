package Churros;

public class BancaDeChurros {
    private Churros[] churros;

    public BancaDeChurros(int quantMaxChurros) {
        this.churros = new Churros[quantMaxChurros];
    }

    public Churros[] getChurros(){
        return churros;
    }

    public int estoqueChurros(String sabor) {
        int quant = 0;
        for(Churros churro : churros) {
            if(churro.getSabor().equals(sabor)) {
                quant++;
            }
        }
        return quant;
    }

    public boolean insereChurros(Churros c) {
        for(int i = 0; i < churros.length; i++) {
            if(churros[i] == null) {
                churros[i] = c;
                return true;
            }
        }
        return false;
    }

    public String valorTotal() {
        double soma = 0;
        for(int i = 0; i < churros.length; i++) {
            soma += churros[i].getPreco();
        }
        return "R$"+soma;
    }

    public boolean vendeChurros(String sabor) {
        for(int i = 0; i < churros.length; i++) {
            if(churros[i].getSabor().equals(sabor)) {
                System.out.println("O churro de "+sabor+" foi vendido por R$"+churros[i].getPreco());
                churros[i] = null;
                return true;
            } 
        }
        System.out.println("No momento estamos sem churros deste sabor");
        return false;
    }

    public void imprimeChurros() {
        for(Churros churro : churros) {
            if(churro != null)
                System.out.println(churro);
            else
                System.out.println("Aqui está vazio");
        }    
    }

    public void lePedidos(String nome, String sabor, int quantidade) {
        int somaChurros = 0;
        for(int i = 0; i < churros.length; i++) {
            if(churros[i].getSabor().equals(sabor)) {
                somaChurros++;
                System.out.println("Vendido");
            }
            else 
                somaChurros--;
            if(somaChurros == quantidade)
                break;
        }    
            if(quantidade > somaChurros)
                System.out.println("Não temos churros o suficiente desse sabor");   
    }
}
