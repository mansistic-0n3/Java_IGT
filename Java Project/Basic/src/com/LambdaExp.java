package com;

interface I{
    void add();
}

interface Cal{
    int mul(int a, int b);
}
public class LambdaExp {
	public static void main(String args[]) {
        I i=new I() {
            public void add() {
            System.out.println("hi");
            }
        };
        i.add();
        System.out.println("===========");
        I il=()->{
            System.out.println("Hi lambda");
        };
        il.add();
        System.out.println("======Cal interface=====");
        Cal cl=(a, b)-> (a*b);
        System.out.println(cl.mul(10, 20));

 

    }
}
