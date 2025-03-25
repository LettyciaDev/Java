/* COLEÇÕES: É uma estrutura que armazena 
   conjuntos de objetos 
 */

import java.util.HashMap;
 import java.util.Map;

 public class Main{
    public static void main(String[] args){
        // MAP - HASHMAP, TREEMAP
        Usuario u1 = new Usuario("Maria");
        Usuario u2 = new Usuario("Maria");
        Usuario u3 = new Usuario("Maria");
        Usuario u4 = new Usuario("Maria");

       /*precisa indicar um objeto instaciado e um tipo 
       que representará a posição especifica do objeto*/

        Map<Usuario, Integer> mapa = new HashMap<>();
        mapa.put(u1,1);
    }
 }