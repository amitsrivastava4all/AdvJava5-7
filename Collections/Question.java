import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeMap;

class Product implements Comparable<Product>{
	private int pid;
	private String name;
	private Double price;
	Product(int pid , String name,Double price){
		this.pid = pid;
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", name=" + name + ", price=" + price
				+ "]";
	}
	@Override
	public int compareTo(Product o) {
		// TODO Auto-generated method stub
		return this.price.compareTo(o.price);
	}
	public int getPid() {
		return pid;
	}
	public String getName() {
		return name;
	}
	public Double getPrice() {
		return price;
	}
	
	
}
class Order{
	private int oid;
	private String name;
	private ArrayList<Product> productList;
	Order(int oid, String name){
		this.oid = oid;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Order [oid=" + oid + ", name=" + name + "]";
	}
	public ArrayList<Product> getProductList() {
		return productList;
	}
	public void setProductList(ArrayList<Product> productList) {
		this.productList = productList;
	}
	public int getOid() {
		return oid;
	}
	public String getName() {
		return name;
	}
	
}

class Address{
	private String city;
	private String state;
	Address(String city, String state){
		this.city = city;
		this.state = state;
	}
	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + "]";
	}
	public String getCity() {
		return city;
	}
	public String getState() {
		return state;
	}
	@Override
	public int hashCode(){
		return city.length();
	}
	@Override
	public boolean equals(Object o ){
		Address a = (Address)o;
		if(this.city.equals(a.city) && this.state.equals(a.state)){
			return true;
		}
		else
		{
			return false;
		}
	}
	
}

class Customer{
	private int id;
	private String name;
	private HashMap<String,HashSet<Address>> addressMap;
	private TreeMap<Integer,Order> orderMap ;
	Customer(int id, String name){
		this.id = id;
		this.name =name;
	}
	
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", addressMap="
				+ addressMap + "]";
	}

	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public HashMap<String, HashSet<Address>> getAddressMap() {
		return addressMap;
	}
	public void setAddressMap(HashMap<String, HashSet<Address>> addressMap) {
		this.addressMap = addressMap;
	}

	public TreeMap<Integer, Order> getOrderMap() {
		return orderMap;
	}

	public void setOrderMap(TreeMap<Integer, Order> orderMap) {
		this.orderMap = orderMap;
	}
	

}
public class Question {

	public static void main(String[] args) {
		HashMap<String,Customer> customerMap = new HashMap<>();
		Customer ram = new Customer(1001,"Ram");
		customerMap.put(ram.getName(), ram);
		Address office1 = new Address("Delhi","Delhi");
		Address office2 = new Address("Delhi","Delhi");
		Address office3 = new Address("Delhi","Delhi");
		Address office4 = new Address("Delhi","Delhi");
		HashSet<Address> addressOfficeSet = new HashSet<>();
		addressOfficeSet.add(office1);
		addressOfficeSet.add(office2);
		addressOfficeSet.add(office3);
		addressOfficeSet.add(office4);
		HashMap<String,HashSet<Address>> addressMap=new HashMap<>();
		addressMap.put("office",addressOfficeSet);
		ram.setAddressMap(addressMap);
		Order order = new Order(10,"Order-1");
		Product p1 = new Product(111, "Nokia", 9999.0);
		Product p2 = new Product(222, "Samsung", 2999.0);
		Product p3 = new Product(3333, "LG", 5999.0);
		ArrayList<Product> productList = new ArrayList<>();
		
		
		productList.add(p1);
		productList.add(p2);
		productList.add(p3);
		Collections.sort(productList);
		order.setProductList(productList);
		TreeMap<Integer,Order> orderMap = new TreeMap<>();
		orderMap.put(order.getOid(),order);
		ram.setOrderMap(orderMap);
		
		System.out.println(ram.getAddressMap().get("office"));
		Customer shyam = new Customer(1002,"Shyam");
		customerMap.put(shyam.getName(), shyam);
		
		System.out.println(ram.getOrderMap().get(10).getProductList().get(0));
		
		
		
		

	}

}
