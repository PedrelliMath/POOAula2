package Aula2POO;

import java.util.Scanner;

public class Lata {

		public static void main(String[] args) {
			
			Scanner leitor = new Scanner(System.in);
			
			double volume = 0, raio = 0, altura = 0;
			
			System.out.println("Digite o valor do raio: ");
			raio = leitor.nextFloat();
			
			System.out.println("Digite o valor do altura: ");
			altura = leitor.nextFloat();
			
			volume = 3.14159D * raio * raio * altura;
			
			System.out.println("O volume e: " + volume);
			
			leitor.close();
		}
}
