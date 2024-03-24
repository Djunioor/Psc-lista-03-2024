import java.util.Scanner;

public class ExercicioN8SomaMedia {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int tNumeros = 5;
        int soma = 0;

        for (int i = 0; i < tNumeros; i++) {
            System.out.println("Digite o " + (i + 1) + "º número:");
            int numero = input.nextInt();
            soma += numero;
        }
           double media = (double) soma / tNumeros;

            System.out.println("A soma dos números é: " + soma);
        System.out.println("A média dos números é: " + media);

        input.close();
    
    }
}
