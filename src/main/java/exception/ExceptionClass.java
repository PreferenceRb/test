package exception;

/**
 * Created by kobe on 2018/9/10.
 */
public class ExceptionClass {
    public static void main(String[] args) throws Exception {
          try{
              throw new Exception();
          }
          catch (RuntimeException e){
              System.out.println("test");
          }
    }
}
