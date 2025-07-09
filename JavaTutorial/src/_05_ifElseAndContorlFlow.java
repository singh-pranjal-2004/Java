public class _05_ifElseAndContorlFlow {
    public static void main(String[] args) {
        // === 🧭 if-else ===
        int age = 18;

        System.out.println("=== if-else ===");
        if (age < 13) {
            System.out.println("You are a child.");
        } else if (age < 20) {
            System.out.println("You are a teenager.");
        } else {
            System.out.println("You are an adult.");
        }

        // === 🔄 switch ===
        int day = 3;

        System.out.println("\n=== switch ===");
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Another day");
        }

        // === 🔁 for loop ===
        System.out.println("\n=== for loop ===");
        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }

        // === 🔁 while loop ===
        System.out.println("\n=== while loop ===");
        int j = 1;
        while (j <= 3) {
            System.out.println("j = " + j);
            j++;
        }

        // === 🔁 do-while loop ===
        System.out.println("\n=== do-while loop ===");
        int k = 1;
        do {
            System.out.println("k = " + k);
            k++;
        } while (k <= 2);

        // === ⛔ break and continue ===
        System.out.println("\n=== break and continue ===");
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                System.out.println("Skipping 3 using continue");
                continue; // skip this iteration
            }
            if (i == 5) {
                System.out.println("Breaking at 5");
                break; // exit the loop
            }
            System.out.println("i = " + i);
        }
    }
}
