class A{
	private int id;
	private String name;
	private int age;
	void setId(int id, String name, int age){
		this.id = id;
		this.name = name;
		this.age =age;
	}
	int getId(){
		return id;
	}
	String getName(){
		return name;
	}
	int getAge(){
		return age;
	}
}

class Id{
	public static void main(String args[]){
		A a = new A();
		a.setId(100, "Mansi", 22);
		System.out.println("Employee Id : "+a.getId());
		System.out.println("Name : "+a.getName());
		System.out.println("Age : "+a.getAge());
	}
}