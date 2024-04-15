//Faça um programa que apresente o menu de opções a seguir:
//Menu de opções:
//1. Média aritmética
//2. Média ponderada
//3. Sair
//Digite a opção desejada.
//Na opção 1: receber duas notas, calcular e mostrar a média aritmética.
//Na opção 2: receber três notas e seus respectivos pesos, calcular e mostrar média ponderada.
//Na opção 3: sair do programa.
//Verifique a possibilidade de opção inválida. Nesse caso, o programa deverá mostrar uma mensagem.


import java.util.Scanner;

public class Atividade03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] notasA = new double[2];
        double[] notasP = new double[3];
        double[] peso = new double[3];
        double somaA, calculoP, mediaA, mediaP;
        int escolha;

        do {
            System.out.println("Menu de opções:");
            System.out.println("1. Média aritmética");
            System.out.println("2. Média ponderada");
            System.out.println("3. Sair");
            System.out.print("Digite a opção desejada: ");
            escolha = input.nextInt();

            switch (escolha) {
                case 1:
                    System.out.println("Digite duas notas para calcular a média aritmética:");
                    somaA = 0;
                    for(int i = 0; i < notasA.length; i++) {
                        System.out.print("Digite a " + (i + 1) + "ª nota: ");
                        notasA[i] = input.nextDouble();
                        somaA += notasA[i];
                    }
                    mediaA = somaA / notasA.length;
                    System.out.println("A média aritmética é: " + mediaA);
                    break;

                case 2:
                    System.out.println("Digite três notas e seus respectivos pesos para calcular a média ponderada:");
                    calculoP = 0;
                    for(int i = 0; i < notasP.length; i++) {
                        System.out.print("Digite a " + (i + 1) + "ª nota: ");
                        notasP[i] = input.nextDouble();
                        System.out.print("Digite o peso da " + (i + 1) + "ª nota: ");
                        peso[i] = input.nextDouble();
                        calculoP += notasP[i] * peso[i];
                    }
                    mediaP = calculoP / notasP.length;
                    System.out.println("A média ponderada é: " + mediaP);
                    break;

                case 3:
                    System.out.println("Você saiu do programa!");
                    break;

                default:
                    System.out.println("Opção inválida! Por favor, digite 1, 2 ou 3.");
                    break;
            }
        } while (escolha != 3);

        input.close();
    }
}