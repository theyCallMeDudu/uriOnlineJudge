import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        /**
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
         */
        int N, horas, minutos, segundos = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		N = scanner.nextInt();
		
		horas = N / 3600;
		
		minutos = (N % 3600) / 60;
		
		segundos = (N % 3600) % 60;
		
		System.out.println(horas + ":" + minutos + ":" + segundos);
    }
 
}
