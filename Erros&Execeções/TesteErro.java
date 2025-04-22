import java.util.InputMismatchException;
import java.util.Scanner;

public class TesteErro{
    public static void main(String[] args){
        try {
            Scanner input = new Scanner(System.in);
            System.out.println("Digite seu cpf: ");
            int cpf = input.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Erro ao inserir cpf");
            System.out.println(e);
        }
        
        public static int divisao(int num, int deno){
            return num / deno;
        }
    }

    
}

