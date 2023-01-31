import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;
import java.io.File;
import java.io.FileReader;



public class FileTests {
    @Test 
	public void testGetFiles() {
        File a = new File("some-files/more-files/b.txt");
        File b = new File("some-files/more-files/c.java");
        List<File> expected = new ArrayList<File>();
        expected.add(a);
        expected.add(b);
        assertEquals(expected, FileExample.getFiles(new File("some-files/more-files")));
	}
}
