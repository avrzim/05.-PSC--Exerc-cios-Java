//Sendo H = 1 + 1/2 + 1/3 + 1/4 + ... + 1/N, fazer um algoritmo, utilizando o comando para ... faça, para gerar o número H. 
//O número N é lido através de uma unidade de entrada qualquer uma única vez. 

import java.util.Scanner;

public class Atividade08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double soma = 0, n;

        System.out.print("Digite o número de vezes que a sequência irá rodar: ");
        n = input.nextInt();

        for(double i = 1; i <= n; i++){
            soma += 1/i;
        }
        System.out.print("A soma da sequência é: " + soma);

        input.close();
    }
}