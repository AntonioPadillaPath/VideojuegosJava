package bubblesort;

import java.util.Scanner;

public class BubbleSort {
    
    static void bubbleSort(int[] arr) {  
        
        int n = arr.length;  
        int temp = 0;  
        
        for(int i=0; i < n; i++)
        {  
            for(int j=1; j < (n-i); j++)
            {  
                if(arr[j-1] > arr[j])
                {  
                //swap elements  
                temp = arr[j-1];  
                arr[j-1] = arr[j];  
                arr[j] = temp;  
                }
            }
            
            System.out.println("Arreglo en el paso " +i);
            for (int j = 0; j < arr.length; j++)
            {
                System.out.println(arr[j]+ " ");
            }
        }
    }
        
    
        public static void main(String[] args){
            
            int cantidad;
            
            Scanner lector = new Scanner (System.in);
            
            System.out.println("¿Cuántos elementos quieres que tenga el arreglo?:");
            cantidad = lector.nextInt();
         
        int arr[] = new int [cantidad];  
        
            System.out.println("Introduce los elementos del arrelgo:");
            System.out.println("");
            
            for (int i = 0; i < cantidad; i++)
            {
                System.out.println("Elemento " +i);
                arr[i] = lector.nextInt();
            }
                 
                System.out.println("Arreglo antes de Ordenamiento Burbuja");  
                
                for(int i=0; i < cantidad; i++)
                {  
                    System.out.print(arr[i] + " ");  
                }  
                System.out.println();  
                  
                bubbleSort(arr);//sorting array elements using bubble sort  
                
                System.out.println("Arreglo después de Ordenamiento Burbuja");  
                
                for(int i=0; i < arr.length; i++)
                {  
                    System.out.println(arr[i] + " "); 
                }
        }
}

