import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;


public class LongestRepeatSubtring {
	/*
	 * 查找后缀字符串数组
	 */
	public String[] SuffixSubstrs(String targetStr){
		if(null == targetStr || "".equals(targetStr))
			return null;
		int length = targetStr.length();
		String[] substrs = new String[length];
		for(int i = 0; i < length; i++){
			String subString =  targetStr.substring(i,length);
			substrs[i] = subString;
		}
		return substrs;
	}
	
	/*
	 * 对子串数组进行排序
	 */
	public void sortStrings(String[] substrs){
		if(null != substrs)
		quickSort(substrs,0,substrs.length -1);
	}

	private void quickSort(String[] substrs, int low, int high) {
		if (low < high) {
			int index = partition(substrs,low,high);
			if(low < index){
				quickSort(substrs, low, index-1);
			}
			if (high > index) {
				quickSort(substrs, index+1, high);
			}
		}
	}

	private int partition(String[] substrs, int start, int end) {
		int low = start;
		int high = end;
		String keyString = substrs[low];
		
		while(low < high){
			while(substrs[high].compareTo(keyString)>0  && low < high){
				high--;
			}
			if(substrs[high].compareTo(keyString) < 0 && low < high){
				swap(substrs,low,high);
			}
			
			while (substrs[low].compareTo(keyString) < 0  && low < high) {
				low++;
			}
			if (substrs[low].compareTo(keyString) > 0  && low < high) {
				swap(substrs, low, high);
			}
		}
		substrs[high] = keyString;
		System.out.println("high is " + high);
		return high;
	}

	private void swap(String[] substrs, int low, int high) {
		String tempString = substrs[low];
		substrs[low] = substrs[high];
		substrs[high] = tempString;
	}	
	
	
	private String findLongestCommonSubstr(String str1, String str2) {
		if(null == str1 || null == str2 || "".equals(str1) || "".equals(str2))
			return "";
		int start1 = -1;
		int start2 = -1;
		int longest = 0;
		
		int comparedNum = 0;
		int size1 = str1.length();
		int size2 =  str2.length();
		for (int i = 0; i < size1; i++) {
			for (int j = 0; j < size2; j++) {
				int commonsize = 0;
				int m = i;
				int n = j;
				while (m < size1 && n < size2) {
					comparedNum++;
					if (str1.charAt(m) != str2.charAt(n)) {
						break;
					}
					m++;
					n++;
					commonsize++;
				}
				
				if (commonsize > longest) {
					longest = commonsize;
					start1 = i;
					start2 = j;
				}
			}
		}
		return str1.substring(start1,start1+longest);
	}
	
	private String findLongestPreSubstring(String str1, String str2){
		if (null == str1 || null == str2 || "".equals(str1) || "".equals(str2)) {
			return "";
		}
		int index1 = 0;
		int index2 = 0;
		int commonsize = 0;
		String commonString = "";
		while (index1 < str1.length() && index2 < str2.length()) {
			if (str1.charAt(index1) == str2.charAt(index2)) {
				commonsize++;
				index1++;
				index2++;
			}else{
				break;
			}
		}
		if(commonsize > 0){
			commonString = str1.substring(0,index1);
		}
		
		return commonString;
	}
	
	public static void main(String[] args) {
		String originalString = "dbcadadbc";
		LongestRepeatSubtring longestRepeatSubtring =  new LongestRepeatSubtring();
		String[] suffixSubstrs = longestRepeatSubtring.SuffixSubstrs(originalString);
		for (int i = 0; i < suffixSubstrs.length; i++) {
			System.out.println("suffixSubstrs " + i + " " +suffixSubstrs[i]);
		}
		longestRepeatSubtring.sortStrings(suffixSubstrs);
		String longestSubString = "";
		for (int i = 0; i < (suffixSubstrs.length - 1); i++) {
			System.out.println("suffixSubstrs " + i + suffixSubstrs[i]);
			String findLongestCommonSubstr = longestRepeatSubtring.findLongestPreSubstring(suffixSubstrs[i],suffixSubstrs[i+1]);
			if (findLongestCommonSubstr.length() > longestSubString.length()) {
				longestSubString = findLongestCommonSubstr;
			}
			System.out.println("suffixSubstrs " + i + suffixSubstrs[i] +  " AND " + "suffixSubstrs " + (i+1) + suffixSubstrs[i+1] + "LONGEST common substr is " + findLongestCommonSubstr);
			System.out.println("THE longest string is : " + longestSubString);
		}
	}

}
