package exercicios_de_logica;

public class Exer07TrueOrFalse {
    //7 - Faça um algoritmo que leia dois valores booleanos (lógicos) e determine se ambos são VERDADEIRO ou FALSO.

    public static void main(String[] args) {
        boolean booAux1 =  false;
        boolean booAux2 = false;

        checkTheBooleans(booAux1, booAux2);
    }
    public static void checkTheBooleans(boolean booAux1, boolean booAux2) {
        if(booAux1  && booAux2 ) {
            System.out.println("Ambos são verdadeiros");
            return;
        } else if (!booAux1 && !booAux2) {
            System.out.println("Ambos são falsos");
            return;
        } else {
            System.out.println("São diferentes um do outro");
            return;
        }
    }




}
