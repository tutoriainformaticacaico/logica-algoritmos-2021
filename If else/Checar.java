import java.util.Scanner; //Importa o scanner

public class Checar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //Cria e instância o scanner
        System.out.println("Insira um valor: ");
        int valor1 = sc.nextInt();
        System.out.println("Insira outro valor: ");
        int valor2 = sc.nextInt();
        if (valor1 > valor2) {
            System.out.println(valor1 + " > " + valor2);
        }
        else {
            System.out.println(valor2 + " > " + valor1);
        }
    }
}
