public class _04_arithmeticAndBitwiseOperations {
    public static void main(String[] args) {

        // ==== 🧮 Arithmetic Operations ====
        int a = 10;
        int b = 3;

        System.out.println("=== Arithmetic Operations ===");
        System.out.println("a + b = " + (a + b)); // Addition → 13
        System.out.println("a - b = " + (a - b)); // Subtraction → 7
        System.out.println("a * b = " + (a * b)); // Multiplication → 30
        System.out.println("a / b = " + (a / b)); // Division → 3 (int division)
        System.out.println("a % b = " + (a % b)); // Modulus → 1


        // ==== ➕➖ Increment & Decrement ====
        int num = 5;

        System.out.println("\n=== Increment & Decrement ===");
        System.out.println("Original num = " + num);

        System.out.println("Pre-increment (++num): " + (++num)); // 6
        System.out.println("Post-increment (num++): " + (num++)); // 6, then becomes 7
        System.out.println("After post-increment: " + num); // 7

        System.out.println("Pre-decrement (--num): " + (--num)); // 6
        System.out.println("Post-decrement (num--): " + (num--)); // 6, then becomes 5
        System.out.println("After post-decrement: " + num); // 5


        // ==== 🔢 Bitwise Operations ====
        int x = 6;   // binary: 0110
        int y = 3;   // binary: 0011

        System.out.println("\n=== Bitwise Operations ===");
        System.out.println("x = " + x + " (binary: 0110)");
        System.out.println("y = " + y + " (binary: 0011)");

        System.out.println("x & y = " + (x & y));  // AND → 2  (0010)
        System.out.println("x | y = " + (x | y));  // OR → 7   (0111)
        System.out.println("x ^ y = " + (x ^ y));  // XOR → 5  (0101)
        System.out.println("~x = " + (~x));        // NOT → -7 (inverts bits)

        System.out.println("x << 1 = " + (x << 1)); // Left shift → 12 (1100)
        System.out.println("x >> 1 = " + (x >> 1)); // Right shift → 3 (0011)
        System.out.println("x >>> 1 = " + (x >>> 1)); // Unsigned right shift → 3
    }
}
