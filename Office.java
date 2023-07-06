class A extends Thread{
    public void run(){
        try{
            for(int i=0; i<=50;i++){
                if(Thread.currentThread().getName().equals("CEO")){
                System.out.println(Thread.currentThread().getName()+" : "+i);
                }
                if(Thread.currentThread().getName().equals("Manager")){
                System.out.println("\t"+Thread.currentThread().getName()+" : "+i);
                }
                if(Thread.currentThread().getName().equals("Employee")){
                System.out.println("\t\t\t"+Thread.currentThread().getName()+" : "+i);
                }
                Thread.sleep(800);
            }
        }catch(Exception e){

        }
    }
}

 

class Office{

     public static void main(String args[])
    {
        A a = new A();
        Thread t1= new Thread(a);
        Thread t2= new Thread(a);
        Thread t3= new Thread(a);
        t1.start();
        t2.start();
        t3.start();
        t1.setName("CEO");
        t2.setName("Manager");
        t3.setName("Employee");
        for(int k=0;k<=50;k++)
        {
            try
            {
                System.out.println("\t\t\t\t\tIntern   " +k);
                Thread.sleep(800);    
                if(k==10)
                {    
                    t1.suspend();
                }
                if(k==15)
                {    
                    t2.suspend();
                }
                if(k==20)
                {
                    t1.resume();
                }
                if(k==25)
                {
                    t1.stop(); 
                }
                if(k==30)
                {
                    t2.resume();
                }
            }
            catch(Exception e){}    
        }
    }
}