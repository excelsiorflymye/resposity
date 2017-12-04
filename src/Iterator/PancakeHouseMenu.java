package Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class PancakeHouseMenu implements Menu{
	ArrayList<MenuItem> menuItems;
	
	public PancakeHouseMenu(){
		menuItems = new ArrayList<MenuItem>();
		
		addItem("K&B Pancake breakfast", "Pancakes with scrambled eggs and toast ", true, 2.99);
		addItem("regular Pancake breakfast", "Pancakes with fired eggs and sausage ", false, 2.99);
		addItem("blueberry breakfast", "Pancakes made with fresh bllueberries ", true, 3.49);
		addItem("waffles", "waffles, with your choice of blueberries and strawberries ", true, 3.59);
	}
	
	public void addItem(String name, String description, boolean vegetarian, double price){
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		menuItems.add(menuItem);
	}
	
/*	public Iterator createIterator(){
		return new PancakeHouseMenuIterator(menuItems);
	}
*/
	@Override
	public Iterator<MenuItem> createIterator() {
		// TODO Auto-generated method stub
		return menuItems.iterator();
	}
	
/*	public ArrayList<MenuItem> getMenuItems(){
		return menuItems;
	}*/
}
