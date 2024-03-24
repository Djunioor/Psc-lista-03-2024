import java.util.Scanner;

public class ExercicioN2Cadrastro {
    public static void main(String[] args) {
        String nome, senha;
        Scanner input = new Scanner(System.in);

        do { 
            System.out.println("Digite seu nome: ");
            nome = input.nextLine(); 
            System.out.println("Digite sua senha: ");
            senha = input.nextLine();
            if (senha.equals(nome)) { 
            System.out.println("Senha invalida! Digite uma senha diferente do nome do usuario ");
        }
            } while (senha.equals(nome)); 
            System.out.println("Nome de usuario e senha registrados ");
            input.close();
     
    }
}
    

