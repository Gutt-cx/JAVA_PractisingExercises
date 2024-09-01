package exercicios_de_logica;

import java.util.Scanner;

public class Exer12PaymentMethod {
    //12 - Faça um algoritmo que leia o valor de um produto e determine o valor que deve ser pago, conforme a escolha da forma de pagamento
    // pelo comprador e imprima na tela o valor final do produto a ser pago. Utilize os códigos da tabela de condições de pagamento para efetuar o cálculo adequado.

    public static void main(String[] args) {
        display();
    }

    public static void paymentMethod(double product, int paymentOptions) {
        double price;

        switch (paymentOptions) {
            case 1:
                price = product - (product * 0.15);
                System.out.printf("seu produto custara R$ %.2f, com o método de pagamento escolhido. %n", price);
                break;

            case 2:
                price = product - (product * 0.10);
                System.out.printf("seu produto custara R$ %.2f, com o método de pagamento escolhido. %n", price);
                break;

            case 3:
                price = product;
                System.out.printf("seu produto custara R$ %.2f dividido em 2x, com o método de pagamento escolhido. %n", price);
                break;

            case 4:
                price = product + (product * 0.10);
                System.out.printf("seu produto custara R$ %.2f dividido em 3x ou mais, com o método de pagamento escolhido. %n", price);
                break;
        }
    }



    public static void paymentMessage() {
        System.out.println("Escolha seu método de pagamento: \n");
        System.out.println("1 | À Vista em Dinheiro ou Pix, recebe 15% de desconto");
        System.out.println("2 | À Vista no cartão de crédito, recebe 10% de desconto");
        System.out.println("3 | Parcelado no cartão em duas vezes, preço normal do produto sem juros");
        System.out.println("4 | Parcelado no cartão em três vezes ou mais, preço normal do produto mais juros de 10%");
    }


    public static void display() {
        Scanner input = new Scanner(System.in);

        System.out.println("Valor do produto: ");
        double product = input.nextDouble();

        paymentMessage();
        int paymentOptions = input.nextInt();


        paymentMethod(product, paymentOptions);

        display();
    }
}
