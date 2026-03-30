package Ejercicios; 
public class PotenciaRapida { 
    public static int potenciaRapida(int x, int y) { 
        if (y == 0) return 1;          // O(1) 
        if (y % 2 == 0) { 
            int mitad = potenciaRapida(x, y / 2); // T(n/2) 
            return mitad * mitad;                 // O(1) 
        } else { 
            return x * potenciaRapida(x, y - 1);  // T(n-1) 
        } 
    } 

    public static void main(String[] args) { 
        System.out.println("Resultado: " + potenciaRapida(2, 5)); 
    } 
} 

// Mejor caso: O(log n) 
// Peor caso: O(n) 
