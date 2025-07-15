import java.util.Scanner;

import static java.text.ChoiceFormat.nextDouble;

public class Main {


    public static void main(String[] args) {
        System.out.println("Filme:Enrolados");

        int anoDeLancamento = 2011;

        boolean includelan = true;
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite seu filme favorito");
        String filme = leitura.nextLine();
        System.out.println(filme);
        System.out.println("Qual o ano de lançamento?");
        anoDeLancamento = leitura.nextInt();

        String avaliado = leitura.nextLine();
        System.out.println("Avaliação");
        double notaDoFilme = 8;
        leitura.nextDouble();
        System.out.println("Então o seu filme favorito é !!" + filme + "e foi lancado em " + anoDeLancamento + " e possui a avaliação de" + notaDoFilme);



    }
}