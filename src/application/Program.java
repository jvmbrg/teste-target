package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
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

}
