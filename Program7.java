// Program 7:
// Demonstrate Inner Classes (member, local, anonymous).

import java.util.Scanner;

public class Program7 {
    private String message = "Welcome to Inner Classes Demo!";

    // --- Member Inner Class ---
    class MemberInner {
        public void show() {
            System.out.println("Member Inner Class says: " + message);
        }
    }

    public void localInnerDemo() {
        class LocalInner {
            public void display() {
                System.out.println("Local Inner Class says: " + message);
            }
        }
        LocalInner local = new LocalInner();
        local.display();
    }

    public void anonymousInnerDemo() {
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("Anonymous Inner Class is running!");
            }
        };
        r.run();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Program7 outer = new Program7();
        System.out.println("Choose Inner Class type:");
        System.out.println("1. Member Inner Class");
        System.out.println("2. Local Inner Class");
        System.out.println("3. Anonymous Inner Class");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                Program7.MemberInner member = outer.new MemberInner();
                member.show();
                break;
            case 2:
                outer.localInnerDemo();
                break;
            case 3:
                outer.anonymousInnerDemo();
                break;
            default:
                System.out.println("Invalid choice!");
        }
        sc.close();
    }
}