public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        // tipos primitivos        
        double salarioMinimo = 2500.33;

        // um tipo de variável que comporta um número maior, não poderá ser convertido para um tipo menor. Exceto se adicionarmos o tipo menor antes do número maior.
        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal; // adicionar o (short) é denominado de cast.

        // Constantes
        final int NUMERO = 5;

        // NUMERO = 10  é possível 
    }
}
