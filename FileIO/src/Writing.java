import java.io.FileWriter;
import java.io.IOException;

public class Writing {
    public static void main(String[] args) throws IOException {
        FileWriter writer=new FileWriter("./payal/rathee.txt",true);
        char[] c={' ','r','a','t','h','e','e'};
        writer.write(c);
        writer.flush();
        writer.close();
    }
}
