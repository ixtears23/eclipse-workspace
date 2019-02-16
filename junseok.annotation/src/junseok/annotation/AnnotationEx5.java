package junseok.annotation;

import java.lang.annotation.*;

@Deprecated
@SuppressWarnings("1111")
@TestInfo(testedBy="aaa", testDate=@DateTime(yyyymmdd="160101", hhmmss="233959"))
public class AnnotationEx5 {
	
	public static void main(String[] args) {
		
		Class<AnnotationEx5> cls = AnnotationEx5.class;
		
		TestInfo anno = (TestInfo) cls.getAnnotation(TestInfo.class);
		
		System.out.println("anno.testedBy()=" + anno.testedBy());
		System.out.println("anno.testDate().yyyymmdd()=" + anno.testDate().yyyymmdd());
		System.out.println("anno.testDate().hhmmss()=" + anno.testDate().hhmmss());
		
		for(String str : anno.testTools()) {
			System.out.println("testTools=" + str);
		}
		
		System.out.println();
		
		Annotation[] annoArr = cls.getAnnotations();
		for(Annotation a : annoArr) {
			System.out.println(a);
		}
		
	}

}


@Retention(RetentionPolicy.RUNTIME)
@interface TestInfo {
	int 		count() 		default 1;
	String 		testedBy();
	String[] 	testTools()		default "JUnit";
	TestType	testType()		default TestType.FIRST;
	DateTime 	testDate();
}

@Retention(RetentionPolicy.RUNTIME)
@interface DateTime {
	String yyyymmdd();
	String hhmmss();
}

enum TestType { FIRST, FINAL }
