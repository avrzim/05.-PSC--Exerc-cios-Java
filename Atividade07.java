//Foi feita uma estatística em n cidades brasileiras para coletar dados sobre acidentes de trânsito. Foram obtidos os seguintes dados:
//nome da cidade;
//número de veículos de passeio;
//número de acidentes de trânsito com vítimas.
//Deseja-se saber:
//qual é o maior e qual é o menor índice de acidentes de trânsito e a que cidades pertencem;
//qual é a média de veículos nas cinco cidades juntas


import java.util.Scanner;

public class Atividade07 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double maiorIndiceAcidentes = 0, menorIndiceAcidentes = 1, mediaVeiculos = 0;
        int n, somaVeiculos = 0;
        String cidadeMaior = "", cidadeMenor = "";

        System.out.println("Informe o número de cidades:");
        n = input.nextInt();

        String[] cidades = new String[n];
        int[] numVeiculos = new int[n];
        int[] numAcidentes = new int[n];

        for (int i = 0; i < n; i++) {
            input.nextLine();
            System.out.println("Informe o nome da cidade:");
            cidades[i] = input.nextLine();
            System.out.println("Informe o número de veículos de passeio:");
            numVeiculos[i] = input.nextInt();
            System.out.println("Informe o número de acidentes de trânsito com vítimas:");
            numAcidentes[i] = input.nextInt();
        }

        for (int i = 0; i < n; i++) {
            double indiceAcidentes = (double) numAcidentes[i] / numVeiculos[i];
            if (indiceAcidentes > maiorIndiceAcidentes) {
                maiorIndiceAcidentes = indiceAcidentes;
                cidadeMaior = cidades[i];
            }
            if (indiceAcidentes < menorIndiceAcidentes) {
                menorIndiceAcidentes = indiceAcidentes;
                cidadeMenor = cidades[i];
            }
        }

        for (int i = 0; i < n; i++) {
            somaVeiculos += numVeiculos[i];
        }
        mediaVeiculos = somaVeiculos / n;

        System.out.println("Cidade com maior índice de acidentes de trânsito:");
        System.out.println("Nome da cidade: " + cidadeMaior);
        System.out.println("Índice de acidentes: " + maiorIndiceAcidentes);
        System.out.println("Cidade com menor índice de acidentes de trânsito:");
        System.out.println("Nome da cidade: " + cidadeMenor);
        System.out.println("Índice de acidentes: " + menorIndiceAcidentes);
        System.out.println("Média de veículos nas cinco cidades juntas: " + mediaVeiculos);

        input.close();
    }
}