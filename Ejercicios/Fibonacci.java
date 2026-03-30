package Ejercicios;
public class Fibonacci {
    public static int fibonacci(int n) {
        if (n <= 1) return n;   // O(1)
        return fibonacci(n - 1) + fibonacci(n - 2); // T(n-1) + T(n-2)
    }
    public static void main(String[] args) {
        int n = 6;
        System.out.println("Fibonacci: " + fibonacci(n));
    }
}
// Complejidad: O(2^n)
// Tipo: Exponencial
