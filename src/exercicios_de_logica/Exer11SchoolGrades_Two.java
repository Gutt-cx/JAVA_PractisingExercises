package exercicios_de_logica;

import java.util.Scanner;

public class Exer11SchoolGrades_Two {

    // 11 - Faça um algoritmo que leia quatro notas obtidas por um aluno, calcule a média das nota obtidas, imprima na tela o nome do aluno e
    // se o aluno foi aprovado ou reprovado. Para o aluno ser considerado aprovado sua média final deve ser maior ou igual a 7.

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] notes = new double[4];
        System.out.println("Digite as quatro notas do aluno");
        notes[0] = input.nextDouble();
        notes[1] = input.nextDouble();
        notes[2] = input.nextDouble();
        notes[3] = input.nextDouble();

        finalNote(notes);
    }

    public static void finalNote(double[] notes) {
        double media = (notes[0] + notes[1] + notes[2] + notes[3]) / 4;

        if (media >= 7) {
            System.out.printf("Nota: %.1f | aluno aprovado[!]", media);
            return;
        } else {
            System.out.printf("Nota: %.1f | Insuficiente, aluno reprovado", media);
            return;
        }

    }

}
