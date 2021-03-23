
package Paquete1;

public class Metodos {
    
    
    //Metodos
    public String[] convercion(String palabra){
    String[] convercionPalabra=palabra.split("");
    return convercionPalabra;
    }
    
    public String[] convercionR(String palabra){
    String[] convercionPalabra=palabra.split(" ");
    return convercionPalabra;
    }
    
    public int contador(String[] convercionPalabra, String[] convercionRespuesta,String[] abecedarioI){
    int contador=0;
    for(int i=0;i<convercionPalabra.length;i++){
            
            //EL PROBLEMA CON EL QUE ME HE ENCONTRADO ES QUE UN STRING Y UN CHAR NO SE PUEDEN COMPARAR // Problema resuelto
            
            switch(convercionPalabra[i]){
                
                    //Revisaremos cada pocicion guiandonos con los lugares de la primer palabra digitada 
                    case "a":
                       //Utilizamos las posiciones del areglo( abecedarioI ) para compararlas con las pociciones del arreglo ( convercionRespuesta )
                        if(abecedarioI[0].equals(convercionRespuesta[i])){
                           contador++;
                       }
                       else{
                       //No pasa nada si estra ente else 
                       }
                        break;
                    case "b":
                        if(abecedarioI[1].equals(convercionRespuesta[i])){
                        contador++;
                        }
                        else{
                            //No pasa nada 
                        }
                        break;
                    case "c":
                        if(abecedarioI[2].equals(convercionRespuesta[i])){
                        contador++;
                        }
                        else{
                            //No pasa nada 
                        }
                        break;
                    case "d":
                        if(abecedarioI[3].equals(convercionRespuesta[i])){
                        contador++;
                        }
                        else{
                            //No pasa nada 
                        }
                        break; 
                    case "e":
                        if(abecedarioI[4].equals(convercionRespuesta[i])){
                        contador++;
                        }
                        else{
                            //No pasa nada 
                        }
                        break;
                    case "f":
                        if(abecedarioI[5].equals(convercionRespuesta[i])){
                        contador++;
                        }
                        else{
                            //No pasa nada 
                        }
                        break;
                    case "g":
                        if(abecedarioI[6].equals(convercionRespuesta[i])){
                        contador++;
                        }
                        else{
                            //No pasa nada 
                        }
                        break;
                    case "h":
                        if(abecedarioI[7].equals(convercionRespuesta[i])){
                        contador++;
                        }
                        else{
                            //No pasa nada 
                        }
                        break;
                    case "i":
                        if(abecedarioI[8].equals(convercionRespuesta[i])){
                        contador++;
                        }
                        else{
                            //No pasa nada 
                        }
                        break;
                    case "j":
                        if(abecedarioI[9].equals(convercionRespuesta[i])){
                        contador++;
                        }
                        else{
                            //No pasa nada 
                        }
                        break;
                    case "k":
                        if(abecedarioI[10].equals(convercionRespuesta[i])){
                        contador++;
                        }
                        else{
                            //No pasa nada 
                        }
                        break;
                    case "l":
                        if(abecedarioI[11].equals(convercionRespuesta[i])){
                        contador++;
                        }
                        else{
                            //No pasa nada 
                        }
                        break;
                    case "m":
                        if(abecedarioI[12].equals(convercionRespuesta[i])){
                        contador++;
                        }
                        else{
                            //No pasa nada 
                        }
                        break;
                    case "n":
                        if(abecedarioI[13].equals(convercionRespuesta[i])){
                        contador++;
                        }
                        else{
                            //No pasa nada 
                        }
                        break;
                    case "o":
                        if(abecedarioI[14].equals(convercionRespuesta[i])){
                        contador++;
                        }
                        else{
                            //No pasa nada 
                        }
                        break;
                    case "p":
                        if(abecedarioI[15].equals(convercionRespuesta[i])){
                        contador++;
                        }
                        else{
                            //No pasa nada 
                        }
                        break;
                    case "q":
                        if(abecedarioI[16].equals(convercionRespuesta[i])){
                        contador++;
                        }
                        else{
                            //No pasa nada 
                        }
                        break;
                    case "r":
                        if(abecedarioI[17].equals(convercionRespuesta[i])){
                        contador++;
                        }
                        else{
                            //No pasa nada 
                        }
                        break;
                    case "s":
                        if(abecedarioI[18].equals(convercionRespuesta[i])){
                        contador++;
                        }
                        else{
                            //No pasa nada 
                        }
                        break;
                    case "t":
                        if(abecedarioI[19].equals(convercionRespuesta[i])){
                        contador++;
                        }
                        else{
                            //No pasa nada 
                        }
                        break;
                    case "u":
                        if(abecedarioI[20].equals(convercionRespuesta[i])){
                        contador++;
                        }
                        else{
                            //No pasa nada 
                        }
                        break;
                    case "v":
                        if(abecedarioI[21].equals(convercionRespuesta[i])){
                        contador++;
                        }
                        else{
                            //No pasa nada 
                        }
                        break;
                    case "w":
                        if(abecedarioI[22].equals(convercionRespuesta[i])){
                        contador++;
                        }
                        else{
                            //No pasa nada 
                        }
                        break;
                        
                        
                    case "x":
                        if(abecedarioI[23].equals(convercionRespuesta[i])){
                        contador++;
                        }
                        else{
                            //No pasa nada 
                        }
                        break;
                    case "y":
                        if(abecedarioI[24].equals(convercionRespuesta[i])){
                        contador++;
                        }
                        else{
                            //No pasa nada 
                        }
                        break;
                    case "z":
                        if(abecedarioI[25].equals(convercionRespuesta[i])){
                        contador++;
                        }
                        else{
                            //No pasa nada 
                        }
                        break;
                        
                        
                            }
        }
    return contador;
    }
    
   
    //Notar que este metodo no devuelve ningun valor
   public void respuestaCorrecta(String[] convercionPalabra, String[] abecedarioI){
   System.out.println(" ¡ La respuesta no fue correcta ! \n");
//            System.out.println("Palabra:                 "+palabra);
//            System.out.println("Tu respuesta:            "+respuesta);
            
            System.out.print("La respuesta correcta es: ");
            //Imprimimos la respuesta correcta
            for(int i=0;i<convercionPalabra.length;i++){
            
                switch(convercionPalabra[i]){
                    case "a":
                        System.out.print(abecedarioI[0]+"-");
                        break;
                    case "b":
                        System.out.print(abecedarioI[1]+"-");
                        break;
                    case "c":
                        System.out.print(abecedarioI[2]+"-");
                        break;
                    case "d":
                        System.out.print(abecedarioI[3]+"-");
                        break;
                    case "e":
                        System.out.print(abecedarioI[4]+"-");
                        break;
                    case "f":
                        System.out.print(abecedarioI[5]+"-");
                        break;
                    case "g":
                        System.out.print(abecedarioI[6]+"-");
                        break;
                    case "h":
                        System.out.print(abecedarioI[7]+"-");
                        break;
                    case "i":
                        System.out.print(abecedarioI[8]+"-");
                        break;
                    case "j":
                        System.out.print(abecedarioI[9]+"-");
                        break;
                    case "k":
                        System.out.print(abecedarioI[10]+"-");
                        break;
                    case "l":
                        System.out.print(abecedarioI[11]+"-");
                        break;
                    case "m":
                        System.out.print(abecedarioI[12]+"-");
                        break;
                    case "n":
                        System.out.print(abecedarioI[13]+"-");
                        break;
                    case "o":
                        System.out.print(abecedarioI[14]+"-");
                        break;
                    case "p":
                        System.out.print(abecedarioI[15]+"-");
                        break;
                    case "q":
                        System.out.print(abecedarioI[16]+"-");
                        break;
                    case "r":
                        System.out.print(abecedarioI[17]+"-");
                        break;
                    case "s":
                        System.out.print(abecedarioI[18]+"-");
                        break;
                    case "t":
                        System.out.print(abecedarioI[19]+"-");
                        break;
                    case "u":
                        System.out.print(abecedarioI[20]+"-");
                        break;
                    case "v":
                        System.out.print(abecedarioI[21]+"-");
                        break;
                    case "w":
                        System.out.print(abecedarioI[22]+"-");
                        break;
                    case "x":
                        System.out.print(abecedarioI[23]+"-");
                        break;
                    case "y":
                        System.out.print(abecedarioI[24]+"-");
                        break;
                    case "z":
                        System.out.print(abecedarioI[25]+"-");
                        break;
                
                }
            }
   
   }
    
    
}
