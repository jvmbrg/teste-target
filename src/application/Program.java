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
		/* 2º)
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
		*/
		
		/* 3º)
		int indice = 12, soma = 0, k = 1;
		for(int i=0; k<indice; i++) {
			k += 1;
			soma += k;
		}
		System.out.println("Soma: "+soma); //Resultado = 77
		*/
		
		 	a) 1,3,5,7,9 - aumenta 2
		 	b) 2,4,8,16,32,64,128 - multiplica por 2
		 	c) 0,1,4,9,16,25,36,49 - ordem crescente dos numeros elevados ao quadrado
		 	d) 4,16,36,64,100 - ordem crescente de numeros pares elevado ao quadrado
		 	e) 1,1,2,3,5,8 - fibonnaci
		 	f) 2,10,12,16,17,18,19,20 - sequencia de numeros que tem a letra i na escrita em ingles 
		 
		sc.close();
	}
}
