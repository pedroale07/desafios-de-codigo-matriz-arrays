import java.util.Scanner;

public class ParEImpar {

	public static void main(String[] args) {
		 
		/**
		 * faca um programa que leia N numeros inteiros
		 * calcule e mostre a quantidade de numeros pares e impares
		 */
		
		Scanner escan = new Scanner(System.in);
		int quantidadeDeNumeros;
		int numero; 
		int quantPares = 0, quantImpares = 0;
	
		
		System.out.println("Quantidade de numeros");
		quantidadeDeNumeros = escan.nextInt();
			
		int cout = 0;
		do {
			System.out.println("Numero: ");
			numero = escan.nextInt();
			
			if(numero % 2==0) quantPares++;
			else quantImpares++;
			
		}while(cout<quantidadeDeNumeros);
			System.out.println("Quantidade de numeros pares: "+quantPares);
			System.out.println("Quantidade de numeros impares: "+quantImpares);
	}

}
