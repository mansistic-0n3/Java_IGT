package test;

import java.util.*;  
class Age implements Comparator<Student>{  
	public int compare(Student s1,Student s2){  
		if(s1.age==s2.age)  
			return 0;  
		else if(s1.age>s2.age)  
			return 1;  
		else  
			return -1;  
	}  
}
