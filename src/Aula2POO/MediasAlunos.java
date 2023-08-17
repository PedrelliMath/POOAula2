package Aula2POO;

import java.util.Scanner;

public class MediasAlunos {
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		int sum = 0;
		
		for(int i = 0; i < 4; i++) {
			
			System.out.println("Digite a nota " + (i + 1) + ":");
			
			sum += leitor.nextInt();	
		}
		
		System.out.println("A media e: " + (float)sum/4);
		
		leitor.close();
	}
}
