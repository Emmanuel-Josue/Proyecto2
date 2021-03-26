
package Paquete1;

import java.util.Scanner;


public class Principal {


    public static void main(String[] args) {

        //Atributos 
         int contador=0;
         String palabra,respuesta;
         
         Scanner entrada=new Scanner(System.in);
         
        //Creacion de arreglos
        //Arreglo de abecedario español
        //En el abecedario en ingles no consideran la letra ñ
        String[] abecedarioE= {"a","b","c","d","e","f","g","h","i","j","k","l","m"
                                ,"n","o","p","q","r","s","t","u","v","w","x","y","z"};
        
        // arreglo ingles 
        String[] abecedarioI= {"ei","bi","ci","di","i","ef","yi","eich","ai","jei","kei"
                                ,"el","em","en","ou","pi","kiu","ar","es","ti","iu","vi","dabliu","ex","uai","zi"};
        
        
         System.out.println("Digite la palabra a deletrear: ");
         palabra=entrada.nextLine();
         
        System.out.println("Dijite los sonidos de las palabras en ingles separandolos por espacios");
        respuesta=entrada.nextLine();
        
         //Creamos objeto de la clase Metodos
         Metodos objeto=new Metodos();

         contador=objeto.contador(objeto.convercion(palabra), objeto.convercionR(respuesta), abecedarioI);
         
        if(contador==objeto.convercion(palabra).length){
            //En este logar tambienpodria mostrar la respuesta que se brindo 
            System.out.println("Tu respuesta fue correcta!!!");
        }
        else{
          objeto.respuestaCorrecta(objeto.convercion(palabra), abecedarioI);
          }
        //Primer cambio
      System.out.println("PRIMER CAMBIO REALIZADO");
        
        //Segundo cambio
        System.out.println("espero esto lo detecte");

    }
    
}
