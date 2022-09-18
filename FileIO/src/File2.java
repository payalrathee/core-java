import java.io.File;

public class File2 {
    public static void main(String[] args) {
        File f=new File("D:\\COURSES\\7Web Dev\\practice\\CSS");
        String[] items=f.list();

        for(String s:items)
        {
            File f1=new File(f,s);
            if(f1.isFile())
            System.out.println(s);
        }
    }
}
