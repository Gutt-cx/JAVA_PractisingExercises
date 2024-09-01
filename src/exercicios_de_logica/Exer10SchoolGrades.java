package exercicios_de_logica;

import java.util.Scanner;

public class Exer10SchoolGrades {
    // 10 - Faça um algoritmo que leia três notas obtidas por um aluno, e imprima na tela a média das notas.

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite as três notas do aluno:");
        double noteOne = input.nextDouble();
        double noteTwo = input.nextDouble();
        double noteThree = input.nextDouble();

        quarterlyAverageCalculation(noteOne, noteTwo, noteThree);
    }


    public static void quarterlyAverageCalculation(double noteOne, double noteTwo, double noteThree) {
         double media = (noteOne + noteTwo + noteThree) / 3;
        System.out.printf("A media do aluno é: %.1f", media);
    }
}
