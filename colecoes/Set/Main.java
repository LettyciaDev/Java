/* COLEÇÕES: É uma estrutura que armazena 
   conjuntos de objetos 
 */

import java.util.HashSet;
 import java.util.Set;

 public class Main{
    public static void main(String[] args){
        //  SET - HASHESET, TREESET
        Usuario u1 = new Usuario("Maria");
        Usuario u2 = new Usuario("Joao");
        Usuario u3 = new Usuario("Ana");
        Usuario u4 = new Usuario("Paulo");
      
        Set<Usuario> conjunto = new HashSet<>();
        conjunto.add(u1);
        conjunto.add(u2);
        conjunto.add(u3);
        conjunto.add(u4);
        
    }
 }