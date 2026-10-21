package ordenamientoburbuja;
/**
 *
 * @author gerardo cruz hernández
 * Grado: 4 , Grupo: C
 */
public class Burbuja {

    // Método tradicional de ordenamiento burbuja
    public static void ordenamientoBurbuja(int[] arr) {
        // Ciclo externo que controla las pasadas
        for (int i = 0; i < arr.length - 1; i++) {

            // Ciclo interno que compara elementos adyacentes
            for (int j = 0; j < arr.length - 1 - i; j++) {

                // Verifica si los elementos están desordenados
                if (arr[j] > arr[j + 1]) {

                    // Guarda temporalmente el valor actual
                    int temp = arr[j];

                    // Intercambia los elementos
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Método mejorado de ordenamiento burbuja
    public static void ordenamientoBurbujaMejorado(int[] arreglo) {
        // Variable que indica si hubo intercambios
        boolean bandera = true;
        int pasada = 0;
    
        while(bandera == true)
        {   
            // Al inicio de cada pasada no hay intercambios
            bandera = false;
            // Compara los elementos adyacentes
            for (int j = 0; j < arreglo.length - 1 -pasada; j++) {

                // Si están desordenados, realiza el intercambio
                if (arreglo[j] > arreglo[j + 1]) {
                    // Indica que se realizó un intercambio
                    bandera = true;
                    // Guarda temporalmente el elemento
                    int temporal = arreglo[j];

                    // Intercambia los valores
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temporal;
                }
            }
            pasada++;
        }
           
    }
}
