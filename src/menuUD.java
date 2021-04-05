import java.util.Scanner;

public class menuUD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("menu");
        System.out.println("1 . Draw the tringgle");
        System.out.println("2. Draw the square");
        System.out.println("3. Draw the rectangle");
        System.out.println("0. Exit");
        System.out.println("Enter your choice: ");
        int choice = sc.nextInt();
        switch (choice){
            case 1:
                System.out.println("draw the triagle");
                for (int i = 1; i <= 6  ; i++) {
                    for (int j = 6; j >= i ; j--) {
                        System.out.print("*");
                    }
                    System.out.println("");
                }
            case 2:
                System.out.println("draw the square");
                for (int i = 0; i < 6 ; i++) {
                    for (int j = 0; j <6 ; j++) {
                        System.out.print("*  ");
                    }
                    System.out.println("");
                }
            case 3:
                System.out.println("draw the rectangle");
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 6; j++) {
                        System.out.print("*  ");
                    }
                    System.out.println("");
                }
            case 0:
                System.exit(0);
            default:
                System.out.println("no choice!");
        }
    }
}
