package Ejercicios; 
public class ConteoI { 
    public static int conteoI(int[] v) { 
        int conteo = 0; // O(1) 
        for (int i = 0; i < v.length - 1; i++) {        // O(n) 
           for (int j = i + 1; j < v.length; j++) {    // O(n) 
                if (v[i] == v[j]) {                    // O(1) 
                    conteo++; 
                } 
            } 
        } 
        return conteo; // O(1) 
    }

    public static void main(String[] args) { 
        int[] v = {1, 2, 1, 2}; 
        System.out.println("Conteo: " + conteoI(v)); 
    } 
} 
// Complejidad: O(n^2) 
