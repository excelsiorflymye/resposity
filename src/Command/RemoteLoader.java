package Command;

public class RemoteLoader {
	public static void main(String[] args){
		RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();
		
		Light livingRoomLight = new Light("living room");
		Light kitchenLight = new Light("kitchen room");
		Stereo stereo = new Stereo("living Room");
	 
		LightOnCommand livingroomLightOn = new LightOnCommand(livingRoomLight);
		LightOffCommand livingroomLightOff = new LightOffCommand(livingRoomLight); 
		
		LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
		LightOffCommand kitchenLightOffCommand = new LightOffCommand(kitchenLight);

		StereoOnWithCDCommand stereoOnWithCDCommand = new StereoOnWithCDCommand(stereo);
		StereoOffWithCDCommand stereoOffWithCDCommand = new StereoOffWithCDCommand(stereo);
		

		remoteControl.setCommand(0, livingroomLightOn, livingroomLightOff);
		remoteControl.setCommand(1, kitchenLightOn,kitchenLightOffCommand);
		remoteControl.setCommand(2, stereoOnWithCDCommand, stereoOffWithCDCommand);
		
	//	System.out.println(remoteControl);
		
		remoteControl.onButtonWasPushed(0);
		remoteControl.offButtonWasPushed(0);
		System.out.println("undo before + " + remoteControl);
		
		remoteControl.undoButtonWasPushed();
		System.out.println("undo after + " + remoteControl);
		
		remoteControl.onButtonWasPushed(1);
		remoteControl.offButtonWasPushed(1);
		
		
		remoteControl.onButtonWasPushed(2);
		remoteControl.offButtonWasPushed(2);
	}
}
