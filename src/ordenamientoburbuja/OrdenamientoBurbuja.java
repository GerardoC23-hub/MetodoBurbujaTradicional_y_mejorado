/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ordenamientoburbuja;
import java.util.Arrays;
/**
 *
 * @author gerardo cruz hernández
 * Grado: 4 , Grupo: C
 */
public class OrdenamientoBurbuja {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // Arreglo para probar el método tradicional
        int[] arreglo1 = {57, 21, 13, 24, 3};

        // Arreglo para probar el método mejorado
        int[] arreglo2 = {11, 62, 34, 51, 14};

        // Método tradicional de ordenamiento burbuja
        Burbuja.ordenamientoBurbuja(arreglo1);

        // Muestra el arreglo ordenado tradicionalmente
        System.out.println("Burbuja tradicional: " + Arrays.toString(arreglo1));

        // Llama al método mejorado de la clase Burbuja
        Burbuja.ordenamientoBurbujaMejorado(arreglo2);

        // Muestra el arreglo ordenado con el método mejorado
        System.out.println("Burbuja mejorada: " + Arrays.toString(arreglo2));
    
    }
    
}
