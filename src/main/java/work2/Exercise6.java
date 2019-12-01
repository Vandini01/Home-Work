package work2;

public class Exercise6 {
    public static void main(String[] args) {
        Method method = new Method();
        int width = method.inputWidth();
        int height = method.inputHeight();
        method.recurs6(width,height,0,0);

    }
}
