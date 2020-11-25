package poo;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		Random generator = new Random();
		int valor = 5000;
		
		int qtd_numero_gerado = 0;
		boolean repetir = true;
		
		do {
	
		boolean continua=true;
		do {
		System.out.print("Informe a quantidade de números que você quer que seja gerado:");
		qtd_numero_gerado = entrada.nextInt();
		if (qtd_numero_gerado <= 0) {
			System.out.println("Entrada inválida, coloque novamente um valor válido:");
		}
		else {
			continua=false;
		}
		} while (continua);
		
		
		
		int n = qtd_numero_gerado;
		int v[] = new int[n];
				
		for (int i = 0; i < n; i++) {
			v[i] = generator.nextInt(valor);
			System.out.print(v[i]+" ");
			
			if(v[i] % 2 == 0)
				System.out.println("É par !");

				else
				System.out.println("É impar!");
        }
		
		int inter = 0;
        for (int a=0; a<n; a++) {
        	for (int b=0; b<n; b++) {
        		if (v[a] < v[b]) {
        			inter = v[b];
        			v[b] = v[a];
        			v[a] = inter;
        		}
        	}
        }
		
		int soma = 0;
	    int menor = v[0];
	    int maior = v[0];
	    
	    for (int i=0; i<n; i++) {
	        soma = soma + v[i];

	        if (v[i] < menor)
	           menor = v[i];

	        if (v[i] > maior)
	           maior = v[i];	        
	      }
	    
	    System.out.printf("\n");
	   
	    for (int i=0; i<n; i++) {
	      if (v[i] == menor)
	        System.out.printf("v[%d] = %2d = Menor número\n", i, v[i]);
	      else if (v[i] == maior)
	              System.out.printf("v[%d] = %2d = Maior número\n", i, v[i]);
	           else System.out.printf("v[%d] = %2d\n", i, v[i]);
	    }
	    
	        
	    System.out.printf("\nSoma = %d\n", soma); 
	    float total = (float)soma / v.length;
        System.out.println("A média é de: "+total);
        
     
        
        System.out.println("Você quer que continue a operação?(1-sim, 2-não)");
        int finalcod = entrada.nextInt();
        if (finalcod == 2) {
        	repetir = false;
        	System.out.println("Operação encerrada");
        }
		} while(repetir);	
        entrada.close();
	}
	     	
		
	}
	
	
