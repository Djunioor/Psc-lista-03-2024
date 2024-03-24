import java.util.Scanner;

public class ExercicioN4População {
    public static void main(String[] args) {
        int populacaoA = 80000;
        double taxaCrescimentoA = 0.03;
        int populacaoB = 2000000;
        double taxaCrescimentoB = 0.015;
        int anos = 0;
        Scanner input = new Scanner(System.in);

        while (populacaoA < populacaoB) {
            populacaoA += (populacaoA * taxaCrescimentoA);
            populacaoB += (populacaoB * taxaCrescimentoB);
            anos++;
        }
        System.out.println("Sera necessaria " + anos + "para que a população A iguale ou ultrapasse a B");
        input.close();
    }
}
