package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/* 1º) 
		System.out.print("Digite um número: ");
		int n = sc.nextInt();
		System.out.println("--------------------------------------------");
		System.out.println("Sequência de Fibonacci até " + n + " termos:");

		for (int i = 0; i < n; i++) {
			System.out.print(fibonacci(i) + " ");
		}
		
		sc.close();

	}

	//Método para calcular o n-ésimo termo da sequência de Fibonacci
	public static int fibonacci(int n) {
		if (n <= 1) {
			return n;
		}
		return fibonacci(n - 1) + fibonacci(n - 2);
	}
	*/
		System.out.print("Digite uma palavra: ");
		String palavra = sc.nextLine();
		char letra = 'a';
		int total = 0;
	
		for(int i=0; i < palavra.length();i++) {
			if(palavra.toLowerCase().charAt(i) == letra) {
				total += 1;
			}
		}
		
		System.out.println("Total de 'a': " + total);
		sc.close();
	}
}
