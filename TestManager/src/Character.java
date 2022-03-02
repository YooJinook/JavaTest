import java.util.ArrayList;

public class Character {
	private String charName;
	public Character(String str) {
		this.charName = str;
	}
	
	private class Item {
		private String ItemName;
		private int TypeID;
		private int Cost;
	}
	
	private ArrayList<Item> itemlist = new ArrayList<Item>();
	
	public void addItem(String name, int id, int cost) {
		Item item = new Item();
		item.ItemName = name;
		item.TypeID = id;
		item.Cost = cost;
		itemlist.add(item);
	}

	public void delItem(int index) {
		itemlist.remove(index);
	}
	
	public void printItemList() {
		for(Item it : itemlist) {
			System.out.println(this.charName + "_" + it.ItemName + "_" + it.TypeID + "_" + it.Cost);
		}
	}
	
}
