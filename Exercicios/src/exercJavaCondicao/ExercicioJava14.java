package exercJavaCondicao;
import java.util.Locale;
import java.util.Scanner;

//Verificando troco, se falta avisa quando
public class ExercicioJava14 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double precoUnitario;
        double troco = 0.0;
        double valorRecebido;
        double quantidadeItem;
        double valorInsuficiente;

        System.out.println("Digite a quantidade de itens: ");
        quantidadeItem = sc.nextDouble();
        System.out.println("Digite o preço do intem  acima: ");
        precoUnitario = sc.nextDouble();
        System.out.println("Valor Recebido: ");
        valorRecebido = sc.nextDouble();
        sc.close();

        double soma = quantidadeItem * precoUnitario;
        System.out.printf("Total a pagar: %.2f\n\n",soma);

        if (valorRecebido < soma ) {
            valorInsuficiente = soma - valorRecebido;
            System.out.printf("Saldo insuficiente! falta %.2f\n",valorInsuficiente);
        } else if (valorRecebido > soma) {
            troco = valorRecebido - soma;
            System.out.printf("Seu troco é :%.2f\n",troco);
        }


    }
}
