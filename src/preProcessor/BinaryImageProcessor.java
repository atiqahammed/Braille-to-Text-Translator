package preProcessor;

import java.awt.Color;
import java.io.File;

public class BinaryImageProcessor extends ImageProcessor{

	private int threshold;

	@Override
	protected void writePixel(int x, int y) {
		Color c = new Color(image.getRGB(y, x));
		int grayScale = (int) c.getRed();
		Color color;
		if (grayScale < threshold) {
			color = new Color(0, 0,  0);
		}

		else {
			color = new Color(255, 255, 255);
		}
		//Color newColor = new Color(red + green + blue, red + green + blue, red + green + blue);
		image.setRGB(y, x, color.getRGB());

	}

	@Override
	protected void initializedPreOperation() {
		imageFileName = "Binary_Image_" + imageFileName;

	}

	public File getBinaryImage(File imageFile, int theshold) {
		this.threshold = theshold;


		return convert(imageFile);
	}

}
