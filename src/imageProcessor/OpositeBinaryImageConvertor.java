package imageProcessor;

import java.awt.Color;
import java.io.File;

import util.Constant;

public class OpositeBinaryImageConvertor extends ImageProcessor{

	@Override
	protected void operatePixel(int indexOfRow, int indexOfColumn) {
		Color currentPixelColor = new Color(inputImage.getRGB(indexOfColumn, indexOfRow));
		int grayScale = (int) currentPixelColor.getRed();
		Color color;
		if (grayScale == 0)
			color = Constant.WHITE;

		else
			color = Constant.BLACK;
		outputImage.setRGB(indexOfColumn, indexOfRow, color.getRGB());
	}

	@Override
	protected void init() {
		imageFileName = "oposite_" + imageFileName;

	}

	public File getOpositBinaryImage(File inputImageFile) {
		return process(inputImageFile);
	}

}
