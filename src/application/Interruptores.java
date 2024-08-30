package application;



public class Interruptores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int lampadaTempoLigadoA = 10; // em minutos
        int lampadaTempoLigadoB = 5;  
        int lampadaTempoLigadoC = 0;
        
        // (Mais quente = mais tempo ligado)
        int temperaturaA = lampadaTempoLigadoA; 
        int temperaturaB = lampadaTempoLigadoB; 
        int temperaturaC = lampadaTempoLigadoC; 
        
        verificarLampadas(temperaturaA, temperaturaB, temperaturaC);
 
	}
	
	public static void verificarLampadas(int a, int b, int c) {
		if(a > b && a > c) {
			System.out.println("a lampada mais quente está no interruptor A, primeiro ligado, 10m");
		}if(b > c) {
			System.out.println("a lampada média está com o interruptor B, segundo ligado, 5m");
		}if (c < a && c < b) {
			System.out.println("A lampada não foi ligada, e está com o interruptor C");
		}
       
	}

}
