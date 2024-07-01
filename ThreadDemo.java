//threads as a subprocess with lightweight with the smallest unit of processes and also has separate paths of execution.
// threads can be done by extending Threads or implementing Runnable class
//thread life cycle New ,Runnable(waiting for Execution) ,Running(under execution),Waiting/Blocked(waiting for a particular event to occur or blocked),Dead/terminated (thread has completed execution or deleted )
// to set priority for a thread to execute we use setPriority() min_priority =1 ,normal =5,max=10;SetPriority is to make request but there is no normal rule to execute in that order
// threadName.join() method helps to execute or helps to complete the job fast its should throw Intruppted Exception;
// Thread.sleep(1000); sleeps for 1 sec;
//Thread.yeild() help to heal but its completely schedulers thing
//Runnable is more flexialbe cause we can implement other class while using Runnable interface.
class demo extends Thread {
    public void run(){
        int i;
        int n=10;
        System.out.println("Run thread1 ");
        for(i=1;i<n;i++)
        {
            System.out.println(i);
        }
        System.out.println("Run thread2 done");

    }
}
class task2 implements Runnable{
    public void run()
    {
        System.out.println("Runnable task2 ");
        for(int i=30;i<50;i++)
        {
            System.out.println(i);
        }
        System.out.println("2 done");
    }

}
public class ThreadDemo{
    public static void main(String[]args) throws InterruptedException {
        demo t1=new demo();
        t1.start();
        //t1.join();
        int i=10;
       int n=30;
       task2 t2= new task2();//Declaration of thread for Runnable interface;
       Thread thread =new Thread(t2);
       thread.start();
       thread.setPriority(10);//priority for task
       System.out.println("task3");
        for(i=10;i<n;i++)
        {
            System.out.println(i);
        }
        System.out.println("3 done");
    }

}
