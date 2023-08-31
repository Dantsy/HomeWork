package Basic.HomeWork5;
import java.io.IOException;
public class Main {
    public static void main(String[] args) throws IOException {
        ResourceHandler handler = new ResourceHandler();

        System.out.println("=== Обработать ошибку ===");
        handler.handleError();

        System.out.println("\n=== Исключение повторного запуска ===");
        try {
            handler.rethrowException();
        } catch (IOException e) {
            System.err.println("Обнаружено выброшенное исключение: " + e.getMessage());
        }

        System.out.println("\n=== Обработайте исключение другим способом ===");
        handler.handleExceptionInAnotherWay();

        System.out.println("\n=== Используйте ресурс с помощью Try-With-Resources ===");
        handler.useResourceWithTryWithResource();
    }
}
