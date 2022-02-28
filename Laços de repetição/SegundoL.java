public class SegundoL {
    public static void main(String[] args) {
        
        int i = 0; //Cria e define a variável de incremento
        while (i < 5) { //Cria o while e define sua condição
            if (i > 3) { //Cria um if e define sua condição
                System.out.println(i + " maior do que 3"); //Imprime a mensagem
            }
            else { //Else para o caso da condição do if ser falsa
                System.out.println(i + " menor do que 3"); //Imprime a mensagem
            }
            i++; //Incrementa 1 na variável de incremento
        }
    }
}
