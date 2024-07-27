import java.util.*;

public class MjolnirChallenge {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int NumeroCasos = input.nextInt();

        for (int contador = 0; contador < NumeroCasos; contador++) {
            String nome = input.next();
            int forca = input.nextInt();

            if (nome.equals("Thor")) {
                System.out.println("Y");
            } else {
                System.out.println("N");
            }
        }

        input.close();
    }
}
