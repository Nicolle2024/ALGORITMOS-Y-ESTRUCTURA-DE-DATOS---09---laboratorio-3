package Actividades; 
public class Potencia { 
    public static double potencia(double x, int y) { 
        if (y == 0) return 1.0; // O(1) 
        if (y % 2 == 1) { 
            return x * potencia(x, y - 1); // T(n-1) 
        } else { 
            double t = potencia(x, y / 2); // T(n/2) 
            return t * t;                  // O(1) 
        } 
    } 

    public static void main(String[] args) { 
        System.out.println(potencia(2, 5)); 
    } 
} 

// Mejor: O(log n) 
// Peor: O(n) 
