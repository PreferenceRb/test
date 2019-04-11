package callable;

import java.util.concurrent.Callable;

/**
 * Created by kobe on 2018/8/26.
 */
public class CallableTask implements Callable<Integer> {
    private Integer num;

    public CallableTask(Integer num) {
        this.num = num;
    }

    public Integer call() throws Exception {
        if (num%2==0){
            throw new Exception(String.valueOf(num));
        }
        return test(num);
    }

    public Integer test(Integer i) throws InterruptedException {
        System.out.println("start-线程"+i+":"+System.currentTimeMillis());
        if (i!=15){
            Thread.sleep(5000);
        }
        System.out.println("end-线程"+i+":"+System.currentTimeMillis());
        return i;

    }
}
