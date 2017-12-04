package javaTest;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Time;
import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeSet;

import javaTest.T;



public class SortName {

	public static void main(String[] args) {
		
		BufferedReader bfrReader = null;
		try {
			bfrReader = new BufferedReader(new InputStreamReader(new FileInputStream("ms.xml")));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		HashMap<String,Integer> hashName = new HashMap<String, Integer>();
		
		String strName = "";
		try {
			if((strName = bfrReader.readLine())!= null){
				String[] strNamestr = strName.split(",");
				String name = strNamestr[1];
				if(hashName.containsKey(name)){
					hashName.put(name, (hashName.get(name))+1);
				}				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		TreeSet<T> nameTreeSet = new TreeSet<T>();
		Iterator<String> iterator = hashName.keySet().iterator();
		if(iterator.hasNext()){
			T sortName = new T();
			sortName.setName(iterator.next());
			sortName.setScore(hashName.get(iterator.next()));
			nameTreeSet.add(sortName);
		}
		for(T sortNameDisplay: nameTreeSet){
			sortNameDisplay.toString();
		}			
	}
		
}
