import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Locale;

public class AboutMe {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);

        String nome = "";
        String sobrenome = "";
        double altura = 0.0;
        int idade = 0;

        try {
            System.out.println("Digite seu nome: ");
            nome = input.next();
            
            System.out.println("Digite seu sobrenome:");
            sobrenome = input.next();

            System.out.println("Digite sua altura:");
            altura = input.nextDouble();

            System.out.println("Digite sua idade: ");
            idade = input.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Por favor, insira os dados corretamente.");
            input.nextLine();
        }

        if (!nome.isEmpty() && !sobrenome.isEmpty() && altura > 0 && idade > 0) {
            System.out.println("Olá! Me chamo " + nome + " " + sobrenome);
            System.out.println("Tenho " + idade + " anos");
            System.out.println("Minha altura é " + altura);
        } else {
            System.out.println("Não foi possível coletar todas as informações necessárias.");
        }

        input.close();
    }
}