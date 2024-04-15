//Uma empresa fez uma pesquisa de mercado para saber se as pessoas gostaram ou não de um novo produto lançado. Para isso, 
//forneceu o sexo do entrevistado e sua resposta (S — sim; ou N — não). Sabe-se que foram entrevistadas dez pessoas. 
//Faça um programa que calcule e mostre:
//o número de pessoas que responderam sim;
//o número de pessoas que responderam não;
//o número de mulheres que responderam sim; e
//a percentagem de homens que responderam não, entre todos os homens analisados
import java.util.Scanner;

public class Atividade05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double mulherS = 0, mulherN = 0, homemS = 0, homemN = 0, totalS = 0, totalN = 0, totalH =0, porcH = 0;
        char escolhaSexo, escolhaGosto;

        for(int i = 0; i < 10; i++){
            System.out.print("Digite o seu sexo(m ou h): ");
            escolhaSexo = input.next().charAt(0);
            if (escolhaSexo == 'm') {
                System.out.print("Digite se você gostou do seu produto(s ou n): ");
                escolhaGosto = input.next().charAt(0);
                if (escolhaGosto == 's') {
                    mulherS++;
                } else if ( escolhaGosto == 'n'){
                    mulherN++;
                } else{
                    System.out.println("Escolha uma opção válida!");
                    i--;
                }
            } else if (escolhaSexo == 'h'){
                System.out.print("Digite se você gostou do seu produto(s ou n): ");
                escolhaGosto = input.next().charAt(0);
                if (escolhaGosto == 's') {
                    homemS++;
                } else if ( escolhaGosto == 'n'){
                    homemN++;
                } else{
                    System.out.println("Escolha uma opção válida!");
                    i--;
                }
            }else{
                System.out.println("Digite uma opção válida!");
                i--;
            }
        }

        totalS = mulherS + homemS;
        totalN = mulherN + homemN;
        totalH = homemN + homemS;
        porcH = (homemN / totalH) * 100;

        System.out.println("O número de pessoas que responderam sim foi: " + totalS);
        System.out.println("O número de pessoas que responderam não foi: " + totalN);
        System.out.println("O número de mulheres que responderam sim foi: " + mulherS);
        System.out.println("A percentagem de homens que responderam não, entre todos os homens analisados foi: " + porcH + "%");

        input.close();
    }
}