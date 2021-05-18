import java.util.Scanner;

public class Cupom {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		double valorcompra;
		String cupom;
		double valorfinal;
	
		
		System.out.println("Digite o valor da compra: ");
		valorcompra = leitor.nextInt();
		
		System.out.println("Digite o código do cupom: ");
		cupom = leitor.next();
		
		if (cupom.equalsIgnoreCase("DIADEFESTA")) {
			valorfinal = valorcompra * 0.97;
		}else {
			valorfinal = valorcompra;
		}
			
		System.out.println("O valor da ser pago é:  " + valorfinal);
		
		leitor.close();
		
		
	}

}
