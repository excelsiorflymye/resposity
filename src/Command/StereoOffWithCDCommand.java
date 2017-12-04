package Command;

public class StereoOffWithCDCommand implements Command{
	Stereo stereo;
	
	StereoOffWithCDCommand(Stereo stereo){
		this.stereo = stereo;
	}
	
	public void execute(){
		stereo.on();
		stereo.setCD();
		stereo.setVolum(12);
	}
	
	public void undo(){
		
	}
}
