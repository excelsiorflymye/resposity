package Command;

public class Light {
	String lightName;
	public Light(String lightName){
		this.lightName = lightName;
	}
	
	public void on(){
		System.out.println(lightName + "light is on!");
	}
	
	public void off(){
		System.out.println(lightName + "light is off!");
	}
}


