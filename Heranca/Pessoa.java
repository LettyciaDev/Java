public abstract class Pessoa{
    private String nome;
    private int idade;
    private double altura;
    
    public Pessoa(String no, int idd, double alt){
        this.nome = no;
        this.idade = idd;
        this.altura = alt;
    }
    public String getNome(){
        return this.nome;
    }

    public void setNome(String no){
        this.nome = no;
    }

    public int getIdade(){
        return this.idade;
    }

    public void setIdade(int idd){
        this.idade = idd;
    }

    public double getAltura(){
        return this.altura;
    }

    public void setAltura(float alt){
        this.altura = alt;
    }


    @Override
    public String toString(){
        return "Pessoa [nome= " + nome + ", idade= " + idade + ", altura= "+ altura + "]";
    }

    public abstract boolean validarCpf();
}