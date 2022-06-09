package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioJava05 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double larguraTerreno, comprimentoTerreno, valorMetro;

        larguraTerreno = sc.nextDouble();
        comprimentoTerreno = sc.nextDouble();
        valorMetro = sc.nextDouble();
        sc.close();

        double areaTerreno = comprimentoTerreno * larguraTerreno;
        System.out.printf("O tamanho da área é de %.0f\n", areaTerreno);
        double precoTerreno = areaTerreno * valorMetro;
        System.out.printf("Calculando a área o valor do terreno é de %.2f", precoTerreno);

    }
}
