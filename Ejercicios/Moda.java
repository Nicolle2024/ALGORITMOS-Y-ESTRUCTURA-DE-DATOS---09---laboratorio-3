package Ejercicios;
import java.util.HashMap;
public class Moda {
    public static int moda(int[] v) {
        HashMap<Integer, Integer> frecuencia = new HashMap<>();
        int maxFrecuencia = 0;
        int moda = v[0];
        for (int num : v) { // O(n)
            int f = frecuencia.getOrDefault(num, 0) + 1; // O(1)
            frecuencia.put(num, f);                      // O(1)
            if (f > maxFrecuencia) {
                maxFrecuencia = f;
                moda = num;
            }
        }
        return moda;
    }
    public static void main(String[] args) {
        int[] v = {1, 3, 3, 2};
        System.out.println("Moda: " + moda(v));
    }
}
// Complejidad: O(n)
