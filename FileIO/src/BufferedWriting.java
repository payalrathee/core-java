import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriting {
    public static void main(String[] args) throws IOException {
        FileWriter writer=new FileWriter("payal.txt",true);
        BufferedWriter bfWriter=new BufferedWriter(writer);
        bfWriter.write("abc");
        bfWriter.newLine();
        bfWriter.write("def");
        bfWriter.flush();
        bfWriter.close();

    }
}
