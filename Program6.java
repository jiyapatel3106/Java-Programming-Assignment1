// Program 6:
// Implement Cipher system using Abstract class and
// method overriding



import java.util.Scanner;

abstract class Cipher {
    public abstract String encrypt(String text);

    public abstract String decrypt(String text);

    public void showResult(String plainText) {
        String encrypted = encrypt(plainText);
        String decrypted = decrypt(encrypted);
        System.out.println("Plain Text: " + plainText);
        System.out.println("Encrypted: " + encrypted);
        System.out.println("Decrypted: " + decrypted);
    }
}

class CaesarCipher extends Cipher {
    private int shift;

    public CaesarCipher(int shift) {
        this.shift = shift;
    }

    @Override
    public String encrypt(String text) {
        StringBuilder result = new StringBuilder();
        for (char c : text.toCharArray()) {
            if (Character.isLetter(c)) {
                char base = Character.isUpperCase(c) ? 'A' : 'a';
                result.append((char) ((c - base + shift) % 26 + base));
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }

    @Override
    public String decrypt(String text) {
        StringBuilder result = new StringBuilder();
        for (char c : text.toCharArray()) {
            if (Character.isLetter(c)) {
                char base = Character.isUpperCase(c) ? 'A' : 'a';
                result.append((char) ((c - base - shift + 26) % 26 + base));
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }
}

class ReverseCipher extends Cipher {
    @Override
    public String encrypt(String text) {
        return new StringBuilder(text).reverse().toString();
    }

    @Override
    public String decrypt(String text) {
        return new StringBuilder(text).reverse().toString();
    }
}

public class Program6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text to encrypt:");
        String plainText = sc.nextLine();
        System.out.println("Choose Cipher Type: 1 for Caesar, 2 for Reverse");
        int choice = sc.nextInt();
        Cipher cipher;
        if (choice == 1) {
            System.out.println("Enter shift value for Caesar Cipher:");
            int shift = sc.nextInt();
            cipher = new CaesarCipher(shift);
        } else if (choice == 2) {
            cipher = new ReverseCipher();
        } else {
            System.out.println("Invalid choice!");
            sc.close();
            return;
        }
        System.out.println("\n--- Cipher Result ---");
        cipher.showResult(plainText);
        sc.close();
    }
}