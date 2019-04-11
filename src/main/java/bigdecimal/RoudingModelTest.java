package bigdecimal;

import java.math.BigDecimal;

/**
 * Created by kobe on 2018/9/2.
 */
public class RoudingModelTest {
    public static void main(String[] args){
        BigDecimal value1 = new BigDecimal(13);
        BigDecimal value2 = new BigDecimal(26);
        BigDecimal value3 = value1.divide(value2,18);
    }
}
