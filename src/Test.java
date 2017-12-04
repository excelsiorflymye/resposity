/*import java.util.ArrayList;
import java.util.List;


public class Test {

	public static void main(String args[]){
		List<Object> lst = new ArrayList<Object>();
//		lst.add(1,"aa");
		lst.add("aa");
		lst.add("bb");
//		System.out.println("lst is :" + lst);
		lst.set(1, "cc");
//		System.out.println("lst is :" + lst);
		lst.add(1, "dd");
		System.out.println("lst is :" + lst);		
		lst.remove(0);
		System.out.println("lst is :" + lst);
	}
}
*/



    import java.util.ArrayList;  
    import java.util.Iterator;  
    import java.util.List;  
      
    public class Test {  
      
        void init(List<Integer> list) {  
            list.clear();  
            for (int i = 0; i < 10; i++) {  
                list.add(i + 1);  
            }  
        }  
      
        void remove(List<Integer> list) {  
            for (int i = 0; i < 5; i++) {  
                list.remove(i);  
            }  
        }  
      
        void removeTwo(List<Integer> list) {  
            for (int i : list) {  
                if (i < 6) {  
                    list.remove(i);  
                }  
            }  
        }  
      
        void removeThree(List<Integer> list) {  
            for (Iterator<Integer> iter = list.iterator(); iter.hasNext();) {  
                int i = iter.next();  
                if (i < 6) {  
                    iter.remove();  
                }  
            }  
        }  
      
        public static void main(String[] args) {  
            Test testList = new Test();  
            List<Integer> list = new ArrayList<Integer>();  
      
            // ��һ�ַ���  
            testList.init(list);  
            testList.remove(list);  
            System.out.println(list);  
      
            // �ڶ��ַ���  
            try {  
                testList.init(list);  
                testList.removeTwo(list);  
                System.out.println(list);  
            } catch (Exception e) {  
                e.printStackTrace();  
            }  
              
            // �����ַ���  
            testList.init(list);  
            testList.removeThree(list);  
            System.out.println(list);  
        }  
    }  