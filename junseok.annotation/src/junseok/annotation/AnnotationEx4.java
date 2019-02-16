package junseok.annotation;

import java.util.Arrays;

class MyArrayList<T> {
	T[] arr;
	
//	@SafeVarargs
	@SuppressWarnings("unchecked")
	MyArrayList(T... arr) {
		this.arr = arr;
	}
	
	@SafeVarargs
	@SuppressWarnings("varargs")
	public static <T> MyArrayList<T> asList(T... a) {
		return new MyArrayList<>(a);
	}
	
	public String toString() {
		return Arrays.toString(arr);
	}
	
}


public class AnnotationEx4 {
	public static void main(String[] args) {
		MyArrayList<String> list = MyArrayList.asList("1", "2", "3", "4");
		System.out.println(list);
	}	

}
