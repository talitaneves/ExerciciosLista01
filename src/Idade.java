import java.util.Scanner;

public class Idade {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int ano;
		int idade;
		
		System.out.println("Digite o seu ano de nascimento:");
		ano = leitor.nextInt();
		
		idade = 2021 - ano;
		
		System.out.println("Em 2021 você terá: " + idade + " anos");
		
		
		leitor.close();
	}

}
