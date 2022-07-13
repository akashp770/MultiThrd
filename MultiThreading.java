		//Multi Threading

class A extends Thread{
	public void run() {
		for (int i =1;i<=10;i++){
			
			if(i==5){
				stop();
			}
			
		System.out.println("A..."+i);
		}
	}
}

class B extends Thread {
	public void run()  {
		for (int i=1;i<=10; i++) {
			System.out.println("B..."+i);
		}
	}
}

class C extends Thread {
	public void run() {
		for (int i=1;i<=10; i++) {
			System.out.println("C..."+i);
		}
	}
}


class Mt{
	public static void main (String args[])  {
		
		A ao= new A();
		B bo=new B();
		C co=new C();
		
		ao.start();
		bo.start();
		co.start();
	}
}
