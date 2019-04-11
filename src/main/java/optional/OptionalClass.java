package optional;


import java.util.Optional;

/**
 * Created by kobe on 2018/10/11.
 */
public class OptionalClass {
    public static void main(String[] args){
        Integer value1 = null;
        Integer value2 = new Integer(10);
        Optional<Integer> a = Optional.ofNullable(value1);
        Optional<Integer> b = Optional.of(value1);
        System.out.println();
    }
}
