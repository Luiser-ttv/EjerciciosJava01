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
public class Palindromo {

    private boolean palindromo(String cadena){
       
        String auxiliar = "";
        for (int i=0; i< cadena.length(); i++){
            if (cadena.charAt(i) != ' '){
                auxiliar = auxiliar + cadena.charAt(i);
            }
        }
        
        int indiceIzq = 0;
        int indiceDer = auxiliar.length()-1;
        
        while (auxiliar.charAt(indiceIzq) == auxiliar.charAt(indiceDer) && indiceIzq <= indiceDer){
            indiceIzq++;
            indiceDer--;
        }
        boolean resultado = true;
        if (indiceIzq < indiceDer){ // si esto se cumple es que la palabra no es un palíndromo
            resultado = false;
            System.out.println("NO ES UN PALINDROMO ");
        }
        else{
            System.out.println("SI ES UN PALINDROMO ");
        }
    return resultado; 
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Palindromo ejercicios = new Palindromo();
        
           ejercicios.palindromo("ACASO HUBO BUHOS ACA") ;
           ejercicios.palindromo("ACdfgfgddfgASO HUBO BUHOS ACA") ;
           ejercicios.palindromo("TACOCAT") ;
           ejercicios.palindromo("TACCAT") ;
    }
    
}
