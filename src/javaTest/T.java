package javaTest;

public class T implements Comparable<T>{
	
		String name ;
		int score;
		
		@Override
		public int compareTo(T o) {
			// TODO Auto-generated method stub
			if(!this.name.equals(o.name)){
				return this.name.compareTo(o.name) ;
			}else{
				return this.score - o.score;
			}
	        
		}	
		
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			 System.out.println(this.name + " " + this.score);
			 return this.name;
		}
		
		public String getName(){
			return name;
		}
		
		public void setName(String name){
			this.name = name;
		}
		
		public int getScore(){
			return score;
		}
		
		public void setScore(int score){
			this.score = score;
		}
}

