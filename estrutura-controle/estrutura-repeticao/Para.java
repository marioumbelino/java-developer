public class Para {
    public static void main(String[] args) {
        String alunos[] = {"Mário", "Talita", "Maria"};     

        for (String aluno: alunos) {
            System.out.println(aluno);
            if (aluno == "Talita") {
                break;
            }
        }

    }
}