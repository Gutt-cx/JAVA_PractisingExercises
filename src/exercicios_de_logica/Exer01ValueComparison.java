package exercicios_de_logica;

import java.util.Scanner;

public class Exer01ValueComparison {
    //1 - Faça um algoritmo que leia os valores de A, B, C e em seguida imprima na tela a soma entre A e B é mostre se a soma é menor que C.
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite o valor A");
        int valueA = input.nextInt();

        System.out.println("Digite o valor B");
        int valueB = input.nextInt();

        System.out.println("Digite o valor C");
        int valueC = input.nextInt();

        addAndCompare(valueA, valueB, valueC);
    }

    public static void addAndCompare(int valueA, int valueB, int valueC) {
        int sumAB = valueA + valueB;

        System.out.println("A soma dos valores A + B é igual a " + sumAB + "C é igual a " + valueC);

        if (sumAB < valueC) {
            System.out.println("A soma dos valores A e B = " + sumAB + " é menor que C = " + valueC);
        }
    };



}
