package application;


import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe um número para calcular a sequência de Fibonacci!");
        int n = sc.nextInt();

        int numero1 = 0; // penúltimo
        int numero2 = 1; // último

        // Verifica se o número informado é 0 ou 1
        if (n == 0 || n == 1) {
            System.out.println("O número " + n + " faz parte da sequência de Fibonacci.");
            sc.close();
            return;
        }

        // Calcula a sequência de Fibonacci e verifica se o número faz parte
        for (int i = 2; i<n ; i++) { // Loop infinito, será interrompido com o break
            int numSequencia = numero1 + numero2;

            if (numSequencia == n) {
                System.out.println("O número " + n + " faz parte da sequência de Fibonacci.");
                sc.close();
                return;
            }

            // Atualiza valores
            numero1 = numero2;
            numero2 = numSequencia;

            // Se o próximo número da sequência for maior que o número informado, não faz parte
            if (numSequencia > n) {
                System.out.println("O número " + n + " não faz parte da sequência de Fibonacci.");
                sc.close();
                return;
            }
        }
    }
}
