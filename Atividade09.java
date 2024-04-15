//Fazer um algoritmo, utilizando o comando for, que calcule e escreva a soma dos 50 primeiros termos da seguinte série: 
//S = 1000 / 1 - 997 / 2 + 994 / 3 - 991 / 4 + ... 

public class Atividade09 {
    public static void main(String[] args) {

        double soma = 1000, somaMais = 0, somaMenos = 0;

        for(int i = 1; i <= 50; i++){
            double cima = 1000, baixo = i;
            if (i % 2 == 0) {
                somaMenos += (cima - 3) / (baixo + 1);
            } else{
                somaMais -= (cima - 3) / (baixo + 1);
            }
            soma = somaMais + somaMenos;
        }
        System.out.printf("A soma é: %.2f", soma);
    }
}