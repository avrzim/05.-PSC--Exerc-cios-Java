//Faça um programa que apresente o menu de opções a seguir, permita ao usuário escolher a opção desejada, receba os dados necessários para executar a operação e mostre o resultado. Verifique a possibilidade de opção inválida e não se preocupe com restrições do tipo salário inválido.
//Menu de opções:
//1. Imposto
//2. Novo salário
//3. Classificação
//4. Finalizar o programa
//Digite a opção desejada.
//Na opção 1: receber o salário de um funcionário, calcular e mostrar o valor do imposto usando as regras a seguir.
//SALÁRIO
//% DO IMPOSTO
//Menor que R$ 1400,00
//5
//De R$ 1400,00 a R$ 2500,00
//10
//Acima de R$ 2500,00
//15
//Na opção 2: receber o salário de um funcionário, calcular e mostrar o valor do novo salário usando as regras a seguir.
//Salário
//Aumento
//Maiores que R$ 5000,00
//R$ 25,00
//De R$ 2500,00 (inclusive) a R$ 5.000,00 (inclusive) 
//R$ 50,00
//De R$ 1400,00 (inclusive) a R$ 2500,00
//R$ 75,00
//Menores que R$ 1400,00 
//R$ 100,00
//Na opção 3: receber o salário de um funcionário e mostrar sua classificação usando esta tabela:
//Salário
//Classificação
//Até 1400,00
//Mal remunerado
//Maiores que R$ 1400,00
//Bem remunerado

import java.util.Scanner;

public class Atividade06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int escolha;
        double salario = 0, imposto = 0, salarioNovo = 0;

        do {
            System.out.println("Menu de opções:");
            System.out.println("1. imposto");
            System.out.println("2. Novo salário");
            System.out.println("3. classificação");
            System.out.println("4. finalizar o programa");
            System.out.print("Digite a opção desejada: ");
            escolha = input.nextInt();

            switch (escolha) {
                case 1:
                    System.out.print("Digite seu salário: ");
                    salario = input.nextDouble();
                    if (salario < 1400) {
                        imposto = (salario / 100) * 5;
                    } else if (salario >= 1400 && salario < 2500){
                        imposto = (salario / 100) * 10;
                    } else{
                        imposto = (salario / 100) * 15;
                    }
                    System.out.println("O imposto à ser pago é: " + imposto);
                    break;

                case 2:
                    System.out.print("Digite seu salário: ");
                    salario = input.nextDouble();
                    if (salario > 5000) {
                        salarioNovo = salario + 25;
                    } else if(salario >= 2500 && salario <= 5000){
                        salarioNovo = salario + 50;
                    } else if(salario >= 1400 && salario < 2500){
                        salarioNovo = salario + 75;
                    } else{
                        salarioNovo = salario + 100;
                    }
                    System.out.println("Seu novo salário é: " + salarioNovo);
                    break;

                case 3:
                    System.out.print("Digite seu salário: ");
                    salario = input.nextDouble();
                    if (salario <= 1400) {
                        System.out.println("Mal-remunerado");
                    } else{
                        System.out.println("Bem-remunerado");
                    }
                    break;
                
                case 4: 
                    System.out.println("Você saiu do programa!");
                    break;
                default:
                    System.out.println("Opção inválida! Por favor, digite 1, 2, 3 ou 4.");
                    break;
            }
        } while (escolha != 4);

        input.close();
    }
}