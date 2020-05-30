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
 
        double A, B, C = 0;
        double media = 0;
        
        Scanner scan = new Scanner(System.in);
        A = scan.nextDouble();
        B = scan.nextDouble();
        C = scan.nextDouble();
        scan.close();
        
        A *= 2;
        B *= 3;
        C *= 5;
        
        media = (A + B + C) / 10;
        
        System.out.println("MEDIA = " + String.format("%.1f", media));
 
    }
 
}
