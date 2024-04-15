//Faça um programa que receba várias idades, calcule e mostre a média das idades digitadas. Finalize digitando idade igual a zero.


import java.util.Scanner;

public class Atividade01{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int idade, nIdade, idadeTotal, media;

        idade = 0;
        nIdade = 0;
        idadeTotal = 0;

        System.out.println("Digite as idades para calcular a média (Digite 0 para sair): ");

        while (true) {

            idade = input.nextInt();

            if (idade == 0) {
                break; 
            } else{
                idadeTotal += idade;
                nIdade++;
            }
        }

        media = idadeTotal / nIdade;

        System.out.println("A média das idade digitadas é: " + media);

        input.close();
    }
}