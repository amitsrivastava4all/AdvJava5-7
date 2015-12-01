import java.util.ArrayList;
import java.util.HashMap;


public class MapDemo {

	public static void main(String[] args) {
		HashMap<String,ArrayList<Integer>> map = new HashMap<>();
		ArrayList<Integer> phones = new ArrayList<>();
		phones.add(1000);
		phones.add(2000);
		map.put("amit",phones);
		
		System.out.println(map.get("amit"));
		

	}

}
