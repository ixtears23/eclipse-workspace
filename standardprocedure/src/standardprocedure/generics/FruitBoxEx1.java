package standardprocedure.generics;

import java.util.ArrayList;

//class Fruit 				{ public String toString() { return "Fruit"; } } 
//class Apple extends Fruit 	{ public String toString() { return "Apple"; } } 
//class Grape extends Fruit	{ public String toString() { return "Grape"; } } 
//class Toy					{ public String toString() { return "Toy"; } } 
//
//public class FruitBoxEx1 {
//	public static void main(String[] args) {
//		Box<Fruit> fruitBox = new Box<Fruit>();
//		Box<Apple> appleBox = new Box<Apple>();
//		Box<Toy> toyBox = new Box<Toy>();
//		
//		fruitBox.add(new Fruit());
//		fruitBox.add(new Apple());
//		
//		appleBox.add(new Apple());
//		appleBox.add(new Apple());
//		
//		toyBox.add(new Toy());
//		
//		System.out.println(fruitBox);
//		System.out.println(appleBox);
//		System.out.println(toyBox);
//		
//		
//	}
//}
//
//class Box<T> {
//	ArrayList<T> list = new ArrayList<T>();
//	void add(T itme) { this.list.add(itme); }
//	T get(int i) { return this.list.get(i); }
//	int size() { return this.list.size(); }
//	public String toString() { return this.list.toString(); }
//	
//	
//	
//}