package com;
import java.util.*;

 

public class Question {
private int id;
private String name;
private Set ph;

private List<String>answers;
public Question(int id, String name, List<String> answers, Set ph) {
    super();
    this.id = id;
    this.name = name;
    this.answers = answers;
    this.ph = ph;
}

 

public void display()
{
     System.out.println(id +" "+name);
     System.out.println("answers");

     Iterator i=answers.iterator();
     while(i.hasNext())
     {
         System.out.println(i.next());
     }

     System.out.println("number....!!");
     Iterator phone=answers.iterator();
     while(phone.hasNext())
     {
         System.out.println(phone.next());
     }


}

}