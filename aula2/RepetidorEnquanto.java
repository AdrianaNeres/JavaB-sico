package aula2;
import java.util.Random;  // uma classe premontados do Java(biblioteca)

public class RepetidorEnquanto {
    public static void main(String[] args) {

        Random randomico = new Random();

        int c=0;
        double i = 0;
        double t = 0;
        double p = 0;
        while(c < 15) {
            t++;
            i = randomico.nextInt(120);  
            
            if(i % 7 == 0 && i % 12 == 0 && i!=0) {
                c++;
                p = (c/t)*100;  
                System.out.println("Sorteio: "+i+" , multiplo de 7 ou 12, e percentual de sorteio: "+p);
            }         
        }
        System.out.println("--------------------------------------");   
        System.out.println("Ao sortear: "+t+", foram encontrados: "+c+" . Percentual final:" +p);        
    }
}











/*
 * Ampliar para 15 multiplos encontrados entre 7 e 12.
 * Numero de sorteio seja ampliado para 120.
 * Seleção de sorteio sera de multiplos de 7 e 12.
 * O percentual de sorteios pelos numeros de sorteados em porcentagem.
 */