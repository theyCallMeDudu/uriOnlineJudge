import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
     int numero = 0;
		
		 Scanner scanner = new Scanner(System.in);
		
		 numero = scanner.nextInt();
		
		 for(int i = 1; i <= numero; i++) {
			 if(numero % i == 0) {
				 System.out.println(i);
			 }
		 }
    }
 
}
