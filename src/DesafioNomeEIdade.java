
import java.util.Scanner;
public class DesafioNomeEIdade {

	public static void main(String[] args) {
		
		/**
		 * Faca um programa que leia um conjunto de dois valores,
		 * o primeiro representando o nome do aluno e o segundo representando a sua idade.
		 * (pare o fluxo inserindo 0 no campo nome)
		 */
		
		Scanner escan = new Scanner(System.in);
		
		int idade;
		String nome;
		
		while(true) {
			System.out.println("Nome: ");
			nome = escan.next();
			if(nome.equals("0"))break;
			System.out.println("Idade: ");
			 idade = escan.nextInt();
		}

	}

}
