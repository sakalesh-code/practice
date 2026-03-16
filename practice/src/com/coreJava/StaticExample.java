package com.coreJava;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class StaticExample {

	static int count = 0;

	int rep = 0;

	public static void main(String[] args) {
		StaticExample c1 = new StaticExample();
		StaticExample c2 = new StaticExample();
		System.out.println(StaticExample.count);
		StaticExample.count++;
		c1.rep++;
		System.out.println(StaticExample.count); // 1
		System.out.println(c2.rep);
		T3 t3 = new T3();
		t3.m1();
		String s = "Java";
		s.concat("8");
		System.out.println(s);
		s = s.concat("8");
		System.out.println(s);

	}

}

@SuppressWarnings("serial")
class User implements Serializable {
	String username;
	transient String password;
}

class Tester {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {
		User u = new User();
		u.username = "admin";
		u.password = "secret";

		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("user.ser"));
		oos.writeObject(u);
		oos.close();

		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("user.ser"));
		User obj = (User) ois.readObject();

		System.out.println(obj.username); // admin
		System.out.println(obj.password); // null

	}
}

interface I1 {
	void m2();

	default void m4() {
		System.out.println("m4");
	}

	static void m3() {
		System.out.println("m3");
	}

	public void m5();

}

class T1 implements I1 {

	@Override
	public void m2() {
		System.out.println("Hi");
	}

	@Override
	public void m5() {
		System.out.println("m5");

	}

}

abstract class T2 {
	abstract void m1();

	static void m3() {
		System.out.println("m3");
	}

	void m5() {
		System.out.println("m5");
	}

	void m6() {
		System.out.println("m6");
	}

}

class T3 extends T2 {

	@Override
	void m1() {
		System.out.println("m1");

	}

}
