package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioJava08 {
    //Troco

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double preco, itens, valoroRecebido;

        System.out.println("Preço do intem: ");
        preco = sc.nextDouble();
        System.out.println("Quantidade de itens: ");
        itens = sc.nextDouble();
        System.out.println("Dinheiro recebido: ");
        valoroRecebido = sc.nextDouble();
        sc.close();


        double troco = valoroRecebido - itens*preco;
        System.out.printf("Seu troco é %.2f", troco);


    }
}
