import java.io.IOException;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
    int valor = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		valor = scanner.nextInt();
		
        for (int i = 0; i <= 11; i++) {
            if (valor % 2 != 0) {
                System.out.println(valor);
                valor += 1;
            } else
                valor += 1;
        }
      
    }
 
}
