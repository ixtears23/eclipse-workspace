package practice;

import java.util.Arrays;
import java.util.List;

public class ListTest {

	public static void main(String[] args) {
		
		
		
		String[] str = {"test", "test2"};
		
		List<String> asList = Arrays.asList("asdf", "asdf", "asd");

		String[] clone = str.clone();
		
		List<String> asList2 = Arrays.asList(clone);
		
		
		char charAt = "String".charAt(0);
		
		boolean contains = "String".contains("String1");
		
		System.out.println(contains);
		
		System.out.println(charAt);
		
		
		
		System.out.println(asList2.toString());
		
		
		
		String string = asList.toString();
		
		String string2 = asList.get(2);
		
		System.out.println(string2);
		
		System.out.println(string);
		
		
		
		
		
	}
}
