import java.util.Scanner;

public class ExercicioN10 {

    public static void main(String[] args) {
        int numInicial, numFinal;
        Scanner input = new Scanner(System.in);
    System.out.println("Digite o numero inicial:");
    numInicial = input.nextInt();
    System.out.println("Digite o numero final:");
    numFinal = input.nextInt();

    if (numFinal < numInicial) { 
        System.out.println("O numero final deve ser maior que o inicial ");
        return; 
    }
    for (int i = numInicial; i <= numFinal; i++) {
        System.out.println(i);
    }
    System.out.println("Os numeros no intervalo de " + numInicial + " é "+ numFinal);
    
    input.close();
}
}
   
