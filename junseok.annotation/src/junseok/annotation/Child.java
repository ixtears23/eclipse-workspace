package junseok.annotation;

import java.util.Date;

public class Child extends Parent {
	
	@Override
	void ParentMethod() {
		
		Date date = new Date();
		
		int date2 = date.getDate();
	}
}
