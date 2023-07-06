//Method OVERLOADING
class DrawShape{
	void draw(){
		System.out.println("Draw");
	}
	void draw(int a){
		System.out.println("Draw a square with side "+a);
	}
	void draw(int l, int b){
		System.out.println("Draw a rectangle with length "+l +" and breadth "+b);
	}
}
class drawingShape{
	public static void main(String args[]){
		DrawShape d1 = new DrawShape();
		d1.draw();
		d1.draw(5);
		d1.draw(7,2);		
	}
}

