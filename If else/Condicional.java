public class Condicional {
    public static void main(String[] args) {

        //Testando a estrutura de if else simples

        int x = 2;

        if (x > 3) { //Verifica se a condição é verdadeira
            System.out.println("X é maior do que o outro valor"); //Executa se se a condição for verdadeiro
        }
        else { //Caso em que a condição é falsa
            System.out.println("X não é maior do que o outro valor"); //Executa se o if for falso
        }

        //Testando uma estrutura mais complexa de if else (diversas condições)

        int y = 7;
        int z = 11;

        if (y == z) {
            System.out.println("Y igual a Z");
        }
        else if (y < z) {
            System.out.println("Y é menor do que Z");
        }
        else if (y > z) {
            System.out.println("Y é maior do que Z");
        }
        /* else {
            System.out.println("Todas as outras condições eram falsas");
        } */
        

    }
}
