package exercJavaCondicao;

import java.util.Locale;
import java.util.Scanner;
//Média entre idades
public class ExercicioJava18 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double media ;
        int idade;

        System.out.println("Digite as idades: ");
        idade = sc.nextInt();

        if (idade < 0) {
            System.out.println("IMPOSSIVEL CALCULAR");
        } else {
            int soma = 0;
            int contagem = 0;
            while (idade >= 0) {
                soma = soma + idade;
                contagem++;
                idade = sc.nextInt();
            }
            media = soma / contagem;
            System.out.printf("MEDIA =%.2f\n",media);
        }
    }
}
