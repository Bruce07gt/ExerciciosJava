package exercJavaCondicao;

import java.util.Locale;
import java.util.Scanner;

//Resolução de Bhaskara
public class ExercicioJava10 {


    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double a, b, c;
        double x1 = 0.0;
        double x2 ;
        double delta;
        System.out.println("Digite o valor de a: ");
        a = sc.nextDouble();
        System.out.println("Digite o valor de b: ");
        b = sc.nextDouble();
        System.out.println("Digite o valor de c: ");
        c = sc.nextDouble();
        sc.close();

        delta = Math.pow(b,2) - 4 * a *c;

        if ((a == 0) || (delta < 0)) {
            System.out.println("Essa equação não possui raízes");
        } else  x1 = (-b + Math.sqrt(delta)) / (2 * a);
        System.out.printf("%.4f\n", x1);
        x2 = (-b - Math.sqrt(delta)) / (2 * a);
        System.out.printf("%.4f", x2);

    }
}
