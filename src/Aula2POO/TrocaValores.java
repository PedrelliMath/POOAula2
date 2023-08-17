package Aula2POO;

import java.util.Scanner;

public class TrocaValores {
	
	public static void main(String[] args) {
		
		String nome1 = "mestre do universo";
	
		Scanner leitor = new Scanner(System.in);
	
		System.out.println("Digite o nome2: ");
		
		String nome2 = leitor.next();
		
		System.out.println("Nome1: " + nome1 + " Nome2: " + nome2);
		
		String temp = nome2;
		
		nome2 = nome1;
		
		nome1 = temp;
		
		System.out.println("Nome1: " + nome1 + " Nome2: " + nome2);
		
		leitor.close();
		
		
	}
	
}
