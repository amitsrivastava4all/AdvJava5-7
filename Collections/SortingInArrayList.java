import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


class SortByName implements Comparator<Item>{

	public int compare(Item o1, Item o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}
	
}

class SortById implements Comparator<Item>{

	public int compare(Item o1, Item o2) {
		// TODO Auto-generated method stub
		return o2.getId().compareTo(o1.getId());
	}
	
}



public class SortingInArrayList {

	public static void main(String[] args) {
		
		ArrayList<Item> itemList = new ArrayList<Item>();
		for(int i =1; i<=10; i++){
			Item item =new Item();
			item.setId(i);
			if(i ==1){
				item.setName("Ram");
			}
			else
			if(i==2){
				item.setName("ram");
			}
			else
			if(i==3){
				item.setName("Shyam");
			}
			else
				if(i==4){
					item.setName("Ram");
				}
				else
					if(i==5){
						item.setName("RAM");
					}
			else{
				item.setName("SOHAN");
			}
			//item.setName("ABC"+i);
			item.setDesc("DESC");
			item.setPrice(2000.0*i);
			itemList.add(item);
			
		}
		Collections.sort(itemList, new SortById());
		System.out.println("After Sort "+itemList);

	}

}
