package exercicios_de_logica;

import java.util.Scanner;

public class Exer04PredecessorAndSuccessor {
    //4 - Faça um algoritmo que receba um número inteiro e imprima na tela o seu antecessor e o seu sucessor.

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        operation(number);
    }


    public static void operation(int number) {

        int predecessor = number - 1;
        int successor = number + 1;
        System.out.println("Seu número é " + number + " Seu antecessor é " + predecessor + " Seu sucessor é " + successor);

    }
}
