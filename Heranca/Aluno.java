public class Aluno extends Pessoa{

    public Aluno(String no, int idd, double alt){
        super(no,idd,alt);
    }

    @Override 
    public String toString(){
        return super.toString();
    }

    public boolean validarCpf(){
        System.out.println("cpf correto");
        return true;
    }
} 