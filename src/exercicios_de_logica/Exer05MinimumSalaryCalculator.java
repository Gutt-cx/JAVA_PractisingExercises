package exercicios_de_logica;

import java.util.Scanner;

public class Exer05MinimumSalaryCalculator {
    //5 - Faça um algoritmo que leia o valor do salário mínimo e o valor do salário de um usuário, calcule quantos salários mínimos esse
    //usuário ganha e imprima na tela o resultado. (Base para o Salário mínimo R$ 1.293,20).

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double salary = input.nextDouble();
        salaryCalculator(salary);
    }


    public static void salaryCalculator(double salary) {
        final double MINIMUM_SALARY = 1293.20;

        double employeeSalary = salary/MINIMUM_SALARY;
        System.out.printf("O usuário ganha %.1f salários mínimos", employeeSalary);
    }



}
