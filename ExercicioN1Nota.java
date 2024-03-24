import java.util.Scanner;

public class ExercicioN1Nota {
    public static void main(String[] args) throws Exception {
        double nota;
        Scanner input = new Scanner(System.in);
        
        do { 
        System.out.println("Digite uma nota de 0 a 10: ");
        nota = input.nextDouble();
        if (nota < 0 || nota > 10) { 
            System.out.println("Nota invalida! digite outra nota. ");
        }
        } while (nota < 0 || nota > 10);

        System.out.println("A nota digitada é: " + nota);

        input.close();
    }
}
