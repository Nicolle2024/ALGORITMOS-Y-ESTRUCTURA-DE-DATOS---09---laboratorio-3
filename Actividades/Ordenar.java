package Actividades; 
public class Ordenar { 
    public static void ordenar(int[] v) { 
        for (int i = 0; i < v.length - 1; i++) {       // O(n) 
            for (int j = 0; j < v.length - 1 - i; j++) { // O(n) 
                if (v[j] > v[j + 1]) {                // O(1) 
                    int aux = v[j];                   // O(1) 
                    v[j] = v[j + 1];                  // O(1) 
                    v[j + 1] = aux;                   // O(1) 
                } 
            } 
        } 
    }

    public static void main(String[] args) { 
        int[] v = {5, 3, 1, 4}; 
        ordenar(v); 
        for (int num : v) { 
            System.out.print(num + " "); 
        } 
    } 
} 

// Complejidad: O(n^2) 
