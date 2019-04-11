package sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by kobe on 2018/9/10.
 */
public class SortClass {
    public static void main(String[] args){
        //System.out.println("10".compareTo("2"));
        List<String> list = new ArrayList<String>();
        //list.subList()
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("6");
        list.add("7");
        list.add("8");
        list.add("9");
        //list.add("10");
        System.out.println(list);
        Collections.sort(list, new Comparator<String>() {
            public int compare(String o1, String o2) {
                int i = o1.compareTo(o2);
                if (i>0){
                    return 1;
                } else if (i<0){
                    return -1;
                }
                return 0;
            }
        });
        System.out.println(list);
    }
}
