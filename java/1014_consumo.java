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
 
        int distancia;
      	double preco, consumo;
      
      	Scanner scan = new Scanner(System.in);
      
        distancia = scan.nextInt();
        preco = scan.nextDouble();
        consumo = distancia / preco;
      
        System.out.println(String.format("%.3f", consumo) + " km/l");
      
    }
 
}
