package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioJava06 {
// Resolvendo problema com medidas do RETANGULO


    public static void main(String[] args) {
        //locale e para a IDE aceitar o ponto no lugar da virgula
        Locale.setDefault(Locale.US);

        //Scanner para fazer o terminal ou interface ler as variaveis
        Scanner sc = new Scanner(System.in);

        //Duas variaveis onde recebera a leiura do Scann
        double baseRetangulo, alturaRetangulo;

        alturaRetangulo = sc.nextDouble();
        baseRetangulo = sc.nextDouble();
        sc.close();

        //inicia os calculos
         double areaRetangulo = alturaRetangulo * baseRetangulo;
         //%.3f é para definir a quantidade de zeros depois da virgula
        System.out.printf("%.3f\n",areaRetangulo);
        double perimetro = (2 * baseRetangulo) + (2 * alturaRetangulo);
        System.out.printf("%.3f\n",perimetro);
        double diagonal = Math.sqrt(Math.pow(baseRetangulo,2) + Math.pow(alturaRetangulo,2));
        System.out.printf("%.4f\n",diagonal);


    }

}
