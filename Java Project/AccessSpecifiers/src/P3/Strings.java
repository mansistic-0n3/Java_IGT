package P3;

public class Strings {
	public static void main(String args[]) {
		String m = new String("Mansi");
		System.out.println(m);
		
		m.concat("Chaurasia");
		System.out.println(m);
		
		m=m.concat("Chaurasia");
		System.out.println(m);
		
		StringBuffer sb = new StringBuffer("Cool");
		sb.append("Beautiful");
		System.out.println(sb);
		
		sb.insert(0, "Ms.");
		System.out.println(sb);
		
		sb.delete(3, 7);
		System.out.println(sb);
		
		//thread not safe
		StringBuilder sbl = new StringBuilder("Mysterious");
		sbl.append("Girl");
		System.out.println(sbl);
	}
}
