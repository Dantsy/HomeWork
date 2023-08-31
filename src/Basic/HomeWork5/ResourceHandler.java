package Basic.HomeWork5;
import java.io.IOException;

public class ResourceHandler {
    // Обработка ошибки
    public void handleError() {
        Resource resource = new Resource();

        try {
            resource.process();
        } catch (IOException e) {
            System.err.println("Произошла ошибка: " + e.getMessage());
        }
    }
    // Re-throw исключения
    public void rethrowException() throws IOException {
        Resource resource = new Resource();

        try {
            resource.process();
        } catch (IOException e) {
            throw e;
        }
    }
    // Использование другого способа обработки исключения
    public void handleExceptionInAnotherWay() {
        Resource resource = new Resource();

        try {
            resource.process();
        } catch (IOException e) {
            // Другой способ обработки исключения (например, логирование)
            System.out.println("Произошла ошибка: " + e.getMessage());
        }
    }
    // Использование try-with-resources
    public void useResourceWithTryWithResource() {
        try (Resource resource = new Resource()) {
            resource.process();
        } catch (IOException e) {
            System.err.println("Произошла ошибка: " + e.getMessage());
        }
    }
}
