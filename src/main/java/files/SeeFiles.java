package files;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class SeeFiles {

    private List<String> lines = new ArrayList<>();

    public File loadFile(){
        String file = "C:\\myWorkspace\\My.DataStructure\\src\\test\\resources\\example1.log";
        File f = new File(file);
        return f;
    }

    public List<String> read_File_Into_List(File source) throws IOException {

        if( !source.exists() ){
            System.out.println("source doesn't exist!");
        }else{
            BufferedReader br = new BufferedReader(new FileReader(source));
            String str;
            while( (str = br.readLine()) != null ){
                lines.add(str);
            }
            for(String line : lines){
                System.out.println(line);
            }
            br.close();
        }
        return lines;
    }

    public List<String> read_Path_Into_List(String source) throws IOException {
        if( !source.isEmpty()){
            System.out.println("source doesn't exist!");
        }else{
            Path path = Paths.get(source);
            lines = Files.readAllLines(path);
        }

        return lines;
    }


    public void writeFile(List<String> data, File destination) throws IOException {
        if( data.isEmpty() ){
            System.out.println("data is empty!");
        }else{
            BufferedWriter bw = new BufferedWriter(new FileWriter(destination));
            for(String line : data){
                bw.write(line);
                bw.newLine();
            }

        }

    }

}
