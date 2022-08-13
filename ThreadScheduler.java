class ThreadA extends Thread
{ 
	int min,max,i;
	ThreadA(int m1,int m2)
	{
		min=m1;max=m2;
	}
	
	public void run()
	{
		i=min;
		System.out.println("ThreadA started"); 
		while(i<max)
		{
			System.out.println("Value of i in Thread A:"+i); 
			i++;                 
		}                       
		System.out.println("ThreadA finished");         
	} 
} 

class ThreadB extends Thread
{
	int min,max,i;
	ThreadB(int m1,int m2)
	{
		min=m1;max=m2;
	}
		
	public void run()
	{
		i=min;
		System.out.println("ThreadB started"); 
		while(i<max)
		{
			System.out.println("Value of i in Thread B:"+i);    
			i++;
		}
		System.out.println("ThreadB finished");
	} 
}  
class ThreadC extends Thread
{
	int min,max,i;
	ThreadC(int m1,int m2)
	{
		min=m1;max=m2;
	}
		
	public void run()
	{
		i=min; 
		System.out.println("ThreadC started");
		while(i<max)
		{
			System.out.println("Value of i in Thread C:"+i);
			i++;
		} 
		System.out.println("ThreadC finished");
	}
}

public class ThreadScheduler 
{ 
	public static void main(String[] args) 
	{             
		System.out.println("Main Thread started");              
		ThreadA a=new ThreadA(2,4);
		ThreadB b=new ThreadB(1,5);
		ThreadC c=new ThreadC(3,7); 
		//ThreadA a1=new ThreadA(2,5);
		Thread th=Thread.currentThread();
		System.out.println(th.getName());
		a.setPriority(Thread.MIN_PRIORITY);
		b.setPriority(Thread.NORM_PRIORITY); 
		c.setPriority(Thread.MAX_PRIORITY);
		//a1.setPriority(Thread.NORM_PRIORITY); 

		a.start();
		b.start();
		c.start();
		//a1.start();
	}
} 