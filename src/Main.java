import javax.imageio.IIOException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;


public class Main {
    public static void main(String[] args) throws IOException {
        // создаем файл в С:\\_______
        // new-item - path .\file.txt -value 'Hello world!'
        File file = new File("C:\\Users\\user\\file.txt");
        FileWriter writer = new FileWriter(file);
        writer.write("Mighty Java programmer!");
        writer.write("Have a good day!");
        writer.write("Hello world!");
        writer.close();
    }
}