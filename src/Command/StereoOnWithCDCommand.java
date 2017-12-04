package Command;

public class StereoOnWithCDCommand implements Command{
	Stereo stereo;
	
	public StereoOnWithCDCommand(Stereo stereo){
		this.stereo = stereo;		
	}
	
	public void execute(){
		stereo.on();
		stereo.setCD();
		stereo.setVolum(11);
	}

	public void undo(){
		
	}
}
