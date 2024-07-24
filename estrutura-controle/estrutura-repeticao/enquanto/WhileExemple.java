package enquanto;
import java.util.concurrent.ThreadLocalRandom;

public class WhileExemple {
    public static void main(String[] args) {
        double mesada = 50.0;

        while (mesada > 0) {
            double valorDoce = valorAleatorio();
            if (valorDoce < mesada) {
                mesada -= valorDoce;
            } else {
                System.out.println("João gastou toda sua mesada");
                break;
            }
        }
    }

    public static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2, 8);
    }

}
