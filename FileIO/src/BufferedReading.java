import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReading {
    public static void main(String[] args) throws IOException {
        FileReader reader=new FileReader("payal.txt");
        BufferedReader bfReader=new BufferedReader(reader);
        String line=bfReader.readLine();
        while(line!=null)
        {
            System.out.println(line);
            line= bfReader.readLine();
        }
        bfReader.close();
    }
}
