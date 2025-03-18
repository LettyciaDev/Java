public final class Tecnico extends Pessoa{

    public Tecnico(String no, int idd, double alt){
       super(no,idd,alt);
    }
    
    public boolean validarCpf(){
        return true;
    }
}