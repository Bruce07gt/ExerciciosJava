package exercJavaCondicao;

//Condicao para aumento de salario
import java.util.Locale;
import java.util.Scanner;

public class ExercicioJava16 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double salario, novoSalario, aumento;
        int porcentagem;

        System.out.println("Digite seu salario atual: ");
        salario = sc.nextDouble();

        if (salario <= 1000) {
            porcentagem = 20;
        } else if (salario <= 3000) {
            porcentagem = 15;
        } else if (salario <= 8000) {
            porcentagem = 10;
        } else {
            porcentagem = 5;
        }

        aumento = salario * porcentagem /100;
        novoSalario = salario + aumento;
        System.out.printf("Seu salario atual é de %.2f\n\n", novoSalario);
        System.out.printf("Seu aumento foi de %.2f\n\n", aumento);
        System.out.println("Em porcentagem foi "+porcentagem+"%");
    }
}
