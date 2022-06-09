package exercJavaCondicao;

import java.util.Scanner;

public class ExercicioJava23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num, i;

        System.out.println("Digite um numero");
        num = sc.nextInt();

        int fatorial = 1;
        for (i =num; i > 0; --i){
            fatorial = fatorial * i;
        }
        System.out.println("Fatorial é: "+fatorial);
    }
}
