package Aula2POO;

import java.util.Scanner;

public class Tabuada {
	
	public static void main(String[] args){
		
		Scanner leitor = new Scanner(System.in);
		
		int num = 0;
		
		System.out.println("Digite o numero: ");
		
		num = leitor.nextInt();
		
		for(int i = 0; i <= 10; i++) {
			
			System.out.println(num + " * " + i + " = " + num * i);
		}
		
		leitor.close();
		
	}
	
}
