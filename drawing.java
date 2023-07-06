//Constructor OVERLOADING
class Draw{
	Draw(){
		this(10);
		System.out.println("Draw");
		
	}
	Draw(int a){
		this(7, 3);
		System.out.println("Draw a square with side "+a);
	}
	Draw(int l, int b){
		System.out.println("Draw a rectangle with length "+l +" and breadth "+b);
	}
}
class drawing{
	public static void main(String args[]){
		Draw d1 = new Draw();
		//Draw d2 = new Draw(4);
		//Draw d3 = new Draw(7,3);		
	}
}