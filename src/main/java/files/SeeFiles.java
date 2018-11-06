package files;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SeeFiles {

    private List<String> lines = new ArrayList<>();

    public File loadFile(){
        String file = "C:\\myWorkspace\\My.DataStructure\\src\\test\\resources\\example1.log";
        File f = new File(file);
        return f;
    }
    public List<String> readFile(File source) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(source));
        String line;
        while( (line = br.readLine()) != null ){
            lines.add(line);
        }
        for(String string : lines){
            System.out.println(string);
        }
        br.close();
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

    public List<String> readFile(String source){
        Path path = Paths.get(source);
        try {
            lines = Files.readAllLines(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lines;
    }

    //todo: finish
    public void extractFromLog_listUserActionsOnCertainDay(String source, String email){
        String regex = "^\\w+@[a-zA-Z_]+?\\.[a-zA-Z]{2,3}$";
        LocalDate ld = LocalDate.now();

        for(String line : lines){
            //Pattern p = Pattern.compile(line);
            //Matcher m = p.matcher(regex);
            //if( ){
                String[] values = line.split(",");
                //if( values[0] == email && values[1] == ld.toString()){
                    System.out.println("actions: " + values[2]);
                //}
            //}
        }
    }
}
