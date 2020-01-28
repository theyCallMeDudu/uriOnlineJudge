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
 
        double n = 3.14159;
        double raio = 0;
        double area = 0;
        
        Scanner scan = new Scanner(System.in);
        raio = scan.nextDouble();
        scan.close();
        
        area = n * (raio * raio);
        
        System.out.println("A=" + String.format("%.4f", area));
 
    }
 
}
