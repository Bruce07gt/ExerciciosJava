package exercJavaCondicao;

import java.util.Scanner;

public class ExercicioJava17 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int initialHour, playDuration, finalHour;


        initialHour = sc.nextInt();
        finalHour = sc.nextInt();

        if (finalHour < initialHour) {
            playDuration = finalHour - initialHour;
            System.out.println("O jogo durou "+playDuration+" horas");
            System.out.println("O jogo inicou e terminou no mesmo dia.");
        } else {
            playDuration = 24 - initialHour + finalHour;
            System.out.println("O jogo durou "+playDuration+" horas");
            System.out.println("O jogo durou de um dia para o outro");
        }

    }
}
