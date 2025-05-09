package exceptionDemo;
import java.lang.Throwable;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        FileReader.readFile("./src/main/java/resources/hello.txt");
    }
}
