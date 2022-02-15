/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package frasenova;
/**
 *
 * @author grass
 */
public class removed {
    
    public static String removedupla(String palavra){
        char palavraArray[]=palavra.toCharArray();
        String retorno=new String();
        for(int i=0; i<palavraArray.length-1;i++){
            if(palavraArray[i]==palavraArray[i+1])
                i++;
            retorno+=palavraArray[i];
        }
            retorno+=palavraArray[palavraArray.length-1];
            return retorno;
    }
    public static void main(String[] args) {
        String palavras[]={"abaffiato","accio","colloportus"};
        System.out.println("[");
        for(int i=0; i<palavras.length;i++){
            palavras[i]=removedupla(palavras[i]);
            System.out.println("'"+palavras[i]+"' ");
        }
        System.out.println("]");
    }
}
