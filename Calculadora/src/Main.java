import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        double numero = scanner.nextDouble();

        double dobro = numero * 2;
        double raiz = Math.sqrt(numero);

        System.out.println("\nResultados:");
        System.out.println("Dobro de " + numero + ": " + dobro);
        System.out.println("Raiz quadrada de " + numero + ": " + raiz);

        // Potenciação
        System.out.print("\nDigite a base para potenciação: ");
        double base = scanner.nextDouble();

        System.out.print("Digite o expoente: ");
        double expoente = scanner.nextDouble();

        double resultadoPotencia = Math.pow(base, expoente);
        System.out.println("Resultado de " + base + "^" + expoente + ": " + resultadoPotencia);

        scanner.close();
    }
}
