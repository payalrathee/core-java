import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Reading {
    public static void main(String[]args) throws IOException {
        File f=new File("payal.txt");
        FileReader reader =new FileReader(f);
        char[] c=new char[2];
        reader.read(c);
        for(int i=0;i<c.length;i++)
            System.out.print(c[i]);
        reader.close();

    }
}
