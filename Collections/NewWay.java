import java.util.ArrayList;

// 1.5 Generics <Integer>
// AutoBoxing
public class NewWay {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(90);
		list.add(100);
		list.add(list.get(0)+list.get(1));
	}

}
