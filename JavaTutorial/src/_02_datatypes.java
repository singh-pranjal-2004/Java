import org.w3c.dom.ls.LSOutput;

public class _02_datatypes {
    public static void main(String[] args) {
        System.out.println("Byte Range:");
        System.out.println("---------------");
        byte a = 127;
        System.out.println("Example byte value: " + a);
        System.out.println("Minimum byte value: " + Byte.MIN_VALUE); // -128 (8 bits)
        System.out.println("Maximum byte value: " + Byte.MAX_VALUE); // 127

        System.out.println();
        System.out.println("---------------");
        System.out.println("---------------");
        System.out.println();

        System.out.println("Short Range:");
        System.out.println("---------------");
        short b = 2;
        System.out.println("Example Short value: " + b);
        System.out.println("Minimum Short value: " + Short.MIN_VALUE); // -32,768 (16 bits)
        System.out.println("Maximum Short value: " + Short.MAX_VALUE); // 32,767

        System.out.println();
        System.out.println("---------------");
        System.out.println("---------------");
        System.out.println();

        System.out.println("Integer Range:");
        System.out.println("---------------");
        int c = 2000;
        System.out.println("Example integer value: " + c);
        System.out.println("Minimum integer value: " + Integer.MIN_VALUE); // -2^31 (32 bits)
        System.out.println("Maximum integer value: " + Integer.MAX_VALUE); // 2^31 - 1

        System.out.println();
        System.out.println("---------------");
        System.out.println("---------------");
        System.out.println();

        System.out.println("Long Range:");
        System.out.println("---------------");
        long d = 200000;
        System.out.println("Example long value: " + d);
        System.out.println("Minimum long value: " + Long.MIN_VALUE); // -2^63 (64 bits)
        System.out.println("Maximum long value: " + Long.MAX_VALUE); // 2^63 - 1

        System.out.println();
        System.out.println("---------------");
        System.out.println("---------------");
        System.out.println();

        float e = 123.456789f; // ~7 significant digits
        System.out.println("Float Examples:");
        System.out.println("-------------");
        System.out.println("Original float value: " + e);
        System.out.println("Smallest positive float: " + Float.MIN_VALUE);
        System.out.println("Largest positive float: " + Float.MAX_VALUE);
        System.out.println("Largest negative float: -" + Float.MAX_VALUE);
        System.out.println("Largest positive float: -" + Float.MIN_VALUE);

        System.out.println();
        System.out.println("---------------");
        System.out.println("---------------");
        System.out.println();

        double f = 123.456789012345678; // ~15 significant digits
        System.out.println("Double Examples:");
        System.out.println("-------------");
        System.out.println("Original double value: " + f);
        System.out.println("Smallest positive double: " + Double.MIN_VALUE);
        System.out.println("Largest positive double: " + Double.MAX_VALUE);
        System.out.println("Largest negative double: -" + Double.MAX_VALUE);
        System.out.println("Largest positive double: -" + Double.MIN_VALUE);

        System.out.println();
        System.out.println("---------------");
        System.out.println("---------------");
        System.out.println();

        System.out.println("Boolean: ");
        boolean isAdult = false;
        System.out.println("Is Adult : " + isAdult);
        isAdult = true;
        System.out.println("Is Adult : " + isAdult);

        System.out.println();
        System.out.println("---------------");
        System.out.println("---------------");
        System.out.println();

        System.out.println("Character: ");
        char g = 'p';
        System.out.println("Original Character: " + g);
        System.out.println("Integer assigned to that character: " + (int)g); // Prints 112
        System.out.println("Heart in interger to character: " + (char)10084);

        System.out.println();
        System.out.println("---------------");
        System.out.println("---------------");
        System.out.println();

        System.out.println("Widening Conversion");
        byte byteValue = 10; // 1 byte // cup
        short shortValue = byteValue; // 2 bytes // glass
        int intValue = shortValue; // 4 bytes // jug
        long longValue = intValue; // 8 bytes // bucket
        float floatValue = longValue; // 4 bytes
        double doubleValue = floatValue; // 8 bytes
        System.out.println("int: " + intValue);
        System.out.println("long: " + longValue);
        System.out.println("float: " + floatValue);
        System.out.println("double: " + doubleValue);

        System.out.println();
        System.out.println("---------------");
        System.out.println("---------------");
        System.out.println();

        System.out.println("Narrowing Conversion");

        double wideDouble = 12345.6789; // 8 bytes // bucket
        float narrowFloat = (float) wideDouble; // 4 bytes // jug
        long narrowLong = (long) narrowFloat; // 8 bytes // bucket (integer type)
        int narrowInt = (int) narrowLong; // 4 bytes // jug
        short narrowShort = (short) narrowInt; // 2 bytes // glass
        byte narrowByte = (byte) narrowShort; // 1 byte // cup

        System.out.println("double: " + wideDouble);
        System.out.println("float: " + narrowFloat);
        System.out.println("long: " + narrowLong);
        System.out.println("int: " + narrowInt);
        System.out.println("short: " + narrowShort);
        System.out.println("byte: " + narrowByte);

        System.out.println();
        System.out.println("---------------");
        System.out.println("---------------");
        System.out.println();

        // String literals — these go into the "String Pool"
        String str1 = "Hello";  // Stored in String Pool
        String str2 = "Hello";  // Points to the same "Hello" in the pool

        // This creates a new String object in the heap (not from the pool)
        String str3 = new String("Hello");

        // '==' compares references (memory addresses)
        System.out.println(str1 == str2); // true
        // str1 and str2 both point to the same literal in the string pool

        System.out.println(str1 == str3); // false
        // str1 is from pool, str3 is a new object in heap — different references

        // .equals() compares actual content (characters inside the string)
        System.out.println(str1.equals(str3)); // true
        // Both have the same characters: "Hello", so it returns true
    }
}
