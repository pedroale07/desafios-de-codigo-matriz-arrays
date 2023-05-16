import java.util.Scanner;

public class DesafioTabuada {

	public static void main(String[] args) {

		/**
		 * desenvolva uma tabuada que possa devolver para o usuario qualquer tabuada de multiplicação
		 * entre 1 e 10
		 */
		
		Scanner escan = new Scanner(System.in);
		
		int tabuada;
		
		System.out.println("Qual a tabuada: ");
		tabuada = escan.nextInt();
		
		System.out.println("tabuada de"+ tabuada);
		
		for(int i = 1;i<=10;i++) {
			System.out.println(tabuada+" X "+i+"="+(tabuada*i));
		}
		
		
		
		
		
	}

}
