import java.util.Scanner;

public class Combate {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int distancia;
		
		
		System.out.println("Informe a dist�ncia do inimigo:");
		distancia = leitor.nextInt();
		
		if (distancia < 70) {
			System.out.println("ATIVADO");
		}else {
			System.out.println("DESATIVADO");
			
		}
		
		leitor.close();
			

	}

}
