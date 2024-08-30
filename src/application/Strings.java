package application;


import java.util.Scanner;

public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// TODO Auto-generated method stub
	
				Scanner sc = new Scanner(System.in);
				
				System.out.println("Escreva uma  palavra");
				String palavra = sc.nextLine();
				
				int n = 0;
				
				 // Converte p minúscula p facilitar 
		        String palavraMinuscula = palavra.toLowerCase();
		        
				for(int i=0; i< palavraMinuscula.length(); i++) {
					if(palavraMinuscula.charAt(i) == 'a') {
						n++;//atribuição em cada loop, quantas vezes achar o A
					}
					
				}
				System.out.println("A letra 'a' ocorre " + n + " vezes na string.");
				
				sc.close();

	}

}
