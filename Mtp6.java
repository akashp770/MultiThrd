		//Sychronization				it will work as a Singlethreading
		
class Table {
	public synchronized void printTable( int n){       //It will lock upto A is not complete  its execution then B willl start 
		for (int i=1;i<=10;i++){
		try{
			Thread.sleep(1000);
		}
		catch (Exception e) {
			
		}
		System.out.println(n*i);
		
		}
	}
}
		
		

class A extends Thread{
	Table t;
	A(Table t){
		this.t=t;
	}	       
	
	public void run() {
		
		t.printTable(5);
	}
}

class B extends Thread{
	Table t;
	B(Table t){
		this.t=t;
	}
	
	public void run() {
		
		t.printTable(6);
	}
}


class Mtp6{
	public static void main (String args[])  {
		
		Table to=new Table();
		 A ao =new A(to);
		B bo =new B(to);
		
		ao.start();
		bo.start();
				
		
	}
}