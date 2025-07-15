package br.com.biblioteca;

import java.util.Scanner;

public class OutLoop {
    public static void main (String [] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Coloque o número:");

        double mediaAvaliacao = 0;
        double nota = 0;
        int totalDeNotas = 0;

        while (nota != -1){
            System.out.println("Diga sua avaliação para o filme :");
            nota = leitura.nextDouble();
            mediaAvaliacao += nota;


        }
        System.out.println("Média de avaliação" + mediaAvaliacao /3);
    }
}
