package work4;

public class DrawRectangleWithOneParameters {
    public static void main(String[] args) {
        Methods method = new Methods();
        int width = method.inputWidth();
        method.drawRectangle(width);
    }
}
