package P3;

public class access {
	public static void main(String args[]) {
		String name="Mansi";
		System.out.println(name);
		
		String s = new String("Chaurasia");
		System.out.println(s);
		
		System.out.println("My name is : "+ name.toUpperCase());
		System.out.println("My name is : "+ name.toLowerCase());
		System.out.println("Length : "+ name.length());
		System.out.println(name.trim().length());
		System.out.println(""+name.replace("N","T"));
		System.out.println(s.startsWith("N"));
		System.out.println(s.startsWith("s"));
		System.out.println(s.concat(name));
		System.out.println(name.equals("mansi"));
		System.out.println(name.equalsIgnoreCase("mansi"));
		System.out.println(s.charAt(2));
	}
}
