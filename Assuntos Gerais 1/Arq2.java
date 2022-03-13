import java.util.Scanner;

public class Arq2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira a sua altura: ");
		double alt = sc.nextDouble();
		System.out.println("Insira o seu gênero: ");
		sc.nextLine();
		String gen = sc.nextLine();
		double pesoIdeal;
		if (gen.equalsIgnoreCase("Feminino")) {
			pesoIdeal = (62.1 * alt) - 44.7;
			System.out.println("Peso ideal: " + pesoIdeal);
		}
		else if (gen.equalsIgnoreCase("Masculino")) {
			pesoIdeal = (72.7 * alt) - 58;
			System.out.println("Peso ideal: " + pesoIdeal);
		}
	}
}