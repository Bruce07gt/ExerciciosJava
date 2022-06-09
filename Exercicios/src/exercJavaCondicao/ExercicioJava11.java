package exercJavaCondicao;

import java.util.Locale;
import java.util.Scanner;

//Menor de três
public class ExercicioJava11 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int valorA, valorB, valorC, menor;

        System.out.println("Digite um valor: ");
        valorA = sc.nextInt();
        System.out.println("Digite outo valor: ");
        valorB = sc.nextInt();
        System.out.println("Digite mais um valor: ");
        valorC = sc.nextInt();

        if (valorA < valorB && valorA < valorC) {
            menor = valorA;
        } else if (valorB < valorC) {
            menor = valorB;
            } else {
            menor = valorC;
        }
        System.out.println("O menor valor é: "+menor);
    }
}
