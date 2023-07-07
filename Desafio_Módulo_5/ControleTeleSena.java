package Desafio_Módulo_5;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class ControleTeleSena {
    private Pessoa[] pessoas; //Declaração da array que contém todos os participantes
    private int[] numerosSorteados; //Declaração da array que contém os números sorteados
    private int somaGanhadores; // Uma variável que irá guardar o número de ganhadores
    private String[] ganhadores; // Declaração de uma array que contém o nome dos ganhadores
    
    public ControleTeleSena(Pessoa[] pessoas, int[] numerosSorteados) {
        this.pessoas = pessoas;
        this.numerosSorteados = numerosSorteados;
    }

    public ControleTeleSena(Pessoa[] pessoas) {
        this.pessoas = pessoas;
        this.numerosSorteados = new int[25];
        this.ganhadores = new String[25];
    }

    public void espera() { //Método para dar alguns delays durante a execução
        try{
            Thread.sleep(10);
        }catch(Exception e){}
    }

    public int[] numerosSorteados() { //Método que gera os números sorteados da tele-sena 
        Random aleatorio = new Random();
        Set<Integer> numGerados = new HashSet<>(); //Foi usado o Set para evitar repetição de números
        while(numGerados.size() < numerosSorteados.length) {
            int numAleatorio = aleatorio.nextInt(60) + 1; //Para cada laço de repetição, um número aleatório é gerado
            numGerados.add(numAleatorio); 
        }
        int i = 0;
        for(int numero : numGerados) {
            numerosSorteados[i] = numero; 
            i++;
        }
        return numerosSorteados;
    }

    public int teleSenasVendidas() { //Método que retorna o número total de tele-senas vendidas
        int soma = 0;
        for(int i = 0; i < pessoas.length; i++) {
            for(int j = 0; j < pessoas[i].getTeleSena().length; j++) {
                if(pessoas[i].getTeleSena()[j] != null) 
                    soma++;  //Para cada tele-sena comprada, será somado o valor de 1, retornando ao final o valor total                        
            }
        }
        return soma;
    }

    public boolean verificaNum(int[] numCj1, int[] numCj2) { //Este método compara os valores dos conjuntos de cada tele-sena com os números sorteados
        somaGanhadores = 0; //Variável que vai somar a quantidade de ganhadores
        int[] numSorteados = numerosSorteados(); //Variável que contém a array de números sorteados
        int soma = 0; //Esta variável será acrescida para cada número sortido que fecha com o número da tele-sena comprada
        for(int i = 0; i < numCj1.length; i++) {
            if(numSorteados[i] != numCj1[i]) { //Caso algum número não seja igual, esse laço é interrompido e o outro conjunto é verificado
                System.out.println("O número "+numCj1[i]+" não confere com o número sorteado, verifique o outro conjunto...");
                break;
            } else if(numSorteados[i] == numCj1[i]){ //Caso o número seja igual, o programa avisa e soma 1
                System.out.println("O "+(i+1)+"°"+" número confere");
                soma++;
            } else if(soma == numCj1.length){ //Se o valor da soma for igual ao tamanho do conjunto, a pessoa ganhou
                System.out.println("PARABÉNS, VOCÊ GANHOU!!!!!!");
                ganhadores[somaGanhadores] = pessoas[somaGanhadores].getNome();
                somaGanhadores++;
                return true; 
            } 
        }
        
            for(int i = 0; i < numCj2.length; i++) {
                if(numSorteados[i] != numCj2[i]) { //É verificado o segundo conjunto, caso algum número não seja igual, a pessoa não tem mais chances com essa cartela
                    System.out.println("O número "+numCj2[i]+" não confere com o número sorteado, boa sorte na próxima...\n");
                    break;
                } else if(numSorteados[i] == numCj2[i]){
                    System.out.println("O "+(i+1)+"°"+" número confere");
                    soma++;
                } else if(soma == numCj2.length){
                    System.out.println("PARABÉNS, VOCÊ GANHOU!!!!!!");
                    ganhadores[somaGanhadores] = pessoas[somaGanhadores].getNome();
                    somaGanhadores++;
                    return true; 
                } 
            }
        return false;
    }

    public int quantGanhadores() { //Este método retorna a quantidade de ganhadores 
        return somaGanhadores;
    }

    public boolean novaTentativa(int[] numCj1, int[] numCj2) {
        int novoNumSorteado = (int)(Math.random()*60 + 1);
        for(int i = 0; i < numCj1.length; i++) {
            if(numCj1[i] == novoNumSorteado) {
                System.out.println("PARABÉNS, VOCÊ GANHOU!!!!!!");
                ganhadores[somaGanhadores] = pessoas[somaGanhadores].getNome();
                somaGanhadores++;
                return true;
            }
            
        }
        for(int i = 0; i < numCj2.length; i++) {
            if(numCj2[i] == novoNumSorteado) {
                System.out.println("PARABÉNS, VOCÊ GANHOU!!!!!!");
                ganhadores[somaGanhadores] = pessoas[somaGanhadores].getNome();
                somaGanhadores++;
                return true;
            }
        }
        return false;
    }

    public void imprimeGanhadores() { //Este método imprime o nome dos ganhadores
        for(String ganhador : ganhadores) 
            System.out.println(ganhador);
    }

    public double valorTeleSenaPremiada() { //Este método retorna o valor do prêmio da tele-sena
        double valor = teleSenasVendidas()*10*0.8;
        return valor;
    }

    public double valorPremio() { //Este método retorna o valor do prêmio de cada ganhador
        double valor = ganhadores.length*10*0.8;
        if(quantGanhadores() == 1) //Caso só haja um, o prêmio será 80% do valor total
            return valor;
        return +valor / quantGanhadores(); //Caso haja mais de um, esse valor será dividido igualmente entre os ganhadores
    } 
    
    public double valorTotal() { //Este método retorna o valor total das vendas de tele-senas
        return teleSenasVendidas()*10.00;
    }

    public String lucroSS() { //Este valor retorna o valor lucrado por Silvio Santos
        return "O lucro de Silvio Santos foi de R$"+valorTotal()*0.2;
    }
}


