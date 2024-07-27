import java.util.*;

public class PulandoNomes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] nomes = new String[10];
        
        try {
            for (int i = 1; i <= 10; i++) {
                nomes[i] = input.nextLine();

                switch (i) {
                    case 3:
                        System.out.println(nomes[3]);
                        break;
                    case 7:
                        System.out.println(nomes[7]);
                        break;
                    case 9:
                        System.out.println(nomes[9]);
                        break;
                }
            }
        } catch (ArrayIndexOutOfBoundsException e){}
        
        input.close();
    }
}