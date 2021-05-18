import java.util.Scanner;

public class NumerosInteiros {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int numero1;
		int numero2;
	
		
		System.out.println("Digite o primeiro número: ");
		numero1 = leitor.nextInt();
		
		System.out.println("Digite o segundo número: ");
		numero2 = leitor.nextInt();
		
		numero1 = numero1 + numero2;
		numero2 = numero1 - numero2;
		numero1 = numero1 - numero2;
		
		System.out.println("O primeiro número é:  " + numero1);
		System.out.println("O segundo número é:  " + numero2);
		
		
		leitor.close();
				

	}

}
