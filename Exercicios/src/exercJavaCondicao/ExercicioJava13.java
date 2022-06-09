package exercJavaCondicao;

import java.util.Locale;
import java.util.Scanner;

//Franquia de Serviço
public class ExercicioJava13 {


    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc =new Scanner(System.in);

        double franquiaMinutos = 100;
        double valorPlano = 62.90;
        double minutosConsumidos;
        //taxa de preço por minuto excedido, pode mudar para qalquer valor.
        double minutoExcedido = 3.56;
        double planoMaisExcedente;
        System.out.println("Digite quantos minutos consumidos do plano:");
        minutosConsumidos = sc.nextInt();
        sc.close();

        if (minutosConsumidos <= franquiaMinutos) {
            System.out.printf("Valor a pagar: %.2f", valorPlano);
        } else if (minutosConsumidos > franquiaMinutos) {
            planoMaisExcedente = (minutosConsumidos - franquiaMinutos) * minutoExcedido + valorPlano;
            System.out.printf("Valor a pagar com excedente de franquia é: %.2f", planoMaisExcedente);
        }

    }
}
