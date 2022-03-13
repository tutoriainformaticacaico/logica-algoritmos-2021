import java.util.Scanner;

public class Arq1 {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Insira um valor: ");
    	double valor = sc.nextDouble();
    	//Juros simples: (capital * tempo * taxa)/100
    	double juros = (valor*1*0.70)/100;
    	//Novo valor após um mês
    	valor = valor + juros; //Montante
    	System.out.println("Valor após um mês: " + valor + "\nJuros: " + juros);
    }
}