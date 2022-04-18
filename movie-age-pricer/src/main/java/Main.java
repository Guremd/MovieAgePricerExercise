import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NumberFormat numFor = NumberFormat.getCurrencyInstance();
        // write your code here
                int age;
                double price = 12.5;
//              boolean true and false variable
                boolean hasToy = false;
                boolean hasSticker = false;

        System.out.println("Please input your age");
                age = scanner.nextInt();
                scanner.nextLine();

        if (age <= 10) {
            price = 5;
        }
//          nested if
            if (age < 5) {
                hasToy = true;
            }

        else if (age > 65) {
            price = 8;
        }
            if (age > 80) {
                hasSticker = true;
            }



//                extraneous code for reference
//                if (age >65) {
//                    price = 8;
//                }
//
//                if (!(age <= 10) && !(age > 65)) {
//                    price =12.5;
//                }

        System.out.println("You owe: " + numFor.format(price));
        if (hasToy) {
            System.out.println("And here is a free toy.");
        }
        else if (hasSticker) {
            System.out.println("And here is a senior sticker.");
        }

    }
}
