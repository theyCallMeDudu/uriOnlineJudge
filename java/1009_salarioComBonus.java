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
 
        String nome;
		double salarioFixo;
		double totalVendas;
		
		Scanner scan = new Scanner(System.in);
		
		nome = scan.next();
		salarioFixo = scan.nextDouble();
		totalVendas = scan.nextDouble();
		
		totalVendas *= 0.15;
		
		System.out.println("TOTAL = R$ " + String.format("%.2f", salarioFixo + totalVendas));
 
    }
 
}
