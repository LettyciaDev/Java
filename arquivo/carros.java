import java.io.Serializable;

public class carros implements Serializable{
   private String modelo;
   private int ano;
   private String cor;
   private boolean novo;

   public carros(String modelo, int ano, String cor, boolean novo){
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        this.novo = novo;
   }
}
