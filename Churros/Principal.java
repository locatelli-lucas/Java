package Churros;

public class Principal {
    public static void main(String[] args) {
        BancaDeChurros bc = new BancaDeChurros(5);
        Churros[] c = new Churros[bc.getChurros().length];
        
        for(int i = 0; i < c.length; i++) {
            c[i] = new Churros(Teclado.leString("Qual o sabor?"), Teclado.leDouble("Qual o preço? R$"));
            bc.insereChurros(c[i]);
        }
        
        // System.out.println(bc.estoqueChurros(Teclado.leString("Digite um sabor: ")));
        // System.out.println(bc.valorTotal());
        // bc.vendeChurros(Teclado.leString("Digite um sabor: "));
        // bc.imprimeChurros();
        bc.lePedidos(Teclado.leString("Qual o seu nome?"), Teclado.leString("Qual o sabor?"), Teclado.leInt("Quantos você gostaria? "));
    }
}
