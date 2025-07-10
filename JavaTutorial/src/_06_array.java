import java.util.Arrays;

public class _06_array {
    public static void main(String[] args) {
        // === 📦 1. Array Declaration and Initialization ===
        int[] numbers = {10, 20, 30, 40, 50}; // fixed size array
        System.out.println("=== Array Elements ===");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Index " + i + ": " + numbers[i]);
        }

        // === 🛠️ 2. Modifying an element ===
        numbers[2] = 99; // Change 30 to 99
        System.out.println("\nUpdated element at index 2: " + numbers[2]);

        // === 🔁 3. Using for-each loop ===
        System.out.println("\n=== Using for-each loop ===");
        for (int num : numbers) {
            System.out.println(num);
        }

        // === ➕ 4. Sum of array elements ===
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("\nSum of elements: " + sum);

        // === 🔍 5. Finding max and min ===
        int max = numbers[0];
        int min = numbers[0];
        for (int num : numbers) {
            if (num > max) max = num;
            if (num < min) min = num;
        }
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);

        // === 📏 6. Length of array ===
        System.out.println("\nLength of array: " + numbers.length);

        // === 🔃 7. Sorting the array ===
        Arrays.sort(numbers);
        System.out.println("\nSorted array: " + Arrays.toString(numbers));

        // === 🧩 8. Multidimensional Array (2D) ===
        System.out.println("\n=== 2D Array ===");
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6}
        };

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println(); // new line after each row
        }

        // === ❓ Bonus: Default values ===
        System.out.println("\n=== Default Values in int[5] ===");
        int[] emptyArray = new int[5]; // default: 0
        System.out.println(Arrays.toString(emptyArray));
    }
}
