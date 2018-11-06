package files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CompareFiles {


    //todo: what if there are blank lines between lines
    public boolean areFilesEqual(String file1, String file2) throws IOException
    {
        BufferedReader reader1 = new BufferedReader(new FileReader(file1));
        BufferedReader reader2 = new BufferedReader(new FileReader(file2));
        String line1 = reader1.readLine();
        String line2 = reader2.readLine();

        boolean areEqual = true;
        int lineNum = 1;

        while (line1 != null || line2 != null){
            if(line1 == null || line2 == null){
                areEqual = false;
                break;
            }
            else if(! line1.equalsIgnoreCase(line2)){
                areEqual = false;
                break;
            }
            line1 = reader1.readLine();
            line2 = reader2.readLine();
            lineNum++;
        }

        if(areEqual){
            System.out.println("Two files have same content.");
        }else{
            System.out.println("Two files have different content. They first differ at line "+lineNum);
            System.out.println("File1 has "+line1+" and File2 has "+line2+" at line "+lineNum);
        }
        reader1.close();
        reader2.close();
        return areEqual;
    }

    public boolean areFilesEqual2(String path1, String path2){
        File file1 = new File(path1);
        File file2 = new File(path2);
        return file1.equals(file2);
    }
}
