import java.util.Scanner;

public class MaiorEMedia {

	public static void main(String[] args) {
	
		/**
		 * Faca um programa que leia 5 numeros
		 * e informe o maior numero e a media desses numeros
		 */
		
		Scanner escan = new Scanner(System.in);
		
		int numero;
		int maior = 0;
		int soma = 0; 
		
		
		int cout = 0;
		do {
			System.out.println("Numero: ");
			numero = escan.nextInt();
			
			soma +=numero;
			
			if(numero>maior) maior = numero;
			
			cout++;
		}while(cout<5);
		System.out.println("Maior: "+ maior);
		System.out.println("Media: "+ (soma/5));
	}

}
