package Work1;

import java.util.Scanner;

public class Matematica {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("\tВітаю\nВведіть 2 числа:\nПерше число: ");
        Float x = scanner.nextFloat();
        System.out.println("Друге число:");
        Float y = scanner.nextFloat();

        System.out.println(x+y);
        System.out.println(x*y);
        System.out.println(x/y);
        System.out.println(x-y);
        System.out.println(x%y);
        System.out.println(x.equals(y));
        System.out.println(x<y);
        System.out.println(x>y);

    }
}
