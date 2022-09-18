package arraylists;

import java.util.ArrayList;

public class ArrayListOperations {
    public static void main(String[] args) {
        ArrayList<String> a=new ArrayList<>();
        a.add("abc");
        a.add("cde");
        System.out.println(a);

        ArrayList<String> a1=new ArrayList<>(2);
        a1.add("a");
        a1.add("a");
        a1.add("a");
        System.out.println(a1.size());

        ArrayList<String> a2=new ArrayList<>(a1);
        a2.add("b");
        System.out.println(a2);

        for(String s:a2)
            System.out.print(s+" ");
        System.out.println();

        ArrayList aa=new ArrayList();
        aa.add(10);
        aa.add("xyz");
        aa.add(null);
        aa.add(1,'c');
        System.out.println(aa);
        ArrayList aaa=new ArrayList();
        aaa.addAll(aa);
        aaa.add(10.5);
        ArrayList aaaa=new ArrayList(aa);
        aaaa.add(1);
        aaaa.addAll(2,aaa);
        aaaa.add(8);

        System.out.println(aaaa);

        aaaa.set(1,2);

        System.out.println(aaaa);
        System.out.println(aaaa.get(1));

        for(int i=0;i<aa.size();i++)
            System.out.print(aa.get(i)+" ");
        System.out.println();

        aaaa.remove(2);
        System.out.println(aaaa);
        aaaa.remove(0);
        System.out.println(aaaa);
        //aaaa.removeAll(aa);
        aaaa.retainAll(aa);
        System.out.println(aaaa);
        System.out.println(aaaa.contains(null));
        System.out.println(aaaa.contains("djhgs"));
        System.out.println(aaaa.containsAll(aa));
        aaaa.add(10);
        System.out.println(aaaa.containsAll(aa));
        aaaa.clear();
        System.out.println(aaaa.isEmpty());
    }

}
