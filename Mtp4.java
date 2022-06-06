		//priority 2
		
class A extends Thread{
	public void run() {
		for (int i =1;;i++)		//i<=10 removed for infinite execution
		{
			
		System.out.println("A..."+i);
		}
	}
}

class B extends Thread {
	public void run()  {
		for (int i=1; ;i++) 	//i<=10 removed for infinite execution
			{
			System.out.println("B..."+i);
		}
	}
}


class Mtp4{
	public static void main (String args[])  {
		
		A ao= new A();
		B bo=new B();
		
		ao.setPriority(2);
		bo.setPriority(8);
		
		ao.start();
		bo.start();
		
		try{
			Thread.sleep(2000);		   //given time of Execution1
		}
		catch(Exception e)
		{
			
		}
		ao.stop();				//after 2sec it will stop
		bo.stop();
		
	}
}