import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma Frase");
        String frase = sc.nextLine();

        for (int i = 0; i < frase.length(); i++) {
            System.out.print(frase.charAt(i));
            if (  i < frase.length() - 1) { // Condição para não colocar - além
                System.out.print(" - ");
            }
        }
    }
}