
public class TestManager {
	public static void main(String[] args) {
		System.out.println("This is main");
		
		Character ch1 = new Character("Jin");
		ch1.addItem("Pistol", 1, 150);
		ch1.addItem("Shield", 2, 200);
		ch1.printItemList();
		Character ch2 = new Character("Mai");
		ch2.addItem("Rifle", 1, 200);
		ch2.addItem("Dagger", 3, 50);
		ch2.addItem("Armor", 4, 340);
		ch2.printItemList();
		ch2.delItem(0);
		ch2.printItemList();
	}

}
