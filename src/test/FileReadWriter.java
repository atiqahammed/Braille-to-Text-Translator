package test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.util.ArrayList;

public class FileReadWriter {

	private ArrayList<String> allStrings;



	public ArrayList<String> readStringsFromFile(String fileName) {

		allStrings = new ArrayList<>();

		try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
			String sCurrentLine;
			while ((sCurrentLine = br.readLine()) != null) {
				allStrings.add(sCurrentLine);
			}
		} catch (IOException e) {
			System.out.println("file reading problm in FileReadWriter class");
		}

		System.out.println("File reading completed");
		return allStrings;
	}

	public void writeOutput(ArrayList<String> allOutput, String fileName) {
		// previous code
		/*
		 * FileWriter fileWriter = null; try { fileWriter = new FileWriter(fileName); }
		 * catch (IOException e) { System.out.println("problem in file writing"); }
		 * PrintWriter printWriter = new PrintWriter(fileWriter);
		 * 
		 * for (String data : allOutput) { printWriter.println(data); }
		 * 
		 * printWriter.close(); System.out.println("file wriing completed");
		 */
		
		Writer out = null;
		try {
			out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileName), "UTF-8"));
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			try {
			    
			    for(String line : allOutput) {
			    	try {
						out.write(line + "\n");
					} catch (IOException e) {
						e.printStackTrace();
					}
			    }
			    
			} finally {
			    try {
					out.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

	}



	public void appendInFile(String fileName, String textToAppend) {
		File file = new File(fileName);
		FileWriter fr = null;
		try {
			fr = new FileWriter(file, true);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("file not found to append");
		}
		BufferedWriter br = new BufferedWriter(fr);
		PrintWriter pr = new PrintWriter(br);
		pr.println(textToAppend);
		pr.close();
		try {
			br.close();
		} catch (IOException e) {
			System.out.println("Could not close buffer writer");
			e.printStackTrace();
		}
		try {
			fr.close();
		} catch (IOException e) {
			System.out.println("Could not close");
			e.printStackTrace();
		}
	}

	public void appendInFile(String fileName, ArrayList<String> textListToAppend) {
		File file = new File(fileName);
		FileWriter fr = null;
		try {
			fr = new FileWriter(file, true);
		} catch (IOException e) {

			System.out.println("file not found to append");
		}
		BufferedWriter br = new BufferedWriter(fr);
		PrintWriter pr = new PrintWriter(br);

		for(String str: textListToAppend)
			pr.println(textListToAppend);

		pr.close();
		try {
			br.close();
		} catch (IOException e) {
			System.out.println("Could not close buffer writer");
			e.printStackTrace();
		}
		try {
			fr.close();
		} catch (IOException e) {
			System.out.println("Could not close");
			e.printStackTrace();
		}
	}

}
