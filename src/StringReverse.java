
public class StringReverse {
	public String reverseS(String targetString){
		if(null != targetString && targetString.length() > 1){
				return reverseS(targetString.substring(1))+targetString.charAt(0);
		}
		return targetString;
	}
	
	public int string2Int(String str){
		if(null != str && str.length() >0){
			int sumInt = 0;
			for(int i = 0; i<str.length();i++){
				sumInt = sumInt * 10 + (str.charAt(i)-'0' + 0);
			}
			return sumInt;
			
		}
		return -1;
	}

	public String int2String(int num){		
		char[] temp = new char[7] ;
		StringBuffer afterString = new StringBuffer(); 
		int i = 0;
		while(num > 0){
			temp[i] = (char) (num % 10 + '0');
			num = num / 10;
			i++;
		}
		System.out.println("temp is" + temp);
		//reverse the number
		for (int j = i; j >= 0; j--) {
			afterString.append(temp[j]);
		}		
		return afterString.toString();
	}
	
	public String loopMove(String originalString, int step){
		if (null != originalString && originalString.length() > step && step > 1 ) {
			int index = originalString.length()-step;
			String moveString = originalString.substring(index);
			return moveString + originalString.substring(0, index);
		}
		return null;
	}
	
	public String longestRepeatStr(String str){
			    int n = str.length();
			    for(int i = n - 1; i > 1; --i)
			         for(int j = 0; j < n; ++j) {
			             if(i + j <= n) {
			                String cur = str.substring(j,i);
			                int index1 = str.indexOf(cur); // 从前往后找
			                int index2 = str.lastIndexOf(cur); // 从后往前找
			                if(index1 != index2)
			                    return cur;
			            }
			        }
			    return null;
	}
	
	
	public static void main(String[] args) {
		String originalString = "abcdefgh";
		StringReverse stringReverse = new StringReverse();
		Integer integer = new Integer(0);
		String afterReverseString = stringReverse.reverseS(originalString);
		System.out.println("the originalString is " + originalString);
		System.out.println("the reverseString is " + afterReverseString);
		
		int aaa = -1;
		String int2String = stringReverse.int2String(aaa);
		System.out.println("before is " + aaa);
		System.out.println("afterString is " + int2String);
		
		String bbb = "986";
		int numInt = stringReverse.string2Int(bbb);
		System.out.println("numInt  is " +numInt);
		String loopString = stringReverse.loopMove(originalString, 3);
		System.out.println("loopString is " + loopString);
		
		String longestRepeatStr = stringReverse.longestRepeatStr(originalString);
		System.out.println("longestRepeatStr is " + longestRepeatStr);
	}
	
	 
}
