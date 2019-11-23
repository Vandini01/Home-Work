package Work1;
import java.util.Date;
import java.util.Scanner;

public class Passport {
    public static void main(String[] args) {

        Date date = new Date();
        Scanner  scanner = new Scanner(System.in);
        System.out.println("\t\tВітаю в паспортному столі\nВведіть ваші данні:\nІм'я - ");
        String firstname = scanner.nextLine();
        System.out.println("Фамілія -");
        String lastname = scanner.nextLine();
        System.out.println("Вік -");
        String age = scanner.nextLine();
        System.out.println("Місто народження -");
        String citybirth = scanner.nextLine();
        System.out.println("Місто проживання -");
        String Currentcity = scanner.nextLine();
        System.out.println("Стать -");
        String sex = scanner.nextLine();

        System.out.println("\t\tДякую\n Отримайте ваш документ\n\n_____Паспорт України_____\nОсоба: "+firstname+" "+lastname+"\nСтать: "+sex+"  Вік: "+age+"\nМісцезнаходження:\nМісто народження: "+citybirth+"  Поточне: "+Currentcity+"\n\n\tВиданий: ООО-Фальш паспорт \n\t"+date.toString());
    } }
