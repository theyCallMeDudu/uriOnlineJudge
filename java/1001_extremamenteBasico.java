import java.io.IOException;
import java.util.Scanner;

/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {
 
    public static void main(final String[] args) throws IOException {

		int A;
		int B;

		final Scanner entrada = new Scanner(System.in);
		A = entrada.nextInt();
		B = entrada.nextInt();
		entrada.close();
		
		System.out.println("X = " + (A + B));
 
    }
 
}
