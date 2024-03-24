import java.util.Scanner;

public class ExercicioN5Imp {
    public static void main(String[] args) {
        int populacaoA;
        double taxaCrescimentoA = 0.03;
        int populacaoB;
        double taxaCrescimentoB = 0.015;
        int anos = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Informne o numero de habitantes da população A:" );
        populacaoA = input.nextInt();
        System.out.println("Informe o numero de habitantes da população B:");
        populacaoB = input.nextInt();

        while (populacaoA < populacaoB) {
            populacaoA += (populacaoA * taxaCrescimentoA);
            populacaoB += (populacaoB * taxaCrescimentoB);
            anos++;
        }
        System.out.println("Sera necessaria " + anos + " para que a população A iguale ou ultrapasse a B");
        input.close();
    }
}

