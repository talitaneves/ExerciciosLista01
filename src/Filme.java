import java.util.Scanner;

public class Filme {
	
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int tempo;
		int duracaosegundo;
		int duracaohora;
		
		
		
		System.out.println("Digite o tempo do filme em minutos:");
		tempo = leitor.nextInt();
		
		duracaosegundo = tempo * 60;
		duracaohora = tempo / 60;
		
	    System.out.println("O filme possue: " + duracaohora + " hora de duração");          		            
        System.out.println("O filme possue: " + duracaosegundo + " segundos de duração");
 			        
		
		leitor.close();
	}

}
