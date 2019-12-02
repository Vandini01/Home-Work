package work2;

import java.util.Scanner;

class Method {
    private Scanner scanner = new Scanner(System.in);

    //////////////////////////////111111111111111///////////////////////
    int input() {
        System.out.print("Будьласка введіть число:");
        test();
        return scanner.nextInt();
    }

    private void test() {
        while (!scanner.hasNextInt()) {
            System.out.print("Ви ввели неправильне значення, будьласка введіть число:");
            scanner.nextLine();
        }
    }

    void print(int number) {
        for (int i = 1; i <= number; ++i) {
            System.out.println(i);
        }
    }

    /////////////////////////////////////////22222222//////////////////////////////////////////////////
    int inputWidth() {
        System.out.print("Будьласка введіть ширину:");
        test();
        return scanner.nextInt();
    }

    int inputHeight() {
        System.out.print("Будьласка введіть висоту:");
        test();
        return scanner.nextInt();
    }

    void drawRectangle(int width, int height) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("+");
            }
            System.out.println();
        }
    }

    //////////////////////////////////33333333333////////////////////////
    void drawRectangle(int width) {
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("+");
            }
            System.out.println();
        }
    }
    //////////////////////////////444444444444444/////////////////////////

    void test2() {
        System.out.print("Введіть 2 числа: ");
        while ((!scanner.hasNextDouble()) && (!scanner.hasNextInt())) {
            System.out.print("Ви ввели неправильне значення, будьласка введіть числа:");
            scanner.nextLine();
        }
        ifn();
    }

    private void ifn() {
        if (scanner.hasNextInt()) {
            inputInt();
        } else {
            inputDouble();
        }
    }

    private void inputDouble() {
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        getMax(x, y);
    }

    private void inputInt() {
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        getMax(x, y);
    }

    private void getMax(int a, int b) {
        System.out.println("Найбільше число = " + Math.max(a, b));
    }

    private void getMax(double a, double b) {
        System.out.println("Найбільше число = " + Math.max(a, b));
    }

    //////////////////////////////////55555555555555//////////////////////////////
    void recurs5(int number, int x) {
        if (x <= number) {
            System.out.println(x);
            x++;
            recurs5(number,x);
        }
    }

    ///////////////////////////////66666666666666666//////////////////////////
    void recurs6(int width, int height, int x, int y) {
        if (y < height) {
            if (x < width) {
                System.out.print("+");
                x++;
                if (x == width) {
                    System.out.println();
                    x = 0;
                    y++;
                }
                recurs6(width, height, x, y);
            }
        }
    }
    ////////////////////////////////////77777777777777777777777/////////////////////////////
     void  choice(){
         System.out.print("Введіть номер задачі:");
         test();
         int number = scanner.nextInt();
         exercise(number);
    }

    private void exercise(int number){
        if (number==1){
            exercise1();
        }
        else {
                if (number==2){
                    exercise2();
                }
                else {
                    if (number==3){
                        exercise3();
                    }
                    else {
                        if (number==4){
                            exercise4();
                        }
                        else {
                            if (number==5){
                                exercise5();
                            }
                            else {
                                if (number==6){
                                    exercise6();
                                }
                                else {
                                    System.out.println("Такої задачі не існує");
                                    choice();
    } } } } } } }
    private void exercise1(){
            Method method = new Method();
            int number = method.input();
            method.print(number);
            continued();
    }
    private void exercise2(){

            int width = inputWidth();
            int height =inputHeight();
            drawRectangle(width,height);
        continued();

    }
    private void exercise3(){
            int width = inputWidth();
            drawRectangle(width);
        continued();
    }
    private void exercise4(){
            test2();
        continued();
    }
    private void exercise5(){
            int number = input();
           recurs5(number,1);
        continued();
    }
    private void exercise6(){
        int width = inputWidth();
        int height = inputHeight();
        recurs6(width,height,0,0);
        continued();

    }
    private void continued(){
        System.out.print("Продовити? true/false- ");
        test3();
        boolean question = scanner.nextBoolean();
        if (question){
            choice();
        }
        else {
            System.out.println("Допобачення");
        }
    }

    private void test3() {
        scanner.nextLine();
        while (!scanner.hasNextBoolean()) {
            System.out.print("Ви ввели неправильне значення, будьласка введіть true/false-");
            scanner.nextLine();
        }
    }
}