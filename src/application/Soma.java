package application;


import java.util.Scanner;


public class Soma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int indice = 12;
		int soma = 0;
		int k = 0;
		
		while (k <= indice) {
			k = k + 1;
			soma = soma + k ;
			
			
		}
		
		System.out.println(soma);
		
		
		
		sc.close();

	}

}
