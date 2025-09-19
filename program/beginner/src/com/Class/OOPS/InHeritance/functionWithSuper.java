package com.Class.OOPS.InHeritance;

public class functionWithSuper {
public static void main(String[] args) {
	C2 o = new C2(2, 4);
	System.out.println(o.add());
	System.out.println(o.sub());
	System.out.println(o.mul());
	
}
}

class P {
int a, b;

P(int a, int b) {
	this.a = a;
	this.b = b;
}

int add() {
	return a + b;
}

}

class C1 extends P {
C1(int a, int b) {
	super(a, b);
}

int sub() {
	return Math.abs(a - b);
}
}

class C2 extends C1 {
C2(int a, int b) {
	super(a, b);
}

int mul() {
	return a * b;
}

}
