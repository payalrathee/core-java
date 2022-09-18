import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriting {
    public static void main(String[] args) throws IOException {
        PrintWriter writer =new PrintWriter("payal.txt");
        writer.println("abc");
        writer.print('c');
        writer.println(true);
        writer.flush();
        writer.close();
    }
}
