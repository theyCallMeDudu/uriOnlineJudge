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
 
        int number, hours = 0;
		double value = 0;
		
		Scanner scan = new Scanner(System.in);
		
		number = scan.nextInt();
		hours = scan.nextInt();
		value = scan.nextDouble();
		value *= hours; 
		
		System.out.println("NUMBER = " + number);
		System.out.println("SALARY = U$ " + String.format("%.2f", value));
 
    }
 
}
