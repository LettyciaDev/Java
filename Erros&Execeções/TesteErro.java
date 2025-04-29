import java.util.Scanner;

class IdadeInvalidaException extends Exception{
    IdadeInvalidaException(String mensagem){
        super(mensagem);
    }
}


public class TesteErro{
    
    public static void verificarIdade(int idade) throws IdadeInvalidaException{
        if(idade < 0 && idade < 18){
            throw new IdadeInvalidaException("Idade Invalida");
        }

        System.out.println("Idade válida");
    }
    public static void main(String[] args){
        try {
            verificarIdade(15);
        } catch (IdadeInvalidaException e) {
            System.out.println("erro: " + e);
        }

    }
}
    


