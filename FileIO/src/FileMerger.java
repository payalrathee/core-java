import java.io.*;

public class FileMerger {
    public static void main(String[] args) throws IOException {
        FileReader reader1=new FileReader("a.txt");
        BufferedReader bfReader1=new BufferedReader(reader1);
        FileReader reader2=new FileReader("b.txt");
        BufferedReader bfReader2=new BufferedReader(reader2);
        File f=new File("c.txt");
        f.createNewFile();
        PrintWriter writer=new PrintWriter(f);
        String line1=bfReader1.readLine();
        while(line1!=null)
        {
            writer.println(line1);
            line1=bfReader1.readLine();
        }
        String line2=bfReader2.readLine();
        while(line2!=null)
        {
            writer.println(line2);
            line2=bfReader2.readLine();
        }
        bfReader1.close();
        bfReader2.close();
        writer.flush();
        writer.close();
    }
}
