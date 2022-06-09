package exercJavaCondicao;


import java.util.Locale;
import java.util.Scanner;
//maior entre três
public class ExercicioJava15 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double alcance1, alcance2, alcance3, maiorDistancia;

        System.out.println("Digite a distacia do primeiro lançamento: ");
        alcance1 = sc.nextDouble();
        System.out.println("Digite a distacia do segundo lançamento: ");
        alcance2 = sc.nextDouble();
        System.out.println("Digite a distacia do terceiro lançamento: ");
        alcance3 = sc.nextDouble();
        sc.close();

        if (alcance1 > alcance2 && alcance1 > alcance3) {
            maiorDistancia = alcance1;
        } else if (alcance2 > alcance3 ) {
            maiorDistancia = alcance2;
        } else {
            maiorDistancia = alcance3;
        }
        System.out.println("A maior distancia foi "+maiorDistancia);
    }
}
