import java.util.InputMismatchException;
import java.util.Scanner;

public class PedraPapelAtaqueAereo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int casoTeste = input.nextInt();

        try {for (int contador = 0; contador < casoTeste; contador++) {
                String jogador1 = input.next();
                String jogador2 = input.next();

                if (jogador1.equalsIgnoreCase("ataque") && 
                jogador2.equalsIgnoreCase("ataque")) {
                    System.out.println("aniquilacao mutua");
                } else if (jogador1.equalsIgnoreCase("ataque") || 
                (jogador1.equalsIgnoreCase("pedra") && jogador2.equalsIgnoreCase("papel"))) {
                    System.out.println("jogador 1 venceu");
                } else if (jogador2.equalsIgnoreCase("ataque") || 
                (jogador2.equalsIgnoreCase("pedra") && jogador1.equalsIgnoreCase("papel"))) {
                    System.out.println("jogador 2 venceu");
                } else if (jogador1.equalsIgnoreCase("papel") && 
                jogador2.equalsIgnoreCase("papel")) {
                    System.out.println("Ambos venceram");
                } else if (jogador1.equalsIgnoreCase("pedra") && 
                jogador2.equalsIgnoreCase("pedra")) {
                    System.out.println("Sem ganhador");
                }
            }} catch (InputMismatchException e){
                System.out.println("Entrada inválida. Por favor insira os dados corretamente");
            }
    }
}