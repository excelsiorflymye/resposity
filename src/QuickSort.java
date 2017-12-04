import javax.xml.stream.events.StartDocument;


public class QuickSort {
	public void quickSort(int a[],int start, int end){
		int low = start;
		int high = end;
		int key = a[start];
		while (high > low) {			
			while (a[high] >= key && high > low) {
				high--;
			}
			if(a[high] <= key && high > low){
				swap(a, low, high); 
			}
			while(a[low] <= key && low < high){
				low++;
			}
			if(a[low] >= key && high > low){
				swap(a, low, high); 
			}
			if(low > start){
				quickSort(a, start, low-1);
			}
			if(high < end){
				quickSort(a, high+1, end);
			}
		}
	}


	private void swap(int[] a, int low, int high) {
		int temp = a[high];
		a[high] = a[low];
		a[low] = temp;
	}
		
	
	public static void main(String[] args) {
		int[] a = {5, 3, 1, 22,8,7,2};
		QuickSort ddQuickSort = new QuickSort();
		ddQuickSort.quickSort(a, 0, a.length-1);
		for (int b = 0; b < a.length; b++) {
			System.out.println(a[b]);
		}
		}
	}

