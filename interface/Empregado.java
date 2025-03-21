public class Empregado implements Comparable{
    private int id;
    private String nome;

    public Empregado(int id, String nome){
        this.id = id;
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getId(){
        return this.id;
    }

    public void setId(int id){
        this.id = id;
    }

    public int compareTo(Object obj){
        return this.nome.compareTo(((Empregado) obj ).getNome());
    }
}