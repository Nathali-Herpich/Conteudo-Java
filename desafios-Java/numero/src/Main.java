import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();
        int numero1 = 0;
        int numero2 = -1;

       if (numero2 >= numero1) {
           System.out.println("Seu número é negativo");
       }
       else {
           System.out.println("Seu múmero é positivo");
       }
    }
}