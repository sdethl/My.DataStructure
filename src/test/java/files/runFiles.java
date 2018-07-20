package files;

import org.junit.Test;

import java.io.*;
import java.util.List;

public class runFiles {

    @Test
    public void testFiles() throws IOException {
        SeeFiles sf = new SeeFiles();
        List<String> lines = sf.read_File_Into_List(sf.loadFile());
        sf.writeFile(lines, new File("C:\\myWorkspace\\My.DataStructure\\src\\test\\resources\\exampleOutput.log"));

    }
}
