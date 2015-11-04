import java.util.ArrayList;

class Stack<T>{
	ArrayList<T> list = new ArrayList<T>();
	void push(T data){
		list.add(data);
	}
	 T peep(){
		return list.get(list.size()-1);
	}
}
public class TemplateDemo {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		stack.push("ram");
		stack.push("shyam");
		System.out.println(stack.peep());

	}

}
