package Actividades; 
public class Suma { 
    public static int suma(int[] v) { 
        if (v.length <= 0) return 0; // O(1) 
        int result = 0;              // O(1) 
        for (int i = 0; i < v.length; i++) { // O(n) 
            result += v[i];                   // O(1) 
        } 
        return result;             // O(1) 
    } 
    public static void main(String[] args) { 
        int[] v = {1, 2, 3, 4}; 
        System.out.println("Suma: " + suma(v)); 
    } 
} 

// Complejidad: O(n) 
