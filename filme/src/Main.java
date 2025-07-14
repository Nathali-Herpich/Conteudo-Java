public class Main {
    public static void main(String[] args) {
        System.out.println("Filme:Enrolados");

        int anoDeLancamento = 2011;
        System.out.println("Ano de lançamento : " + anoDeLancamento);
        boolean includelan = true;

        // o if e o else permitem executar operações diferentes
        double notaDoFilme = 8.1;

        double media = (9.0 + 6.3 + 2.0) / 3;
        System.out.println(media);

        if (media >= 7) {
            System.out.println("Maior");
        } else {
            System.out.println("Menor ");
        }

        // o if e o else permitem executar operações diferentes
        notaDoFilme = 7.2;
        media = (9.0 + 6.3 + 8.0) / 3;
        System.out.println(media);

        if (media >= 7) {
            System.out.println("Maior");
        } else {
            System.out.println("Menor ");
        }


            int minhaInt = 9;
            double minhaDouble = minhaInt;

            System.out.println(minhaInt);
            System.out.println(minhaDouble);


            double minhaD = 6;
            int minhaI = (int) minhaD;

            System.out.println(minhaD);
            System.out.println(minhaI);


        char meuChar = 'a';


        String minhaString1 = Character.toString(meuChar);

        String minhaString2 = "" + meuChar;

        System.out.println(minhaString1);
        System.out.println(minhaString2);

    }
}