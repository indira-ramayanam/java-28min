import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class CustomExecutorService {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newSingleThreadExecutor();//execute only one single thread at a time
        //ExecutorService executor = Executors.newFixedThreadPool(3);

        executor.execute(new Thread(new task2()));
        //executor.execute(new t1());

        executor.shutdown();
    }
}