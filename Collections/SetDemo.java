import java.util.TreeSet;

// HashSet , LinkedHashSet , TreeSet
class Employee {//implements Comparable<Employee>{
	private int id;
	private String name;
	 Employee(int id, String name) {
		this.id = id;
		this.name = name;
		
	}
	 
	 public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	 public String toString(){
		 return "Id "+id+" Name "+name;
	 }
	/*@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return this.name.compareToIgnoreCase(o.name);
	}*/
	 
/*	 // Search in the right bucket
	 @Override
	 public int hashCode(){
		 return name.length()* id>2000?10:20;
	 }
	 
	 // Search the right value in the bucket
	 @Override
	 public boolean equals(Object o){
		 Employee e = (Employee)o;
		 if(this.id==e.id && this.name.equals(e.name)){
			 return true;
		 }
		 else{
			 return false;
		 }
	 }*/
}
public class SetDemo {

	public static void main(String[] args) {
		TreeSet<Employee> hs = 
				new TreeSet<>
		((o1,o2)->o1.getName().compareToIgnoreCase(o2.getName()));	
		//HashSet<Employee> hs = new HashSet<>();
			Employee ram1 = new Employee(1001, "tim");
			Employee ram2 = new Employee(1001, "ram");
			Employee shyam1 = new Employee(1002, "Shyam");
			Employee shyam2 = new Employee(1002, "Shyam");
			hs.add(ram1);
			hs.add(ram2);
			hs.add(shyam1);
			hs.add(shyam2);
			/*System.out.println(ram1.hashCode());
			System.out.println(ram2.hashCode());
			System.out.println(shyam1.hashCode());
			System.out.println(shyam2.hashCode());*/
			System.out.println(hs);
			

	}

}
