package junseok.annotation;

import java.lang.annotation.Repeatable;

@Repeatable(ToDos.class)
public @interface ToDo {
	String value();
	
}
