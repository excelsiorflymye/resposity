package Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class PancakeHouseMenuIterator implements Iterator<Object> {
	ArrayList<MenuItem> menuItems;
	int position;
	
	public PancakeHouseMenuIterator(ArrayList<MenuItem> menuItems){
		this.menuItems = menuItems;
	}
	
	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		if(position >= menuItems.size() || menuItems.get(position) == null){
			return false;			
		}else{
			return true;
		}
	}

	@Override
	public Object next() {
		// TODO Auto-generated method stub
		MenuItem menuItem = menuItems.get(position);
		position =  position + 1; 
		return menuItem;
	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub
		
	}
	
}
