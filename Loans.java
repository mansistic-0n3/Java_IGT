//Method OVERRIDING
class Bank{
	public int loan(){
		return 8;
	}
}
class SBI extends Bank{

}
class Axis extends Bank{
	public int loan(){
		return 10;
	}
}

class Loans{
	public static void main(String args[]){
		SBI s= new SBI();
		System.out.println("Interest on loan from SBI =>"+s.loan()+"%");
		Axis a= new Axis();
		System.out.println("Interest on loan from Axis Bank =>"+a.loan()+"%");
	}
}