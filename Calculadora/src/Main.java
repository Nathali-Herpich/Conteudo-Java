import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Digite o primeiro número:");
        Scanner scanner = new Scanner(System.in);

        double num1 = scanner.nextDouble();

        double dobro = num1 * 2;


    System.out.println("O dobro do número é\n" + dobro );
    }
}