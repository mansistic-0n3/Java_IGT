class A extends Thread{
	public synchronized void run(){
		try{
			for(int i=0; i<=10;i++){
				if(Thread.currentThread().getName().equals("Ram")){
				System.out.println(Thread.currentThread().getName()+" : "+i);
				}
				if(Thread.currentThread().getName().equals("Sita")){
				System.out.println("\t\t"+Thread.currentThread().getName()+" : "+i);
				}
				Thread.sleep(1000);
			}
		}catch(Exception e){

		}
	}
}

class AbtThread{

	public static void main(String args[]){
		A a = new A();
		Thread t1 = new Thread(a);
		Thread t2 = new Thread(a);
		t1.start();
		t2.start();
		//System.out.println(t1);
		//System.out.println(t2);
		t1.setName("Ram");
		t2.setName("Sita");
		//t1.setPriority(8);
		//t2.setPriority(3);
	}
}