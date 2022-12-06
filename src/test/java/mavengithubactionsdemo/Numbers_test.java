/**
 * 
 */
package mavengithubactionsdemo;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;



/**
 * @author 35386
 *
 */
public class Numbers_test {

	/**
	 * Test method for {@link mavengithubactionsdemo.App#main(java.lang.String[])}.
	 */
	@Test
	public void testMain() {
		final ByteArrayOutputStream outContent = new
				ByteArrayOutputStream();
				System.setOut(new PrintStream(outContent)); 
				//make the output go to a stream instead of
				//the console
				App.main(null); //call main in the App file
				//check if the output is "Hello ATU!" and a new line. 
				assertEquals("smallest" + System.getProperty("line.separator"),outContent.toString());

	}

	


}
