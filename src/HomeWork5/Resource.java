package HomeWork5;
import java.io.Closeable;
import java.io.IOException;

class Resource implements Closeable {
    @Override
    public void close() throws IOException {
        // Закрытие ресурса
        System.out.println("Ресурс закрыт");
    }

    // Метод, выбрасывающий исключение
    public void process() throws IOException {
        throw new IOException("При обработке ресурса");
    }

}
