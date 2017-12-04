package Command;

public class Stereo {
    boolean CD;
    int volum;
    String stereoName;
	
	public Stereo(String stereoName){
		this.stereoName = stereoName;
	}
	
	public void on(){
		System.out.println(stereoName + " Stereo Is ON !");
	}
	
	public void setCD(){
		CD = true;
	}
	
	public void setVolum(int volum){
		this.volum = volum;
	}
}
