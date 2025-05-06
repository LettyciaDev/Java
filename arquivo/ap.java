import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ap {
    public static void main(String[] args){
        carros c;
        FileInputStream fluxo;

        try {
            fluxo = new FileInputStream("carro.ser");
            ObjectInputStream objarq = new ObjectInputStream(fluxo);
            c = (carros) objarq.readObject();
            objarq.close();
            System.out.println("Objeto lido "+c);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        } catch (ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
