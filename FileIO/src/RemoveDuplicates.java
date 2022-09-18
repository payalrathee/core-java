import java.io.*;

public class RemoveDuplicates {
    public static void main(String[] args) throws IOException {
        FileReader reader1=new FileReader("N1.txt");
        BufferedReader bfreader1=new BufferedReader(reader1);

        File f=new File("final.txt");
        PrintWriter writer=new PrintWriter(f);

        String line1=bfreader1.readLine();
        while(line1!=null)
        {
            boolean exists=false;
            FileReader reader2=new FileReader("final.txt");
            BufferedReader bfReader2=new BufferedReader(reader2);
            String line2=bfReader2.readLine();
            while(line2!=null)
            {
                if(line1.equals(line2))
                {
                    exists=true;
                    break;
                }
                line2=bfReader2.readLine();
            }

            if(!exists)
            {
                writer.println(line1);
                writer.flush();
            }
            line1=bfreader1.readLine();
            bfReader2.close();
        }
        bfreader1.close();
        writer.flush();
        writer.close();
    }
}
