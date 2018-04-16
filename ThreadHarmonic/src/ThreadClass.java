import java.util.concurrent.locks.ReentrantLock;

public class ThreadClass {
   private final ReentrantLock lock = new ReentrantLock();
   private double sum=0;
   private final int count, thcount;
   private int running;
   private ThreadDone done;
   public ThreadClass(int count,int thcount, ThreadDone done)
   {
      this.done=done;
      this.count=count;
      this.thcount=thcount;
      running=thcount;
      for(int i=0;i<thcount;++i)
      {
         int start=i+1;
         new Thread(() -> ThreadRun(start)).start();
      }
   }
   void ThreadRun(int start)
   {
      double part=0;
      for(int i=start;i<count;i+=thcount)
      {
         lock.lock();
         sum+=1.0/i;
         lock.unlock();
      }
      synchronized(this)
      {
         if(--running==0) done.done(sum);
      }
   }
}
