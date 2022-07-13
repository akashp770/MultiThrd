		//Sychronitation
class A extends Thread{
	public void run() {
		
			System.out.print("I m Learning ");
			try{
				Thread.sleep(5000);
			}
			catch (Exception e) {
				
			}
			System.out.println("MultiThreading.... ");
	}
}


class Mtp5{
	public static void main (String args[])  {
		
		A ao= new A();
		
		A ao2= new A();
		A ao3= new A();
		
		
		ao.start();
		ao2.start();
		ao3.start();
						
		//System.out.println("A is Alive:" + ao.isAlive());			to chk thread is Alive or not
		
	}
}
