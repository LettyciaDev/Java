interface Pagavel{
    void calcularPagamento();
}
class Funcionario implements Pagavel{
    private String nome;
    private float salario;

    public Funcionario(String nome, float salario){
        this.nome = nome;
        this.salario = salario;
    }

    void setNome(String nome){
        this.nome = nome;
    }

    String getNome(){
        return this.nome;
    }

    void setSalario(float salario){
        this.salario = salario;
    }

    float getSalario(){
        return this.salario;
    }

    @Override
    public void calcularPagamento(){
        System.out.println("Salario: " + getSalario());
    }
}

class Freelancer implements Pagavel{
    private String nome;
    private int hora;

    public Freelancer(String nome, int hora){
        this.nome = nome;
        this.hora = hora;
    }

    void setNome(String nome){
        this.nome = nome;
    }

    String getNome(){
        return this.nome;
    }

    void setHora(int hora){
        this.hora = hora;
    }

    int getHora(){
        return this.hora;
    }

    @Override
    public void calcularPagamento(){
        System.out.println("Salario: " + getHora() * 50);
    }
}

