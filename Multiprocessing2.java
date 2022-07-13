			//Multiprocessing
class A {
	public void show()  {
		for (int i =1;i<=10;i++){
			try{
			if(i==5){
				wait();
			}
			}
			catch (Exception e){
			}
		System.out.println("A..."+i);
		}
	}
}

class B  {
	public void show()  {
		for (int i=1;i<=10; i++) {
			System.out.println("B..."+i);
		}
	}
}

class C {
	public void show() {
		for (int i=1;i<=10; i++) {
			System.out.println("C..."+i);
		}
	}
}


class Mt2{
	public static void main (String args[]) {
		
		A ao= new A();
		B bo=new B();
		C co=new C();
		
		ao.show();
		bo.show();
		co.show();
	}
}
