public class TerceiroL {
    public static void main(String[] args) {

        int i = 0; //Cria a variável de incremento e atribui um valor padrão (0)
        int x = 3; //Cria uma variável com valoro 3

        do { //Cria o bloco de código do, que sempre será executado pelo menos uma vez, mesmo que a condição do while nunca seja verdadeira
            System.out.println("Essa frase vai ser impressa pelo menos uma vez"); //Imprime uma mensagem
            i++; //Incrementa 1 na variável de i
        } while (i < x); //Define a condição do do-while
    }
}
