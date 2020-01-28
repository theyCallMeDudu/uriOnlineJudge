package area;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double A, B, C;
		
		Scanner scan = new Scanner(System.in);
		
		A = scan.nextDouble();
		B = scan.nextDouble();
		C = scan.nextDouble();
		
		scan.close();
		
		double areaTriRet = A * C / 2;
		double areaCirc = 3.14159 * Math.pow(C, 2);
		double areaTrap = (A + B) * C / 2;
		double areaQuad = Math.pow(B, 2);
		double areaRet = A * B;
		
		System.out.println("TRIANGULO: " + String.format("%.3f", areaTriRet));
		System.out.println("CIRCULO: "   + String.format("%.3f", areaCirc));
		System.out.println("TRAPEZIO: "  + String.format("%.3f", areaTrap));
		System.out.println("QUADRADO: "  + String.format("%.3f", areaQuad));
		System.out.println("RETANGULO: " + String.format("%.3f", areaRet));
	}

}
