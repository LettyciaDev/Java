import java.util.List;
import java.util.ArrayList;

public class App{
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Artur", "12345");
        Aluno a2 = new Aluno("Ana", "25643");

        List<Aluno> turma = new ArrayList<Aluno>();

        turma.add(a1);
        turma.add(a2);
    }
}