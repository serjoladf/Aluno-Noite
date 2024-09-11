import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String frase;
        System.out.println("Digite uma Frase");
        frase = sc.nextLine();

        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);
            if (String.valueOf(c).equalsIgnoreCase("a")) {
                System.out.print("-");
            }else{
                System.out.print(frase.charAt(i));
            }
        }
    }
}