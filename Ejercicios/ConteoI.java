package Ejercicios; 
public class ConteoI { 
    public static int conteoI(int[] v) { 
        int conteo = 0; // O(1) 
        for (int i = 0; i < v.length - 1; i++) {        // O(n) 
           falta completar

    public static void main(String[] args) { 
        int[] v = {1, 2, 1, 2}; 
        System.out.println("Conteo: " + conteoI(v)); 
    } 
} 
// Complejidad: O(n^2) 
