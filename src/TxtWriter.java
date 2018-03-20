import java.io.FileWriter;
import java.io.IOException;

public class TxtWriter {
    public static void main(String[] args) {
        try
        {
            int a = 2 + 2;
            String log = "log.txt";
            FileWriter fw = new FileWriter(log, true);
            fw.append(Integer.toString(a));
            fw.append(System.getProperty("line.separator"));
            fw.close();
        }
        catch(IOException ioe)
        {
            System.err.println("IOException: " + ioe.getMessage());
        }
    }
}
