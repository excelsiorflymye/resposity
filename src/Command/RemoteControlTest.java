package Command;

public class RemoteControlTest {
	public static void main(String[] args){
		SimpleRemoteControl remoteControl = new SimpleRemoteControl();
		Light light = new Light(null);
		LightOnCommand lightOnCommand = new LightOnCommand(light);
		
		remoteControl.setCommand(lightOnCommand);
		remoteControl.buttonWasPressed();
	}

}
