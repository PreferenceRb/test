package callable;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/**
 * Created by kobe on 2018/8/26.
 */
public class CallableDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(10);
        final CallableService callableService = new CallableService();
        List<Future<Integer>> futures = new ArrayList<Future<Integer>>();
        try{
            for (int i =0;i<10;i++){
                Future<Integer> future = service.submit(new CallableTask(i));
                futures.add(future);
            }
        } catch (Exception e){
            e.printStackTrace();
        }

        System.out.println("获取futureList结束");

        try{
            for (Future<Integer> future:futures) {

                System.out.println(future.get());
            }

        }catch (Exception e){
            System.out.println("捕获异常:"+e.getMessage());
        }
        System.out.println("test");

    }


}
