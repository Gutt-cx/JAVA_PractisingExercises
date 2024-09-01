package exercicios_de_logica;

import javax.print.DocFlavor;

public class Exer08ThreeValues {
    //8 - Faça um algoritmo que leia três valores inteiros diferentes e imprima na tela os valores em ordem decrescente.
    public static void main(String[] args) {



        int valueA = 3;
        int valueB = 1;
        int valueC = 2;
        if (valueA == valueB || valueB == valueC || valueC == valueA) {
            System.out.println(" Valores semelhantes não são permitidos");
        }

        threeValueSortingProcess(valueA, valueB, valueC);
    }





    public static void threeValueSortingProcess(int valueA, int valueB, int valueC) {
        String textAux = " ";
        if ((valueA > valueB) && (valueA > valueC)) {
            textAux = textAux + valueA + ", ";
            if (valueB > valueC) {
                textAux = textAux + valueB + ", " + valueC;
            } else {
                textAux = textAux + valueC + ", " + valueB;
            }
            System.out.println(textAux);
            return;
        }

        System.out.println("Deu errado");
    }

}
