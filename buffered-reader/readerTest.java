/* readerTest.java tests to see if you can write a method
 * with a BufferedReader object as an argument
 * Written for the SHS2 project.
 */

import java.io.*;
import java.util.*;

public class readerTest {
	public static void doThings(BufferedReader in) {
		try {
			System.out.println(in.readLine());
		} catch (IOException iox) {
			System.out.println("Error reading file.");
		}
	}

	public static void main(String[] args) {
		try {
			BufferedReader t1 = new BufferedReader(new FileReader("test1.txt"));
			BufferedReader t2 = new BufferedReader(new FileReader("test2.txt"));

			doThings(t1);
			doThings(t2);
		} catch (FileNotFoundException fnfx) {
			System.out.println("File not found.");
		}
	}
}