import java.util.Scanner; //Importa o scanner

public class Checar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //Cria e instância o scanner
        System.out.println("Insira um valor: "); //Pede um valor
        int valor1 = sc.nextInt(); //Armazena o número que o usuário digitar em valor1
        System.out.println("Insira outro valor: "); //Pede um valor
        int valor2 = sc.nextInt(); //Armazena o número que o usuário digitar em valor2

        //Verifica se o primeiro número é maior do que o segundo
        if (valor1 > valor2) {
            System.out.println(valor1 + " > " + valor2); //Imprime que o primeiro valor é > que o segundo
        }
        else { //Caso o if seja falso
            System.out.println(valor2 + " > " + valor1); //Imprime que o segundo valor é > que o primeiro
        }
    }
}
