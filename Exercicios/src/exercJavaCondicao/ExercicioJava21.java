package exercJavaCondicao;

import java.util.Scanner;
//Senha fixa
public class ExercicioJava21 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int senha = 2002;

        System.out.println("Digite a senha para o acesso: ");
        senha = sc.nextInt();

        while (senha != 2002) {
            System.out.println("Senha incorreta! Tente novamente: ");
            senha = sc.nextInt();
        }
        System.out.println("Acesso Permitido.");
    }
}
