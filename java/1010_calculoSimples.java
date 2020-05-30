import java.io.IOException;
import java.util.Scanner;

/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {
 
    public static void main(String[] args) throws IOException {
 
    int codPeca1, numPecas1, codPeca2, numPecas2;
		double valorPeca1, valorPeca2;
		
		Scanner scan = new Scanner(System.in);
		
		codPeca1 = scan.nextInt();
		numPecas1 = scan.nextInt();
		valorPeca1 = scan.nextDouble();
		
		codPeca2 = scan.nextInt();
		numPecas2 = scan.nextInt();
		valorPeca2 = scan.nextDouble();
		
		valorPeca1 *= numPecas1;
		valorPeca2 *= numPecas2;
		
		System.out.println("VALOR A PAGAR: R$ " + String.format("%.2f", valorPeca1 + valorPeca2));
    }
 
}
