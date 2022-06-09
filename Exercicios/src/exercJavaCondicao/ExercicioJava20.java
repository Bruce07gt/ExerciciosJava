package exercJavaCondicao;

import java.util.Scanner;

public class ExercicioJava20 {
//Somando imopares dentre 2 numeros
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numero1;
        int numero2;
        int troca;



        System.out.println("digite o primeiro numero: ");
        numero1 = sc.nextInt();
        System.out.println("digite o segundo numero: ");
        numero2 = sc.nextInt();

        if (numero1 > numero2) {
            troca = numero1;
            numero1 = numero2;
            numero2 = troca;
        }

        int soma = 0;
        for (int i = numero1+1; i < numero2-1; i++) {
            if (i % 2 != 0) {
                soma = soma + i;
            }
        }System.out.println("Soma dos Impares = "+soma);



    }
}
