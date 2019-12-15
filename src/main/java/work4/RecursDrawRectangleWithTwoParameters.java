package work4;

public class RecursDrawRectangleWithTwoParameters {

        public static void main(String[] args) {
            Methods method = new Methods();
            int width = method.inputWidth();
            int height = method.inputHeight();
            method.RecursDrawRectangleWithTwoParameters(width,height,0,0);
    }
}
