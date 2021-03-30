import java.util.Locale;
import java.util.Scanner;

public class Uri1012 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		float A = sc.nextFloat();
		float B = sc.nextFloat();
		float C = sc.nextFloat();
		double pi = 3.14159;
		float triangulo = (float) (A * C / 2.0);
		float circulo = (float) (pi * Math.pow(C, 2));
		float trapezio = (float) (((A + B) * C) / 2.0);
		float quadrado = (float) (Math.pow(B, 2));
		float retangulo = (float) (A * B);

		System.out.printf("TRIANGULO: %.3f%n", triangulo);
		System.out.printf("CIRCULO: %.3f%n", circulo);
		System.out.printf("TRAPEZIO: %.3f%n", trapezio);
		System.out.printf("QUADRADO: %.3f%n", quadrado);
		System.out.printf("RETANGULO: %.3f%n", retangulo);

		sc.close();
	}

}
