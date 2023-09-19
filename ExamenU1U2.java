
package examenu1u2;
import java.util.Scanner;

public class ExamenU1U2
{

   
    public static void main(String[] args)
    {
      Scanner Scanner =new Scanner (System.in);
        System.out.println("Nombre de los videojuegos");
        String videojuego1 =Scanner.nextLine();
        System.out.println("Nombre de los videojuegos");
        String videojuego2 =Scanner.nextLine();
        System.out.println("Nombre de los videojuegos");
        String videojuego3 =Scanner.nextLine();
     
     
    

        System.out.println("Ingresa el valor del producto 1");
        double precio1= Scanner.nextDouble();
        System.out.println("Ingresa el valor del producto 2");
        double precio2= Scanner.nextDouble();
        
        System.out.println("Ingresa el valor del producto 3");
        double precio3= Scanner.nextDouble();
        
      double VideoJuego1 = (precio1*30)/100 ; 
      double VideoJuego2= (precio2*60)/100;
      double VideoJuego3= (precio3*15)/100;
      
      
        double descuentos1 = precio1-VideoJuego1;
        System.out.println("El descuento  del videojuego1 es "+ descuentos1 );
        double descuentos2 = precio2-VideoJuego2;
        System.out.println("El descuento  del videojuego2 es  "+descuentos2 );
        double descuentos3 = precio3-VideoJuego3;
        System.out.println("El descuento  del videojuego3 es  "+descuentos3 );
       
          Scanner.close();
    
      
}
 }
       