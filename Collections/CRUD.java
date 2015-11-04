import java.util.Scanner;


public class CRUD {

	public static void main(String[] args) {
		ItemOperations itemOpr =new ItemOperations();
		System.out.println("1. Add a New Item");
		System.out.println("2. Search Existing");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your choice ");
		int choice = scanner.nextInt();
		if(choice==1){
			Item item = new Item();
			item.setId(1001);
			item.setName("Mobile");
			item.setDesc("Apple");
			item.setPrice(12000.0);
			if(itemOpr.add(item))
			{
				System.out.println("Item Added SuccessFully...");
			}
			System.out.println(item.toString());
			System.out.println("Item is "+itemOpr.getItemList());
		}
		else
		if(choice==2){
			Item item = new Item();
			item.setId(1001);
			item.setName("Mobile");
			item.setDesc("Apple");
			item.setPrice(12000.0);
			if(itemOpr.add(item))
			{
				System.out.println("Item Added SuccessFully...");
			}
			// Search Code
			 item = new Item();
			item.setId(1001);
			item.setName("Mobile");
			item.setDesc("Apple");
			item.setPrice(12000.0);
			if(itemOpr.getItemList().contains(item)){
				System.out.println("Found ....");
			}
			else
			{
				System.out.println("Not Found....");
			}
			
		}
		scanner.close();

	}

}
