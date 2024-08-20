package exercicios_de_logica;

import java.util.Scanner;

public class Exer03AdditionAndMultiplicationTests {
    /*3 - Faça um algoritmo que leia dois valores inteiros A e B, se os valores de A e B forem iguais, deverá somar os dois valores,
    caso contrário devera multiplicar A por B. Ao final de qualquer um dos cálculos deve-se atribuir o resultado a uma variável C e
    imprimir seu valor na tela.*/

    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Digite o valor A:");
        int valueA = input.nextInt();

        System.out.println("Digite o valor B:");
        int valueB = input.nextInt();

        operation(valueA, valueB);

    }

    public static void operation(int valueA, int valueB) {
        int valueC;

        if (valueA == valueB) {
            valueC = valueA + valueB;
            System.out.println("O valor de A + B = C é " + valueC);
            return;
        }
            valueC = valueA * valueB;
        System.out.println("O valor de A * B = C é " + valueC);


    }
}
