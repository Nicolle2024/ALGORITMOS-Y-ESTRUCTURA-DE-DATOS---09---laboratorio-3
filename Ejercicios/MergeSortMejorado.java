package Ejercicios; 
public class MergeSortMejorado { 
    public static void mergeSort2(int[] arr, int left, int right) { 
        if (left >= right) return; // O(1) 
        int mid = (left + right) / 2; // O(1) 
        mergeSort2(arr, left, mid);       // T(n/2) 
        mergeSort2(arr, mid + 1, right);  // T(n/2) 

        // Mejora: evitar merge innecesario 
        if (arr[mid] <= arr[mid + 1]) return; // O(1) 
        merge(arr, left, mid, right); // O(n) 
    } 

    public static void merge(int[] arr, int left, int mid, int right) { 
        int n1 = mid - left + 1; 
        int n2 = right - mid; 
        int[] L = new int[n1]; 
        int[] R = new int[n2]; 
        for (int i = 0; i < n1; i++) L[i] = arr[left + i]; 
        for (int j = 0; j < n2; j++) R[j] = arr[mid + 1 + j]; 
        int i = 0, j = 0, k = left; 
        while (i < n1 && j < n2) { 
            if (L[i] <= R[j]) { 
                arr[k++] = L[i++]; 
            } else { 
                arr[k++] = R[j++]; 
            } 
        } 

 

        while (i < n1) arr[k++] = L[i++]; 
        while (j < n2) arr[k++] = R[j++]; 
    } 

 

    public static void main(String[] args) { 
        int[] arr = {1, 2, 3, 4, 5}; 
        mergeSort2(arr, 0, arr.length - 1); 
        for (int num : arr) { 
            System.out.print(num + " "); 
        } 
    } 

} 
// Mejor caso: O(n) 
// Peor caso: O(n log n) 
