import java.util.Scanner;

public class NumeroFatorial {

	public static void main(String[] args) {
		

		Scanner escan = new Scanner(System.in);
		int numeroFatorial = escan.nextInt(); 
		
		int multiplicacao = 1;
		for(int i = numeroFatorial;i>=1;i--) {
			multiplicacao *= i; 
		}
		System.out.println(multiplicacao);
	}

}
