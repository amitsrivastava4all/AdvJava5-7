import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;

class Emp implements Comparable<Emp>
{
	Date dob;
	String name;
	Emp(Date dob, String name){
		this.dob = dob;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Emp [dob=" + dob + ", name=" + name + "]";
	}
	@Override
	public int compareTo(Emp o) {
		
		return this.dob.compareTo(o.dob);
	}
	
}

public class DateTimeDemo {

	public static void main(String[] args) {
		
		Date date = new Date();
		System.out.println(date);
		Calendar calc = Calendar.getInstance();
		calc.set(2015, 11, 22);
		
		calc.add(Calendar.DATE, 10);
		Date d = calc.getTime();
		System.out.println(d);
		Locale locale  = new Locale("fr","FR");
		DateFormat df = DateFormat.getDateInstance(DateFormat.FULL,locale);
		String formattedDate = df.format(d);
		System.out.println("Formatted Date "+formattedDate);
		Emp r = new Emp(d,"ram");
		calc = Calendar.getInstance();
		calc.set(2012, 2, 22);
		
		calc.add(Calendar.DATE, 1);
		Date d2 = calc.getTime();
		Emp r2 = new Emp(d2,"shyam");
		ArrayList<Emp> empList = new ArrayList<>();
		empList.add(r);
		empList.add(r2);
		System.out.println(empList);
		Collections.sort(empList);
		System.out.println("*************************");
		System.out.println(empList);
		
	}

}
