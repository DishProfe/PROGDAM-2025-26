
package ejemplosunidad03;


import java.awt.Rectangle;
import java.util.Scanner;

/**
 * Programa Ejemplos de uso de objetos
 * @author diosdado
 */




public class Objetos02 {
 
	public static void main(String[] args) throws InterruptedException  {

            //----------------------------------------------
            //          Declaración de variables 
            //----------------------------------------------

            // Constantes


            // Variables de entrada




            // Variables de salida



            // Variables auxiliares
            Rectangle r1, r2, r3, r4, r5, r6, r7, r8, r9;
            
            
            
            


            // Clase Scanner para petición de datos de entrada
            Scanner teclado= new Scanner (System.in);
        
        
            //----------------------------------------------
            //                Entrada de datos 
            //----------------------------------------------
            System.out.println("EJEMPLOS DE USO DE OBJETOS");
            System.out.println("--------------------------");
            System.out.println(" ");


            //----------------------------------------------
            //                 Procesamiento 
            //----------------------------------------------

            r1 = new Rectangle ();

            r2 = new Rectangle (10, 5);
            
            r3 = new Rectangle ( 5, 4, 2, 3);
            
            r4 = r1;
            
            r5 = new Rectangle ( r3 ); 
            
            r6 = new Rectangle (6, 6, 2, 2);
            
            r7 = r3.intersection (r6);
            
            r8 = r3.intersection (r2);
            
            //---------------------------------------------
            //              Salida de resultados 
            //----------------------------------------------

            System.out.println ();
            System.out.println ("RESULTADO");
            System.out.println ("---------");

            System.out.println ("Anchura de r3 obtenida directamente al consultar el atributo width: " + 
                    r3.width);
            System.out.println ("Anchura de r3 obtenida con el método getWidth(): " + r3.getWidth() );

            System.out.println ("r3 y r5 son iguales? " + r3.equals(r5));
            System.out.println ("r3 == r5 ? " + (r3 == r5) );
            
            System.out.println ("r3 contiene al punto (6,5)? " + 
                    r3.contains (6,5) );

            System.out.println ("r3 contiene al punto (8,5)? " + 
                    r3.contains (8,5) );
            
            System.out.println ("r7 = Intersección de r3 y r6: " + 
                    r7.toString() );
            
            System.out.println ("r8 = Intersección de r3 y r2: " + 
                    r8.toString() );
            
            System.out.println ();
            System.out.println ("Fin del programa.");
        
        
	}
    
}