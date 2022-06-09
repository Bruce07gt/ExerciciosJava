package exercicios;
// Media de idade
import java.util.Locale;
import java.util.Scanner;

public class ExercicioJava07 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String nome1;
        String nome2;
        int idade1, idade2;

        nome1 = sc.next();
        idade1 = sc.nextInt();
        nome2 = sc.next();
        idade2 = sc.nextInt();
        sc.close();

        double media = (idade1 + idade2) /2;
        System.out.println("A idade média de  "+nome1+" e "+nome2+" é "+media+" anos.");
    }
}
