class Parent
{
	int site=5;
	int money=500000;
	String car="BMW";
}
class Child extends Parent
{
	int money=10000;
	void use()
	{
	System.out.println("SITE :"+site);
	System.out.println("Chile MONEY :"+money);
	System.out.println("Parent MONEY:"+super.money);
	System.out.println("BOth:"+(super.money+money));
	System.out.println("CAR :"+car);

	}
}
class ParentChild
{
	public static void main(String args[])
	{
		Child c = new Child();
		c.use();	
	}
}