// aula 2
import java.util.Scanner;


public class Console {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um texto");


        System.out.println("Digite um número");
        int numero = leitor.nextInt();
        System.out.println("digite outro número");
        int numero2 = leitor.nextInt();
        int soma = numero + numero2;
        System.out.println("A soma dos números é: " + soma);
        // String nome = leitor.nextLine();
        // System.out.println(nome);
        // leitor.close();
    }
}
