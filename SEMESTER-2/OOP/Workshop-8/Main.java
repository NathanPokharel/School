import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        try (
            BufferedReader in = new BufferedReader( new FileReader("input.csv"));
        ){
            String[] headers = in.readLine().trim().split(",");
            String line;
            while ((line = in.readLine()) != null){
                String[] parts = line.trim().split(",");
                for(int i = 0; i < headers.length -1 ; i++){
                    FileWriter out = new FileWriter(headers[i]+".txt",true);
                    out.write(parts[i]+"\n");
                    out.close();
                }
            }

        } catch (Exception e){
            System.out.println(e);
        }

    }
}

