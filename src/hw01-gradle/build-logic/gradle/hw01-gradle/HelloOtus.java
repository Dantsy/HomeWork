import com.google.common.base.Joiner;

public class HelloOtus {
    public static void main(String[] args) {
        String joinedString = Joiner.on(", ")
                .skipNulls()
                .join("Hello", "Otus");
        System.out.println(joinedString);
    }
}