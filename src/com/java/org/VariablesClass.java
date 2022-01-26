package com.java.org;

public class VariablesClass {
int b=20;// class variabl
public static int c=30;//staticvari can b called in oter package
public void std() {
	int i=235; //local variable
	System.out.println("the id number is "+i);
}
public static void main(String[] args) {
	VariablesClass m = new VariablesClass();
	m.std();
	System.out.println(m.b);//object class varibl
	System.out.println(c);
}

}
