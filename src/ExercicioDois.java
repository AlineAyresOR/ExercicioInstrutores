import java.util.Scanner;

public class ExercicioDois {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua senha:");
        String senhaUsuario = "0";

        while (!senhaUsuario.equals("123ABC")) {
            System.out.println("Acesso negado! tente novamente");
            senhaUsuario = sc.nextLine();
        }

        System.out.println("Acesso permitido!");
        sc.close();
    }

}

