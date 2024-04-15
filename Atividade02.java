//Foi feita uma pesquisa sobre a audiência de canal de TV em várias casas de uma cidade, em determinado dia. 
//Para cada casa consultada foi fornecido o número do canal (4, 5, 7, 12) e o número de pessoas que estavam assistindo aquele canal. 
//Se a televisão estivesse desligada, nada era anotado, ou seja, essa casa não entrava na pesquisa. Faça um programa que:
//leia um número indeterminado de dados (número do canal e número de pessoas que estavam assistindo); e
//calcule e mostre a porcentagem de audiência de cada canal.
//Para encerrar a entrada de dados, digite o número do canal ZERO.


import java.util.Scanner;

public class Atividade02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int canal, pessoasTotal = 0, pessoas4 = 0, pessoas5 = 0, pessoas7 = 0, pessoas12 = 0, assistindo;
        double porc4, porc5, porc7, porc12;
        
        while (true) {
            System.out.println("Digite o número do canal e o número de pessoas assistindo (ou 0 para encerrar):");
            canal = input.nextInt();
            if (canal == 0) {
                break;
            }

            System.out.print("Digite o número de pessoas assistindo: ");
            assistindo = input.nextInt();
            
            switch (canal) {
                case 4:
                    pessoas4 += assistindo;
                    break;
                case 5:
                    pessoas5 += assistindo;
                    break;
                case 7:
                    pessoas7 += assistindo;
                    break;
                case 12:
                    pessoas12 += assistindo;
                    break;
                default:
                    System.out.println("Digite um canal válido!");
                    continue;
            }
            
            pessoasTotal += assistindo;
        }

        if (canal == 0 && pessoasTotal == 0) {
            System.out.println("Você encerrou o programa!");
        } else if(pessoasTotal == 0) {
            System.out.println("Nenhum dado foi fornecido.");
        } else if (canal == 0){

            porc4 = (pessoas4 * 100.0) / pessoasTotal;
            porc5 = (pessoas5 * 100.0) / pessoasTotal;
            porc7 = (pessoas7 * 100.0) / pessoasTotal;
            porc12 = (pessoas12 * 100.0) / pessoasTotal;

            System.out.printf("A porcentagem de pessoas assistindo o canal 4 é: %.2f%%\n", porc4);
            System.out.printf("A porcentagem de pessoas assistindo o canal 5 é: %.2f%%\n", porc5);
            System.out.printf("A porcentagem de pessoas assistindo o canal 7 é: %.2f%%\n", porc7);
            System.out.printf("A porcentagem de pessoas assistindo o canal 12 é: %.2f%%\n", porc12);

        
        }
        input.close();
    }
}