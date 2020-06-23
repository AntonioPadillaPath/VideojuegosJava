package textarreglos;
import java.util.Scanner;

public class TextArreglos {

    public static void main(String[] args) {
        
        Scanner lector = new Scanner (System.in);
        
        float promedio = 0;
        int suma = 0, mayor = 0, menor = 0, total = 10;

        System.out.println("¿Cuántos elementos quieres que tenga el arreglo?:");
        total = lector.nextInt();
        
        int[] miArreglo = new int[total];

        // Lectura del arreglo
        for (int contador = 0; contador < total; contador++) {
            System.out.print("Ingrese el número en la posición " + (contador) + " :");
            miArreglo[contador] = lector.nextInt();
        }

        // realizar la suma, promedio,menor y mayor
        for (int contador = 0; contador < miArreglo.length; contador++) 
        {
            suma += miArreglo[contador]; 
            if (mayor < miArreglo[contador]) 
            {
                mayor = miArreglo[contador];
            }
            
            System.out.println(String.format("Posición [%d] Elemento: %d", contador,miArreglo[contador]));
        }
  
        menor = mayor;
        // buscar el menor
        for (int contador = 0; contador < miArreglo.length; contador++) 
        {
            if (menor > miArreglo[contador]) 
            {
                menor = miArreglo[contador];
            }
        }
        
        //promedio
        promedio = suma / miArreglo.length;
        System.out.println("***Salida***");
        // contar las veces que se repite cada número
 

        int cont;
        for (int contador = 0; contador < miArreglo.length; contador++) 
        {
            cont = 0;
            for (int j = contador; j < miArreglo.length; j++) 
            {
              if (miArreglo[contador] == miArreglo[j]) 
              {
                  cont++;
              }
            }
            
        System.out.println(String.format("El número %d se repite %d veces",miArreglo[contador], cont));
        System.out.println(String.format("La suma es %.2f, el promedio es %.2f, el mayor es %d, el menor es %d",suma, promedio, mayor, menor));
        
        }
    }
}
