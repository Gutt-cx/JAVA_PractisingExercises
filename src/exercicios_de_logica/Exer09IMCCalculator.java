package exercicios_de_logica;

import java.util.Scanner;

public class Exer09IMCCalculator {

    //9 - Faça um algoritmo que calcule o IMC (Índice de Massa Corporal) de uma pessoa, leia o seu peso e sua altura e imprima na tela sua condição:

    public static void main(String[] args) {
        dataCollection();
    }

    public static void dataCollection() {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite seu peso em [kg]");
        double weight = input.nextDouble();

        System.out.println("Digite sua altura em [m]");
        double height = input.nextDouble();

        imc(weight, height);
        dataCollection();
    }


    public static void imc(double weight, double height) {
        double imcIndex = weight / (height * height);

        if (imcIndex < 18.5) {
            System.out.printf("IMC: %.2f | Abaixo do peso %n", imcIndex);
        } else if (imcIndex < 24.9) {
            System.out.printf("IMC: %.2f  | Peso ideal (parabéns) %n", imcIndex);
        } else if (imcIndex < 29.9) {
            System.out.printf("IMC: %.2f  | Levemente acima do peso %n", imcIndex);
        } else if (imcIndex < 34.9) {
            System.out.printf("IMC: %.2f  | Obesidade grau I %n", imcIndex);
        } else if (imcIndex < 39.9) {
            System.out.printf("IMC: %.2f  | Obesidade grau II (severa) %n", imcIndex);
        } else if (imcIndex >= 40) {
            System.out.printf("IMC: %.2f  | Obesidade grau II (severa) %n", imcIndex);
        } else {
            System.out.println("Os valores informados estão incorretos, insira os dados novamente e certifique-se de que estejam de acordo.");
        }

    }
}
