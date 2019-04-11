package reflect;

import java.lang.reflect.Field;

/**
 * Created by kobe on 2018/9/2.
 */
public class ReflectClass {
    public static void main(String[] args){
        Person person = new Person();
        reflect(person);
//          Integer a = 1;
//        Integer b = 2;
//
//        System.out.printf("a=%s,b=%s\n",a,b);
//        swap(a,b);
//        System.out.printf("a=%s,b=%s\n",a,b);
    }
    public  static void swap(Integer a,Integer b){
        int temp = a.intValue();
        try {
            Field value = Integer.class.getDeclaredField("value");
            value.setAccessible(true);
            value.set(a,b);
            value.setInt(b,temp);
            Integer.valueOf(1);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    public static <T> void reflect(T trace){
        Class clazz = trace.getClass();
        Field[] fields = clazz.getDeclaredFields();
        System.out.println(trace.getClass() == Person.class);
        System.out.println(trace instanceof Person);
    }
}
