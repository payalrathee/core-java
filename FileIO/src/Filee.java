import java.io.File;
import java.io.IOException;

public class Filee {
    public static void main(String[] args) throws IOException {
//        File f=new File("abc.txt");
//        System.out.println(f.createNewFile());
//        System.out.println(f.exists());
//        System.out.println(f.delete());
//        System.out.println(f.isFile());
//        System.out.println(f.isDirectory());
//        System.out.println(f.length());

//        File f=new File("D:\\COURSES\\1C\\bh.txt");
//        f.createNewFile();

//        File f=new File("D:\\COURSES\\1C",".\\p\\t\\pa.txt");
//        f.createNewFile();

        File f=new File("payal");
        f.mkdir();

        File f1=new File(f,"rathee.txt");
        f1.createNewFile();

    }
}
