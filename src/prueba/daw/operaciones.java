/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba.daw;

/**
 *
 * @author Dani
 * @version V2.0 Clase que a través de dos métodos obtiene el cuadrado de un elemento y 
 * número random
 */
public class operaciones {

    /**
     * 
     * @param num es un número que le introducimos al método
     * @return el cuadrado del numero num 
     */
    public static double elementoAlCuadrado(double num){
        return num*num;
    }
    
    /**
     * 
     * @return un número rándom
     */
    public static double numeroRandom(){
        return Math.random();
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double numeroRandom=numeroRandom();
        
        System.out.println("Numero random = " + numeroRandom);
        System.out.println("Numero random al cuadrado = " + elementoAlCuadrado(numeroRandom));
        
        System.out.println("Esta línea es la primera actualización del código");
    }
    
}
