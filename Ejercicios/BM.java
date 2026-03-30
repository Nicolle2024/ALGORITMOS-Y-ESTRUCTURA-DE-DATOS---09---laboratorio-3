package Ejercicios;
public class BM {
    public static int BM(int[] v) {
        int m = v[0]; // O(1)
        for (int i = 1; i < v.length; i++) { // O(n)
            if (v[i] > m) {                 // O(1)
                m = v[i];
            }
        }
        return m; // O(1)
    }
    public static void main(String[] args) {
        int[] v = {1, 5, 3, 9};
        System.out.println("Max: " + BM(v));
    }
}
// Complejidad: O(n)
