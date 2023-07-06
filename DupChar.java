import java.util.*;
class DupChar
{    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter string  : ");
        String str=sc.next();
        char[] ch = str.toCharArray();
        int count=1;

         for(int i=0;i<str.length();i++)
        {
             for(int j=i+1;j<str.length();j++)
            {
                if (ch[i]==ch[j])
                {    
                                       System.out.println("duplicate found  : "+ch[j]);
                    count=count+1;
            }
            }
        }
        if(count>1)
        {
         System.out.println("times : "+count);    
        }
        else
        {
            System.out.println("no duplicate ");
        }
    }
}