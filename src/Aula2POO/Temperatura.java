package Aula2POO;

import java.util.Scanner;

public class Temperatura {
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em graus celcius: ");
		
		float grausC = leitor.nextFloat();
		
		float grausF =  grausC * 1.8F + 32;
		float grausK =  grausC + 273.15F;
		float grausRe = grausC * 0.8F;
		float grausRa = grausC * 1.8F + 32 + 459.67F;
		
		System.out.println("Graus Celcius = " + grausC + "\nGraus Reaumur = " + grausRe + "\nGraus Rankine = " + grausRa);
		System.out.println("Graus Kelvin = " + grausK + "\nGraus Fahrenheit = " + grausF);
		
		leitor.close();
	}
}
