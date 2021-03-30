import java.util.Locale;
import java.util.Scanner;

public class Exercicios01 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// Fazer um programa para ler:
		// Medidas da Largura
		// Comprimento do terreno retangular
		// Em seguida o programa deve mostrar o valor da AREA DO TERRENO, VALOR DO
		// TERRENO com duas casas decimais.

		double largura = sc.nextDouble();
		double comprimento = sc.nextDouble();
		double areaTerreno = sc.nextDouble();
		double area = largura * comprimento;
		double valorTerreno = areaTerreno * area;

		System.out.printf("Área = %.2f%n", area);
		System.out.printf("Preço = %.2f%n", valorTerreno);

		sc.close();
	}

}
