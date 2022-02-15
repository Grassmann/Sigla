/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package frasenova;

import java.util.Scanner;

/**
 *
 * @author grass
 */
public class Frasenova {
    public static String solucao(String frase) {
        //String resposta = "";
        char[] palavraArray = frase.toCharArray();
        String retorno=new String();
        retorno+=palavraArray[0];
        
        for(int i=0; i<palavraArray.length;i++){
            if(palavraArray[i]==' ')
            retorno+=palavraArray[i+1];
        }
        return retorno;
    }
    public static void main(String[] args) {
        Scanner ler=new Scanner(System.in);
        System.out.println("Entre com uma frase:");
        String frase=ler.nextLine();
        System.out.println(solucao(frase));
    }
    
}
