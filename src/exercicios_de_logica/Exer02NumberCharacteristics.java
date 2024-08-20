package exercicios_de_logica;

import java.util.Scanner;

public class Exer02NumberCharacteristics {
    //2 - Faça um algoritmo para receber um número qualquer e imprimir na tela se o número é par ou ímpar, positivo ou negativo.

    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        numberCharacteristicChecker();
    }

    public static void numberCharacteristicChecker() {

        System.out.println("Digite um número qualquer:");
        int number = input.nextInt();

        String typeAux = checkForAnOddOrEvenNumber(number);
        String positiveAndNegativeAux = checkPositiveOrNegativeNumber(number);

        System.out.println("O número " + number + " é " + typeAux +" e " + positiveAndNegativeAux);
        numberCharacteristicChecker();
    }


    public static String checkForAnOddOrEvenNumber(int number) {
        if (number % 2 == 0) {
            return "par";
        } else{
            return "impar";
        }
    }

    public static String  checkPositiveOrNegativeNumber(int number) {
        if (number == 0 ) {
            return "pode ser tanto positivo como negativo, ou mesmo nenhum deles.";
        }

        if (number > 0) {
            return "positivo.";
        } else {
            return "Negativo.";
        }
    }


}
