public class _03_commonStringOperations {
    public static void main(String[] args) {
        String name = "  Pranjal Singh  ";

        // 1. length() - Returns number of characters in the string
        System.out.println("Length: " + name.length()); // includes spaces

        // 2. trim() - Removes leading and trailing spaces
        String trimmedName = name.trim();
        System.out.println("Trimmed: '" + trimmedName + "'");

        // 3. toUpperCase() - Converts to uppercase
        System.out.println("Uppercase: " + trimmedName.toUpperCase());

        // 4. toLowerCase() - Converts to lowercase
        System.out.println("Lowercase: " + trimmedName.toLowerCase());

        // 5. charAt(index) - Returns character at given index
        System.out.println("Character at index 0: " + trimmedName.charAt(0));

        // 6. indexOf("substring") - Returns index of first occurrence
        System.out.println("Index of 'Singh': " + trimmedName.indexOf("Singh"));

        // 7. contains("substring") - Checks if string contains another string
        System.out.println("Contains 'jal': " + trimmedName.contains("jal"));

        // 8. equals() - Compares content (case-sensitive)
        System.out.println("Equals 'pranjal singh': " + trimmedName.equals("pranjal singh")); // false

        // 9. equalsIgnoreCase() - Case-insensitive comparison
        System.out.println("EqualsIgnoreCase 'pranjal singh': " + trimmedName.equalsIgnoreCase("pranjal singh")); // true

        // 10. replace() - Replace characters or substrings
        System.out.println("Replace 'a' with '*': " + trimmedName.replace('a', '*'));

        // 11. substring(start, end) - Extract substring (start inclusive, end exclusive)
        System.out.println("Substring (0 to 7): " + trimmedName.substring(0, 7));

        // 12. split(" ") - Splits string based on a delimiter (like space)
        String[] parts = trimmedName.split(" ");
        System.out.println("First word: " + parts[0]);
        System.out.println("Second word: " + parts[1]);
    }
}
