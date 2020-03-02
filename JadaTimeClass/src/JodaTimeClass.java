import java.lang.reflect.Field;
import java.util.Date;

import org.joda.time.DateTime;

public class JodaTimeClass{

	public static void main(String[] args) {
		DateTime dateTime = new DateTime();
		
		Date date = dateTime.toDate();
		System.out.println(dateTime.toString());
		System.out.println(date.toString());
		
		DateTime now = new DateTime();
		System.out.println("Current Day: " + now.dayOfWeek().get()); 
        System.out.println("Current Month: " + now.monthOfYear().getAsText()); 
        System.out.println("Current Year: " + now.year().getAsText()); 
        System.out.println("Current Year is Leap Year: " + now.year().isLeap());
        
        System.out.println(TestClass.class.getName());
        System.out.println(TestClass.class.isInterface());
        System.out.println(TestClass.class.isArray());
        System.out.println(JodaTimeClass.class.getSuperclass());

        Field field [] = String.class.getDeclaredFields();
        for(int i =0 ; i<field.length;i++) {
        System.out.println(field[i].getName());
        }

        
	}

}
