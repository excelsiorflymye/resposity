package Registry;

import java.awt.Frame;
import java.net.URL;


public class ImageProxyTestDrive {
	private static final URL InitialURL = null;
	ImageComponet imageComponent;
	public static void main(String[] args) throws Exception{
		ImageProxyTestDrive testDrive = new ImageProxyTestDrive();
	}

	public ImageProxyTestDrive() throws Exception{
		Icon icon = new ImageProxy(InitialURL);
		imageComponent = new ImageComponet();
		frame.getContentPane().add(imageComponent);
	}
}
