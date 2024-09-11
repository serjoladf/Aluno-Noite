import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] vogal = new String[]{"a", "e", "i", "o", "u"};
        String frase;
        System.out.println("Digite uma Frase");
        frase = sc.nextLine();
        int cont = 0;
        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);
            for (String a : vogal) { // for-each de uma lista
                if (String.valueOf(c).equalsIgnoreCase(a)) {
                    cont++;
                }
            }
        }

        System.out.println(cont);
    }
}


//2.- Exercício ContarVogais
//   Desenvolva um programa que leia uma palavra ou frase e exiba a quantidade de vogais presentes na mesma
//    Utilize laço for

//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String frase;
//        System.out.println("Digite uma Frase");
//        frase = sc.nextLine();
//        int cont = 0;
//
//        for (int i = 0; i < frase.length(); i++) {
//            char c = frase.charAt(i);
//
//            if (String.valueOf(c).equalsIgnoreCase("a") || String.valueOf(c).equalsIgnoreCase("e") || String.valueOf(c).equalsIgnoreCase("i") || String.valueOf(c).equalsIgnoreCase("o") || String.valueOf(c).equalsIgnoreCase("u")){
//                cont++;
//            }
//        }
//
//        System.out.println(cont);
//    }
//}
