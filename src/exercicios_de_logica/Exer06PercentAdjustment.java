package exercicios_de_logica;

import java.util.Scanner;

public class Exer06PercentAdjustment {
    //6 - Faça um algoritmo que leia um valor qualquer e imprima na tela com um reajuste de 5%.

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o valor que deseja reajustar:");
        double value = input.nextDouble();
        adjustment(value);
    }

    public static void adjustment(double value) {
        value = value + value * 0.05;
        System.out.println("Seu valor com a aplicação do reajuste de 5% foi de " + value);
    }




}
