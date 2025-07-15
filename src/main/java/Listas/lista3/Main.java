import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("Jose", 1450);
        Freelancer  f2 = new Freelancer("Maria", 4);
        f1.calcularPagamento();
        f2.calcularPagamento();

        // Cria uma lista chamada animais
        List<Animal> animais = new ArrayList<>();

        // adiciona os objetos
        animais.add(new Cachorro());
        animais.add(new Gato());

        // executa o metodo para cada objeto
        for(Animal animal : animais){
            animal.emitirSom();
        }

        Triatleta t1= new Triatleta();
        t1.correr();
        t1.nadar();

        Carro c1 = new Carro();
        c1.acelerar();
        c1.status();
    }
    
    
}
