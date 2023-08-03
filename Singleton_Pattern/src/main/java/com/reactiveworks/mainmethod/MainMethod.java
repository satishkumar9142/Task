package com.reactiveworks.mainmethod;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

import com.reactiveworks.util.ABC;
import com.reactiveworks.util.XYZ;

public class MainMethod {
	public static void main(String[] args) throws Exception {
		
	/*	ABC abc1 = ABC.getABC();
		System.out.println(abc1.hashCode());
		ABC abc2 = ABC.getABC();
		System.out.println(abc2.hashCode());
		
		System.out.println(XYZ.getXYZ().hashCode());
		System.out.println(XYZ.getXYZ().hashCode());
		
		*/
		
		/*
		 *   1. Reflection API to break singleton pattern
		 *     
		 */
		
	/*	ABC a1 = ABC.getABC();
		System.out.println(a1.hashCode());
		
		Constructor<ABC> constructor  = ABC.class.getDeclaredConstructor();
		constructor.setAccessible(true);
		ABC a2 = constructor.newInstance();
		System.out.println(a2.hashCode()); */
		
		ABC abc = ABC.getABC();
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("abc.ob"));
		oos.writeObject(abc);
		
		System.out.println("Serialization done.....");
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("abc.ob"));
		ABC abc2 = (ABC)ois.readObject();
		System.out.println(abc2.hashCode());
	}
}
