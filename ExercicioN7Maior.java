import java.util.Scanner;

public class ExercicioN7Maior {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numeros = new int[5];

        System.out.println("Digite 5 numeros: ");
        for (int i = 0; i < 5; i++) {
            numeros[i] = input.nextInt();
        }
        int maior = numeros[0];
        for (int i = 1; i < 5; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
        }

        System.out.println("O maior número é: " + maior);

        input.close();
    }
}
    
