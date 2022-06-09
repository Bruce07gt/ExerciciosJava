package exercJavaCondicao;

import java.util.Scanner;

//Testes de dias.
public class ExercicioJava12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int diaSemana;
        String dia;

        System.out.println("Escolha um dia da semana: ");
        diaSemana = sc.nextInt();
        sc.close();

        switch (diaSemana) {
            case 1:
                dia = "Domingo";
                break;
            case 2:
                dia = "Segunda-Feira";
                break;
            case 3:
                dia = "Terça-Feira";
                break;
            case 4:
                dia = "Quarta-Feira";
                break;
            case 5:
                dia = "Quinta-Feira";
                break;
            case 6:
                dia = "Sexta-Feira";
                break;
            case 7:
                dia = "Sabado";
                break;
            default:
                dia = "Inválido";

        }
        System.out.println("Dia da Semana é "+dia);

    }
}
