// Program 3:
// Write a program demonstrating Wrapper classes and
// String vs StringBuffer

public class Program3 {
    // method to demonstrate Wrapper classes
    public static void wrapperDemo() {
        int num = 26; // this is primitive type
        // Boxing (primitive -> object)
        Integer wrappedNum = Integer.valueOf(num);
        // Unboxing (object -> primitive)
        int unwrappedNum = wrappedNum.intValue();
        System.out.println("Primitive int: " + num);
        System.out.println("Wrapped Integer (Boxing): " + wrappedNum);
        System.out.println("Unwrapped Integer (Unboxing): " + unwrappedNum);
        // Autoboxing and Auto-unboxing
        Integer autoBoxed = num; // autoboxing
        int autoUnboxed = autoBoxed; // auto-unboxing
        System.out.println("Autoboxed Integer: " + autoBoxed);
        System.out.println("Auto-unboxed int: " + autoUnboxed);
    }

    // method to demonstrate String vs StringBuffer
    public static void stringDemo() {
        String str = "Hello";
        str.concat(" World"); // Strings are immutable
        System.out.println("\nString after concat: " + str); // still "Hello"
        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" World"); // StringBuffer is mutable
        System.out.println("StringBuffer after append: " + sb); // "Hello World"
    }

    // Main method
    public static void main(String[] args) {
        System.out.println("--- Wrapper Classes Demo ---");
        wrapperDemo();
        System.out.println("\n--- String vs StringBuffer Demo ---");
        stringDemo();
    }
}