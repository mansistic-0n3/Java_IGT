import java.util.*;
class A
{
   A(){
       ArrayList<Integer> al = new ArrayList<Integer>();  //generic - <integer> for taking only int type
       al.add(100);
      // al.add("ABC");
       al.add(300);
       al.add(400);
       al.add(700);
       al.add(2,4567);

       Iterator i = al.iterator();
       while(i.hasNext())
         {
             System.out.println(i.next());
         }
         Date d = new Date();
         System.out.println(d);
      }
}


class arrList
{
  public static void main(String args[])
  {
     A a = new A();
  }
}