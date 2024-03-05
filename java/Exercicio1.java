// Escrever um algoritmo que receba a altura e a largura de um retângulo e calcule a sua área.
import java.util.Scanner;
public class Exercicio1 {

    public static void main(String[]args){
        Scanner leitor = new Scanner(System.in);
        System.out.printf("Digite a altura retangulo %n");
        int altura = leitor.nextInt();
        System.out.printf("Digite a largura do retangulo %n");
        int largura = leitor.nextInt();
        System.out.println(altura * largura);

        leitor.close();
    }

}
