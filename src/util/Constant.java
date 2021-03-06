package util;

import java.awt.Color;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import dataStructure.Letters;
import dictonary.BanglaDictonary;
import fileManager.FileWithPrintWriter;
import imageProcessor.BinaryImageConvertor;
import imageProcessor.GrayScale;
import imageProcessor.ImageProcessor;
import imageProcessor.MedianFilter;
import imageProcessor.OpositeBinaryImageConvertor;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import preProcessor.OtsuThresholding;
import test.FileReadWriter;

public class Constant {

	public static final String BRAILLE_TO_TEXT_TRANSLATOR = "Bengali Braille to Text Translator";
	public static final String OUTPUT_FILE_NAME = "output.txt";
	public static final String SEETING_FILE_NAME = "Settings.file";
	public static final String OUTPUT_IMAGE_FILE_NAME = "output";
	public static final String OUTPUT_IMAGE_FILE_TYPE = "jpg";
	public static final String IMAGE_PATTERN = "([^\\s]+(\\.(?i)(jpg|png|jpeg))$)";

	public static boolean GAUSSIAN_BLUR;
	public static boolean MEDIAN_BLUR;
	public static Parent SETTING_UI;

	public static int NEIGHBOUR_DOT_SIZE_FOR_PART_OF_DOT_SELECTION = 3;
	public static int INITAL_DIFFRENCE_BETWEEN_LINE = 8;
	public static int SAME_POINT_COVERAGE = 15;
	public static int MAXIMUM_DISTANCE = 15;
	public static int LINE_INDEX_MERGED_UNIT = 1;
	public static int DIFFERENCE_BETWEEN_WORDS = 100;
	public static int DIFFERENCE_BETWEEN_LINE = 10;

	public static Color WHITE = new Color(255, 255, 255);
	public static Color BLACK = new Color(0, 0, 0);
	public static Color RED = new Color(255, 0, 0);
	public static Color GREEN = new Color(0, 255, 0);
	public static Color BLUE = new Color(0, 0, 255);
	public static Color YELLOW = new Color(255, 255, 0);

	public static ImageProcessor GRAY_SCALE_IMAGE_PROCESSOR = new GrayScale();
	public static OtsuThresholding OTSU_SHRESHOLDER = new OtsuThresholding();
	public static BinaryImageConvertor BINARY_IMAGE_CONVERTOR = new BinaryImageConvertor();
	public static MedianFilter MEDIAN_FILTER = new MedianFilter();
	public static OpositeBinaryImageConvertor OPOSITE_BINARY_CONVERTOR = new OpositeBinaryImageConvertor();

	public static Functions FUNCTIONS = new Functions();
	public static Letters LETTERS = new Letters();

	public static FileWithPrintWriter FILE_WRITER;

	public static int IMAGE_HEIGHT = 0;
	public static int IMAGE_WEIDTH = 0;
	public static String IMAGE_FILE_NAME = "image";
	public static String IMAGE_FILE_TYPE = "abc";

	public static ArrayList<ArrayList<Color>> IMAGE_ARRAY_OF_PIXEL = null;
	public static ArrayList<String> OUTPUT_LIST = new ArrayList<String>();
	public static FileReadWriter FILE_READ_WRITER = new FileReadWriter();
	public static BanglaDictonary BANGLA_DICTIONARY = new BanglaDictonary();
	
	public static boolean IS_BENGALI_SELECTED = true;

}
