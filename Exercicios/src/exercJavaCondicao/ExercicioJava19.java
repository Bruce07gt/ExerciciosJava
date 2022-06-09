package exercJavaCondicao;

import java.util.Scanner;

//Calculadora
public class ExercicioJava19 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n, i = 0;
        int resultado = 0;

        System.out.println("Qual valor numero deseja para tabuada? ");
        n = sc.nextInt();

        for (i = 1; i <= 10; i++) {
            resultado = n * i;
            System.out.printf("%d * %d = %d\n", n, i ,resultado);
            sc.close();
        }

    }

}
