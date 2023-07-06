interface I{
	public static final int a = 10;
	public abstract void add();
	public abstract void sub();
}
interface J{
	public static final int b = 20;
	public abstract void mul();
	public abstract void div();
}
interface K extends I,J{

}
class Cal implements K{
	public void add(){
		System.out.println(I.a+J.b);
	}
	public void sub(){
		System.out.println(J.b-I.a);		
	}
	public void mul(){
		System.out.println(I.a*J.b);		
	}
	public void div(){
		System.out.println(I.a/J.b);	
	}

}
class Inter{
	public static void main(String args[]){
		Cal c = new Cal();
		System.out.println("---------------Calculator-------------");
		c.add();
		c.sub();
		c.mul();
		c.div();

		System.out.println("---------------K interface-------------");
		K k = c;
		k.add();
		k.sub();
		k.mul();
		k.div();

		System.out.println("---------------I interface-------------");
		I i = c;
		i.add();
		i.sub();
		//i.mul();
		//i.div();

		System.out.println("---------------J interface-------------");
		J j = c;
		//j.add();
		//j.sub();
		j.mul();
		j.div();
	}
}