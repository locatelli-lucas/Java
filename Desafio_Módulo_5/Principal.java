package Desafio_Módulo_5;

import java.util.HashSet;
import java.util.Set;

public class Principal {
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[20]; //Referência para a array de pessoas
        String[] nomes = {"Miguel", "João", "Maria", "Pedro", "Ana", "Lucas", "Beatriz", "Gabriel", "Letícia", "Mateus", "Laura", "Felipe", "Sofia", "Rafael", "Juliana","Samuel", "Isabela", "Gustavo", "Manu", "Enzo"}; //Nomes dos participantes
        
        TeleSena[] teleSena = new TeleSena[300]; //Referência para a array de tele-senas
        ControleTeleSena c = new ControleTeleSena(p); //Referência para o objeto de controle
        c.numerosSorteados(); //Sorteio dos números da tele-sena

        for(int i = 0; i < teleSena.length; i++) { //Aqui são criados os objetos teleSena
            Set<Integer> cj1 = new HashSet<>(); //Foi usado o Set para não haver repetição de números
            Set<Integer> cj2 = new HashSet<>();

            while(cj1.size() < 25) {
                int numAleatorio = (int)(Math.random()*60) + 1;
                cj1.add(numAleatorio);
            }
            while(cj2.size() < 25) {
                int numAleatorio = (int)(Math.random()*60) + 1;
                cj2.add(numAleatorio);
            }
            int[] cj1Array = cj1.stream().mapToInt(Integer::intValue).toArray(); //Fluxo de elementos para converter tudo em uma array
            int[] cj2Array = cj2.stream().mapToInt(Integer::intValue).toArray();

            teleSena[i] = new TeleSena(10, cj1Array, cj2Array); //Criação do objeto teleSena
        }


    
        for(int i = 0; i < p.length; i++) { //Em cada laço, é gerado um objeto de pessoa
            int teleSenasCompradas = (int)(Math.random()*15) + 1; //Aqui é definido uma quantidade aleatória de tele-senas compradas pela pessoa 
            p[i] = new Pessoa(nomes[i], new TeleSena[teleSenasCompradas], teleSenasCompradas); //Criação do objeto pessoa 
        }

        for(int i = 0; i < p.length; i++) { //Em cada laço, uma pessoa compra determinadas tele-senas
            for(int j = 0; j < p[i].getTeleSena().length; j++) {//Em cada laço, é defindo aleatóriamente quais as tele-senas foram compradas
                int randomTeleSena = (int)(Math.random()*299);
                p[i].getTeleSena()[j] = teleSena[randomTeleSena];
            }
        }

        for(int i = 0; i < p.length; i++) { //Comparação dos números sorteados com os conjuntos das tele-senas de cada pessoa
            for(int j = 0; j < p[i].getTeleSena().length; j++) {
                System.out.println("Tele sena "+(j+1)+" de "+p[i].getNome()+": \n");
                c.verificaNum(p[i].getTeleSena()[j].getCj1(), p[i].getTeleSena()[j].getCj2());
                c.espera();
            }
            c.espera();
        }  

        System.out.println("Os números sorteados eram: ");
        c.espera();
        int[] numSorteados = c.numerosSorteados();
        for(int i : numSorteados) { //Impressão dos números sorteados
            System.out.println(i);
            c.espera();
        }
        
        c.espera();
        if(c.quantGanhadores() == 0)  {//Caso não haja ganhadores, essa mensagem é impressa
            boolean verificaGanhadores = c.quantGanhadores() > 0;
            System.out.println("Nesta edição não tivemos ganhadores...Será sorteado um novo número");
            c.espera();
            while (!verificaGanhadores) {
                for (int i = 0; i < p.length; i++) {
                    for (int j = 0; j < p[i].getTeleSena().length; j++) 
                    c.novaTentativa(p[i].getTeleSena()[j].getCj1(), p[i].getTeleSena()[j].getCj2());
        }
        verificaGanhadores = c.quantGanhadores() > 0;
    }
            System.out.println("O valor do prêmio será de R$"+c.valorPremio());
            c.espera();
            } else {
            System.out.println("Nesta edição, tivemos "+c.quantGanhadores()+"ganhadores..."); //Mostra a quantidade de ganhadores
            c.espera();
            System.out.println("Os ganhadores são: ");
            c.imprimeGanhadores();  //Imprime o nome dos ganhadores
            c.espera();
            System.out.println("O valor do prêmio será de R$"+c.valorPremio()); //Imprime o valor total do prêmio
        }
        System.out.println("Foram vendidas um total de "+c.teleSenasVendidas()+" Tele-senas");//Impressão do número de tele-senas vendidas
        c.espera();
        System.out.println("O valor total de Tele Senas vendidas foi de R$ "+c.valorTotal()); //Imprime o valor total das tele-senas vendidas
        c.espera();
        System.out.println(c.lucroSS()); //Imprime o lucro do Silvio Santos
        c.espera();
    }   
}
