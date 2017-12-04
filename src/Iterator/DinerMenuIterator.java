package Iterator;
import java.util.Iterator;

public class DinerMenuIterator implements Iterator<Object>{
	MenuItem[] iterms;
	int position;
	
	public DinerMenuIterator(MenuItem[] iterms){
		this.iterms = iterms;
	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		if(position >= iterms.length || iterms[position] == null){
			return false;
		}else{
			return true;
		}
	}

	@Override
	public Object next() {
		// TODO Auto-generated method stub
		MenuItem menuItem = iterms[position];
		position = position + 1;
		return menuItem;
	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub
		if(position <= 0){
			throw new IllegalStateException("you can't remove an item  until you've done ");			
		}
		if(iterms[position -1] != null){
			for(int i = position - 1; i < iterms.length - 1; i ++){
				iterms[i] = iterms[i + 1];
			}
			iterms[iterms.length -1] = null;
			}
	}

}
