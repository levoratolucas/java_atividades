// Crie um algoritmo que permita fazer três conversões monetárias. O algoritmo deve receber o valor em real
// (R$) e apresentar os valores convertidos em:
// 1. Dólar (1 dólar = 5,17 reais)
// 2. Euro (1 euro = 6,14 reais)
// 3. Peso argentino (1 peso argentino = 0,05 reais)
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args){
        Scanner leitor = new Scanner (System.in);
        System.out.printf("Quantos reais quer cambiar%n");
        float reais = leitor.nextFloat();
        leitor.close();
        System.out.printf("%.2f",(reais / 5.17f) + " DOLARES DISPONIVEIS PRA VOCÊ");
        // System.out.printf("%,.2f",(reais / 6.14f) + "EUROS DISPONIVEIS PRA VOCÊ");
        // System.out.printf("%,.2f",(reais / 0.05f) + "MISEROS PESOS DISPONIVEIS PRA VOCÊ");

    }
}
