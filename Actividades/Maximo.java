package Actividades; 
public class Maximo { 
    public static int max(int x, int y) { 
        int result;                // O(1) 
        if (x == y) {              // O(1) 
            result = x; 
        } else { 
            if (x > y) {           // O(1) 
                result = x; 
            } else { 
                result = y; 
            } 
        } 
        return result;             // O(1) 

    } 
    public static void main(String[] args) { 
        System.out.println(max(5, 9)); 
    } 
} 

// Complejidad: O(1) 
