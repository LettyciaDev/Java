/* COLEÇÕES: É uma estrutura que armazena 
   conjuntos de objetos 
 */

 import java.util.List;
 import java.util.ArrayList;
 import java.util.LinkedList;


 public class Main{
    public static void main(String[] args){
        //  LIST - ARRAYLIST, LINKEDLIST
        Usuario u1 = new Usuario("Maria");
        Usuario u2 = new Usuario("Maria");
        Usuario u3 = new Usuario("Maria");
        Usuario u4 = new Usuario("Maria");

        // Criando uma list que instanciará um ArrayList
       /*List<Usuario> listaDeObjetos = new ArrayList<Usuario>();
        listaDeObjetos.add(u1);
        listaDeObjetos.add(u2);
        listaDeObjetos.add(u3);
        listaDeObjetos.add(u4);*/

        // Criando uma list que instanciará uma LinkedList
        List<Usuario> listaDeObjetos = new LinkedList<Usuario>();
        listaDeObjetos.add(u1);
        listaDeObjetos.add(u2);
        listaDeObjetos.add(u3);
        listaDeObjetos.add(u4);
    }
 }