import java.util.Scanner;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String frase;
        System.out.println("Digite uma Frase");
        frase = sc.nextLine();
        int cont = 0;

        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);

            if (String.valueOf(c).equalsIgnoreCase("a")) {
                cont++;
            }
        }

        System.out.println(cont);
    }
}
//1.- Exercício ContarLetraA
//Escreva um programa que receba uma frase e verifique quantas letras 'A' existem na frase - Utilize laço for
//        => sintaxe for (int i = 0; i < 5; i++){


