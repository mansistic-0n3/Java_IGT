import java.io.*;

public class folder{
    public static void main(String[] args) {
        
        try {
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    File dir1= new File("abc");
		dir1.mkdir();	
	    File dir2= new File("xyz");
		dir2.mkdir();
            File f=new File(dir2, "atoz.txt");
            if(f.exists()){
                System.out.println("File exist");
		System.out.println("Enter File name: ");
		String fname = br.readLine();
		f=new File(dir2,fname);
		f.createNewFile();
            }
            else{
                f.createNewFile();
            }
	PrintWriter pw = new PrintWriter(new FileOutputStream(f,true));
	System.out.println("Enter content...");
	pw.println(br.readLine());
	pw.close();
        } catch (Exception e) {
        }
    }
}