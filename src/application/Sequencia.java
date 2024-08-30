package application;


import java.util.Scanner;

public class Sequencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Sequência de Números Ímpares:");
        int n = 10; 
        for (int i = 1; i <= n; i++) {
            System.out.print((2 * i - 1) + " ");
        }
        System.out.println();
        
  
        System.out.println("Sequência de Potências de 2:");
        int x = 1;
        int a = 8;
        for (int i = 0; i < a; i++) { 
            System.out.print(x + " ");
            x *= 2;
        }
        System.out.println();
		
		
        System.out.println("Sequência de Quadrados dos Números Naturais:");
        int b = 8;
        for (int i = 0; i < b; i++) { 
            System.out.print((i * i) + " ");
        }
        System.out.println();
        
        
        System.out.println("Sequência de Quadrados dos Números Pares:");
        for (int i = 1; i <= 5; i++) {
            System.out.print((i * 2) * (i * 2) + " ");
        }
        System.out.println();

        // Sequência de Fibonacci
        System.out.println("Sequência de Fibonacci:");
        int num1 = 0; // Primeiro número
        int num2 = 1; // Segundo número
        int numElements = 8; 

        
        System.out.print(num1 + " " + num2);

    
        for (int i = 2; i < numElements; i++) {
            int nextNum = num1 + num2;
            System.out.print(" " + nextNum);

           
            num1 = num2;
            num2 = nextNum;
        }
        System.out.println();
		
			
 
		
		
		sc.close();
	}

}
