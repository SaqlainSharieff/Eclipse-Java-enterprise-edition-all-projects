package annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import annotations.Cat.Execute;

public class TestAnnotation {

	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException  {

		Cat cat = new Cat();
		int count=1;
		for (Method method : cat.getClass().getDeclaredMethods()) {

			if (method.isAnnotationPresent(annotations.Cat.Execute.class)) {
				Execute annotation = method.getAnnotation(annotations.Cat.Execute.class);
				
				if(annotation.sequence()==count) {
					count++;
					method.invoke(cat);
				}
				}
			}
		}
	

}

class Cat {

	@Execute(sequence = 3)
	public void speak() {
		System.out.println("Meow!");
	}

	@Execute(sequence = 2)
	public void action() {
		System.out.println("purr!");
	}

	@Execute(sequence = 1)
	public void run() {
		System.out.println("Running!");
	}

	@Target(ElementType.METHOD)
	@Retention(RetentionPolicy.RUNTIME)
	public @interface Execute {
		int sequence();
	}

	@interface Info {
		String AuthorId();

		String Author() default "NA";

		String Supervisor() default "NA";

		String Date();

		String Time();

		int version();

		String Description() default "No Description available";

	}

}