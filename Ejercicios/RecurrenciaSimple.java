package Ejercicios; 
public class RecurrenciaSimple { 
    public static int funcion(int n) { 
        if (n <= 1) return 1; // O(1) 
        return funcion(n - 1) + 1; // T(n-1) 
    } 

    public static void main(String[] args) { 
        System.out.println(funcion(5)); 
    } 
} 

// Complejidad: O(n) 
