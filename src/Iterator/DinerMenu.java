package Iterator;

import java.util.Iterator;

public class DinerMenu implements Menu{
	public static final int MAX_ITEMS =  6;
	int numberOfItems = 0;
	MenuItem[] menuItems;
	
	public DinerMenu(){
		menuItems = new MenuItem[MAX_ITEMS];
		
		addItems("Vegetarian BLT ", "Fakin Bacon with lettuce $ tomatto on whole wheat", true, 2.99);
		addItems("BLT ", "Bacon with lettuce $ tomatto on whole wheat", false, 2.99);
		addItems("Soup of the day ", "Soup of the day, with a side of potato salad", false, 3.29);
		addItems("HotDog ", "a hot dog, with saurkraut, relish, onoins with cheese", false, 3.05);		
	}
	
	public void addItems(String name, String description, boolean vegetarian, double price){
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		if(numberOfItems >= MAX_ITEMS){
			System.out.println("Sorry, Menu is full, can't add item to menu ");			
		}else{
			menuItems[numberOfItems] = menuItem;
			numberOfItems = numberOfItems + 1;
		}			
	}

	@Override
	public Iterator<MenuItem> createIterator() {
		// TODO Auto-generated method stub
		return null;
	}

/*	public Iterator<MenuItem> createIterator(){
		return menuItems.iterator();
	}*/
/*	public MenuItem[] getMenuItems(){
		return menuItems;
	}*/
}
