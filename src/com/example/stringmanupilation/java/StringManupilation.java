package com.example.stringmanupilation.java;

public class StringManupilation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Marks";
		System.out.println("Size :" + name.length());
		System.out.println("Lower :" + name.toLowerCase());
		System.out.println("Size :" + name.toUpperCase());
		System.out.println("Size :" + name.substring(0, 3));
		System.out.println("Charater Position  :" + name.charAt(3));
		
		StringBuilder data = new StringBuilder("Hello");
		data.append("world");
		data.insert(3, "from india");
		data.reverse();
		System.out.println(data);
	}

}
