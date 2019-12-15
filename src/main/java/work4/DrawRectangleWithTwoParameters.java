package work4;

public class DrawRectangleWithTwoParameters {
    public static void main(String[] args) {
        Methods method = new Methods();
        int width = method.inputWidth();
        int height = method.inputHeight();
        method.drawRectangle(width,height);

    }
}
