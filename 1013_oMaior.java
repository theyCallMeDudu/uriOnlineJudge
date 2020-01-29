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
 
       int a, b, c, maiorAB;
      
       Scanner scan = new Scanner(System.in);
			 
       a = scan.nextInt(); 
       b = scan.nextInt();
       c = scan.nextInt();
      
       maiorAB = (a + b + Math.abs(a - b)) / 2;
         
       if(maiorAB > c) {
       		System.out.println(maiorAB + " eh o maior");  
       } else {
        	System.out.println(c + " eh o maior"); 
       }
      
    }
 
}
