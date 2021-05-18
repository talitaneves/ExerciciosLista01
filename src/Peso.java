import java.util.Scanner;

public class Peso {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int peso1;
		int peso2;
		int peso3;
		int peso;
		
		
		System.out.println("Digite o primeiro peso: ");
		peso1 = leitor.nextInt();
		
		System.out.println("Digite o segundo peso: ");
		peso2 = leitor.nextInt();
		
		System.out.println("Digite o terceiro peso: ");
		peso3 = leitor.nextInt();
		
		if ((peso1 < peso2) && (peso1 < peso3)){
			peso = peso1;
			System.out.println("O drone deve carregar o lixo de peso: " + peso);
			
		}else {
			if ((peso2 < peso1) && (peso2 < peso3)){
				peso = peso2;
				System.out.println("O drone deve carregar o lixo de peso: " + peso);
				
			}else {
				peso = peso3;
				System.out.println("O drone deve carregar o lixo de peso: " + peso);
				
			}
					
			
		}
		
		leitor.close();
		
	}

}


