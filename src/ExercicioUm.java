import java.util.Locale;
import java.util.Scanner;

public class ExercicioUm {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String nomeDoAluno = sc.nextLine();

        double notaAluno1 = sc.nextDouble();
        double notaAluno2 = sc.nextDouble();
        double notaAluno3 = sc.nextDouble();
        double notaAluno4 = sc.nextDouble();

        double calcularMedia = (notaAluno1 + notaAluno2 + notaAluno3 + notaAluno4) / 4;

        System.out.println("Aluno: " + nomeDoAluno);
        System.out.printf("Media: %.2f%n",calcularMedia);
        sc.close();
    }
}
