

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TwoDimRaggedArrayUtilitySTUDENT_Test {
	//STUDENT fill in dataSetSTUDENT with values, it must be a ragged array
	private double[][] dataSetSTUDENT = {{0,0,0},{0,0},{0,0,0,0}};
;
	
	private File inputFile,outputFile;
	private double[][] dataSet1 = {{-1,4,-20},{-2,-9},{3,-9,8,-10}};
	private double[][] dataSet3 = {{10.02,5.9,3.2},{4.001,5.3},{6.0007,7.0223,8.40,9.2}};


	@Before
	public void setUp() throws Exception {
		outputFile = new File("TestOut.txt");
	}

	@After
	public void tearDown() throws Exception {
		dataSetSTUDENT = null;
		dataSet1 = null;
		dataSet3 = null;
		inputFile = outputFile = null;
	}

	/**
	 * Student Test getTotal method
	 * Return the total of all the elements in the two dimensional array
	 */
	@Test
	public void testGetTotal() {
//		fail("Student testGetTotal not implemented");	
		assertTrue(TwoDimRaggedArrayUtility.getTotal(dataSet1) == -36);
		assertTrue(TwoDimRaggedArrayUtility.getTotal(dataSetSTUDENT) == 0);
		assertTrue(TwoDimRaggedArrayUtility.getTotal(dataSet3) == 59.044);
		}

	/**
	 * Student Test getAverage method
	 * Return the average of all the elements in the two dimensional array
	 */
	@Test
	public void testGetAverage() {
//		fail("Student testGetAverage not implemented");
		assertEquals(-4, TwoDimRaggedArrayUtility.getAverage(dataSet1), .001);
		assertEquals(0, TwoDimRaggedArrayUtility.getAverage(dataSetSTUDENT), .001);
		assertEquals(6.5604, TwoDimRaggedArrayUtility.getAverage(dataSet3), .001);

	}

	/**
	 * Student Test getRowTotal method
	 * Return the total of all the elements of the row.
	 * Row 0 refers to the first row in the two dimensional array
	 */
	@Test
	public void testGetRowTotal() {
//		fail("Student testGetRowTotal not implemented");
		assertEquals(0, TwoDimRaggedArrayUtility.getRowTotal(dataSetSTUDENT, 1),.001);
		assertEquals(-17, TwoDimRaggedArrayUtility.getRowTotal(dataSet1, 0),.001);
		assertEquals(30.623, TwoDimRaggedArrayUtility.getRowTotal(dataSet3, 2),.001);
	}


	/**
	 * Student Test getColumnTotal method
	 * Return the total of all the elements in the column. If a row in the two dimensional array
	 * doesn't have this column index, it is not an error, it doesn't participate in this method.
	 * Column 0 refers to the first column in the two dimensional array
	 */
	@Test
	public void testGetColumnTotal() {
//		fail("Student testGetColumnTotal not implemented");
		assertEquals(0, TwoDimRaggedArrayUtility.getColumnTotal(dataSet1, 0),.001);
		assertEquals(0, TwoDimRaggedArrayUtility.getColumnTotal(dataSetSTUDENT, 2),.001);
		assertEquals(18.2223, TwoDimRaggedArrayUtility.getColumnTotal(dataSet3, 1),.001);
	}


	/**
	 * Student Test getHighestInArray method
	 * Return the largest of all the elements in the two dimensional array.
	 */
	@Test
	public void testGetHighestInArray() {
//		fail("Student testGetHighestInArray not implemented");
		assertEquals(8, TwoDimRaggedArrayUtility.getHighestInArray(dataSet1), .001);
		assertEquals(0, TwoDimRaggedArrayUtility.getHighestInArray(dataSetSTUDENT), .001);
		assertEquals(10.02, TwoDimRaggedArrayUtility.getHighestInArray(dataSet3), .001);

	}
	

	/**
	 * Test the writeToFile method
	 * write the array to the outputFile File
	 * then read it back to make sure formatted correctly to read
	 * 
	 */
	@Test
	public void testWriteToFile() {
		double[][] array= {{0,8,0},{-5,10},{12.3,-4,22,1.1}};
//		int character;
//		fail("Student testWriteToFile not implemented");
		TwoDimRaggedArrayUtility.writeToFile(array, outputFile);
		TwoDimRaggedArrayUtility.readFile(outputFile);
//		try {
//			FileReader reader = new FileReader(outputFile);
//			while ((character = reader.read()) != -1) {
//                System.out.print((char) character);
//            }
//			reader.close();
//		} catch (IOException e) {
//            e.printStackTrace();
//        }

	}

}