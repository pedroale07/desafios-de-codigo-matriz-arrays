import java.util.Scanner;
public class DesafioNota {

	public static void main(String[] args) {
		
		/**
		 * faca um programa que pe�a uma nota, entre zero e dez.
		 * mostre uma mensagem caso o valor seja invalido e continue pedindo at� que o usuario
		 * informe um valor valido
		 */
		
		Scanner escan = new Scanner(System.in);
		
		int nota;
		
		System.out.println("Nota: ");
		nota = escan.nextInt();

		
		while(nota<0 | nota>10) {
			System.out.println("Nota inv�lida, digite novamente!");
			nota = escan.nextInt();
		}
	}

}
