//Faça um programa que receba dez idades, pesos e alturas, calcule e mostre: 
//a média das idades das dez pessoas;
//a quantidade de pessoas com peso superior a 90 kg e altura inferior a 1,50 metro; e 
//a porcentagem de pessoas com idade entre 10 e 30 anos entre as pessoas que medem mais de 1,90 m. 


import java.util.Scanner;

public class Atividade04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] idade = new int[10];
        double[] peso = new double[10];
        double[] altura = new double[10];
        double somaI = 0; double mediaI = 0;
        int quantidade9015 = 0, pessoas190 = 0, numero1030 = 0;
        double porc1030 = 0;

        for(int i = 0; i < idade.length; i++){
            System.out.print("Digite a idade da " + (i + 1) + " pessoa: ");
            idade[i] = input.nextInt();
            System.out.print("Digite a peso da " + (i + 1) + " pessoa: ");
            peso[i] = input.nextInt();
            System.out.print("Digite a altura da " + (i + 1) + " pessoa: ");
            altura[i] = input.nextInt();
        }
        for(int i = 0; i < idade.length; i++){
            somaI += idade[i]; 
        }

        mediaI = somaI / idade.length;

        for(int i = 0; i < peso.length; i++){
            if (peso[i] > 90 && altura[i] < 1.50) {
                quantidade9015++;
            }
        }

        for(int i = 0; i < idade.length; i++){
            if (idade[i] >= 10 && idade[i] <= 30 && altura[i] >= 1.90) {
                numero1030++;
            }
        }

        for(int i = 0; i < idade.length; i++){
            if (altura[i] > 1.90) {
                pessoas190++;
            }
        }

        if (pessoas190 != 0) {
            porc1030 = ((double) numero1030 / pessoas190) * 100;
        }

        System.out.println("A média das idades é: " + mediaI);
        System.out.println("A quantidade de pessoas com peso superior a 90 kg e altura inferior a 1,50 metro é: " + quantidade9015);
        System.out.println("A porcentagem de pessoas com idade entre 10 e 30 anos entre as pessoas que medem mais de 1,90 m:" + porc1030 + "%");

        input.close();
    }
}