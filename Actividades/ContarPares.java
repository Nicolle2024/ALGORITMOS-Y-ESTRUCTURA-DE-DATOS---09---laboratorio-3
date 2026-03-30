package Actividades; 
public class ContarPares { 
    public static int contarPares(int[] A) { 
        int contador = 0;          // O(1) 
        for (int i = 0; i < A.length; i++) { // O(n) 
            if (A[i] % 2 == 0) {             // O(1) 
                contador++;                  // O(1) 

            } 
        } 
        return contador;           // O(1) 
    } 

    public static void main(String[] args) { 
        int[] A = {1, 2, 3, 4, 6}; 
        System.out.println("Pares: " + contarPares(A)); 
    } 
} 

// Complejidad: O(n) 
