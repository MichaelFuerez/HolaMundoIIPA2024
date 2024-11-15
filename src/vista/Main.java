/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

/**
 *
 * @author HP
 */
public class Main {
    //1.-DECLARAR EL METODO MAIN- LLAMA AL INERPRETE DE JAVA
    public static void main(String[] args) {
        System.out.println("HOLA MUDNO!!!");
        
        //EJERCICIO 1: DETERMINAR EL HOROSCOPO MEDIANTE EL SIGNO ZODIACAL
        String signoZodiacal="Geminis";
        if(signoZodiacal=="Aries"){
            System.out.println("EL DÍA DE HOY TE VAS A MORIR DEL HAMBRE!!!");
        }else if (signoZodiacal=="Leo") {
            System.out.println("HOY SERÁS LA PERSONA MÁS FELIZ DEL MUNDO ");
        }else if ( signoZodiacal=="Cáncer") {
            System.out.println("TENDRÁS UN DÍA CAÓTICO PERO ES POSIBLE QUE ENCUENTRES DINERO");
        }else{
            System.out.println("Ingrese un signo válido");
        }
            
        }
        
    }
}


