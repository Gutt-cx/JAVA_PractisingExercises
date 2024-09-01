package exercicios_de_logica;

import java.util.Scanner;

public class Exer13Majority {
    // 13 - Faça algoritmo que leia o nome e a idade de uma pessoa e imprima na tela o nome da pessoa e se ela é maior ou menor de idade.

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe seu nome: ");
        String name = input.nextLine();
        System.out.println("Informe sua idade: ");
        int age = input.nextInt();

        majorityApresentation(name, age);
    }

    public static void majorityApresentation( String name,int age) {

        if (age >= 18) {
            System.out.println(name + " é maior de idade.");
            return;
        } else {
            System.out.println(name + " é menor de idade." );
            return;
        }

    }

}
