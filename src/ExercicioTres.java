import java.util.Scanner;

public class ExercicioTres {
    public static void main(String[] String) {
        Scanner sc = new Scanner(System.in);

        int verificaoNumero = sc.nextInt();

        if (verificaoNumero < 0) {
            System.out.println("NEGATIVO");
        } else {
            System.out.println("POSITIVO");
        }

        sc.close();
    }
}
