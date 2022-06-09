package exercJavaCondicao;

import java.util.Locale;
import java.util.Scanner;
// NUMERO IMPAR OU PAR , NEGATIVO OU POSITIVO
public class ExercicioJava22 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int valor, numero ;


        System.out.println("Quantos numeros deseja consultar? ");
        valor = sc.nextInt();

       for (int i =0; i < valor; i++) {
           System.out.println("digite um numero: ");
           numero = sc.nextInt();

           if (numero == 0) {
               System.out.println("NUMERO NULO");
           } else {
               //a cada else inicia um novo if
               if (numero % 2 == 0) {
                   System.out.print("NUMERO PAR ");
               } else {
                   System.out.print("NUMEOR IMPAR ");
                  // a cada else inicia um novo if
               } if (numero > 0) {
                   System.out.println("POSITIVO");
               } else {
                   System.out.println("NEGATIVO");
               }
           }
       }
sc.close();

    }
}
