/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosjava01;

/**
 *
 * @author rioja
 */
public class Isograma {

    private boolean esIsograma(String palabra){
       for (int i=0; i<palabra.length()-1; i++){
           for (int j=i+1; j<palabra.length(); j++){
               if (palabra.charAt(j) == palabra.charAt(i)){
                   return false;
               }
           }
       }
      
       return true;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Isograma ejercicios = new Isograma();
        
            System.out.println("TACCAT  " +ejercicios.esIsograma("TACCAT")) ;
            System.out.println("murcielago  " +ejercicios.esIsograma("murcielago")) ;
            System.out.println("murcielagoo  " +ejercicios.esIsograma("murcielagoo")) ;
    }
    
}
