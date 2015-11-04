import java.util.ArrayList;
import java.util.Collections;


public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList list = new ArrayList(100);
		list.add(new Integer(10)); //list[0] = 100
		list.add(new Integer(20));  // Object o = new Integer(20); (Java 5)
		list.add(1,new Integer(90));  // Primitive to Object Conversion
		list.add(0,new Integer(1000));
		list.add("amit");
		list.add(new Double(90.20));
		//list.add(10,9000);
		
		System.out.println(list);
		System.out.println(list.get(0)); //list[0]
		list.remove(0);
		
		/*if(list.contains(90)){*/
		int index = list.indexOf(new Integer(90));
		if(index>=0){
			System.out.println("Found...");
			list.set(index, new Integer(9000));
			System.out.println("After Update "+list);
		}
		else
		{
			System.out.println("Not Found...");
		}
		Collections.sort(list);
		System.out.println("After Sort "+list);
		Object o1 = list.get(0);
		Object o2 = list.get(1);
		Integer i1 = (Integer) o1;
		Integer i2 = (Integer) o2;
		int z = i1.intValue() + i2.intValue(); // Object to Primitive
		list.add(2,new Integer(z));
		
	}

}
