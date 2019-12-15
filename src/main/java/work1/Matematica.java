package work1;

import java.util.Scanner;

public class Matematica {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("\tВітаю\nВведіть 2 числа:\nПерше число: ");
        Float x = scanner.nextFloat();
        System.out.println("Друге число:");
        Float y = scanner.nextFloat();

        System.out.println("Сума = "+(x+y));
        System.out.println("Множення = "+(x*y));
        System.out.println("Ділення = "+(x/y));
        System.out.println("Різниця = "+(x-y));
        System.out.println("Ділення за модулем = "+(x%y));
        System.out.println("Рівність = "+(x.equals(y)));
        System.out.println("Перше менше другого = "+(x<y));
        System.out.println("Перше більше другого = "+(x>y));

    }
}
