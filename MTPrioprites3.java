		//  Prioprites and Name of Threads 
		
		
class A extends Thread		//0 is Default Thread Name
{
	public void run() {
	
		
		Thread.currentThread().setName("A");   //Modified Name
		System.out.println("A class: "+ Thread.currentThread().getName());
	
	}
}

class B extends Thread		//1 is Default Thread Name
 {
	public void run()  {
		
		Thread.currentThread().setName("B");	//Modified Name
		System.out.println("B class:"+ Thread.currentThread().getName());
	}
}

class C extends Thread 		//2 is Default Thread Name
{
	public void run() {
			
			Thread.currentThread().setName("C");	//Modified Name
			System.out.println("C class: "+ Thread.currentThread().getName());
		
	}
}


class Mtp3		//main is Default thread name
{
	public static void main (String args[])  {
		  
		  System.out.println("Default Priority = "+Thread.currentThread().getPriority());   //5
		  Thread.currentThread().setPriority(7);		
		  System.out.println("Modified Priority = "+Thread.currentThread().getPriority());  //7	
		  
		System.out.println("Mtp3 class: "+ Thread.currentThread().getName());
		
		
		System.out.println("Parent Thread Starts.......");
		A ao= new A();
		B bo=new B();
		C co=new C();
		
		ao.start();
		bo.start();
		co.start();
		
		
		try{
		ao.join();			//Used to put this "Parent Thread Ends......."  at bottom 
		ao.join();
		ao.join();
		}
		catch (Exception e)
		{
		}
			System.out.println("Parent Thread Ends.......");
	}
}
