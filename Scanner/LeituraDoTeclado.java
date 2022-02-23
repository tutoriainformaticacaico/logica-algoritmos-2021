import java.util.Scanner; //Importação do scanner

public class LeituraDoTeclado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //Cria e instância o objeto do scanner
        System.out.println("Insira um número: ");
        /* int num = sc.nextInt(); */
        int num;
        num = sc.nextInt();
        /* String palavra = sc.nextLine(); */
        /* char letra = sc.next().charAt(0); */
        System.out.println(num);
    }
}
