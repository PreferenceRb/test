package bigdecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Created by kobe on 2018/8/30.
 */
public class BigDecimalClass {
    public static void main(String[] args){
        BigDecimal bigDecimal = new BigDecimal("2.43534543543654677");
        Double double1 = new Double(2.43534543543654677);
        BigDecimal doubleBigdecimal = new BigDecimal(Double.toString(double1));
        BigDecimal day = new BigDecimal(13);
        BigDecimal total = new BigDecimal(31);
        BigDecimal result = day.divide(total,18, RoundingMode.HALF_EVEN);
        System.out.println(day.divide(total,18, RoundingMode.HALF_EVEN));
        System.out.println(bigDecimal);
        System.out.println(doubleBigdecimal);
        Double test = new Double(0.01);
        System.out.println(test);
    }
}
