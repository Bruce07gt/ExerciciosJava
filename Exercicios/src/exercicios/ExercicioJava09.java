package exercicios;

//Mostrar horario
import java.util.Locale;
import java.util.Scanner;

public class ExercicioJava09 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int segundos;

        System.out.println("Digite quantos segundos: ");
        segundos = sc.nextInt();
        sc.close();

        int horas = segundos / 3600;
        int resto = segundos % 3600;
        int minutos = resto / 60;
        int segundo = resto % 60;

        System.out.println(horas+":"+minutos+":"+segundo);





    }


}
