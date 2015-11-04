import java.util.ArrayList;


public class ItemOperations {
	private ArrayList<Item> itemList = new ArrayList<Item>();
	public boolean add(Item item){
		return itemList.add(item);
	}
	public ArrayList<Item> getItemList(){
		return itemList;
	}
	
}
