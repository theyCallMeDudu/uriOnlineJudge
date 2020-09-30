import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
    int n, pares = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		for(int i = 1; i <= 5; i++) {
			n = scanner.nextInt();
			if(n % i == 0) {
				pares++;
			}
		}
		
		scanner.close();
		
		System.out.println(pares + " valores pares");
 
    }
 
}
