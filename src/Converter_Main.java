import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by Joshua on 28.12.2016.
 */
public class Converter_Main {
    public static void main (String[] args)
    {
        BufferedReader reader = null;

        try {
            File file = new File("C:\\Users\\Joshua\\Documents\\Beispieldateien\\Beispiel DESADV D96A.edi");
            reader = new BufferedReader(new FileReader(file));

            String line;
            String data="";
            while ((line = reader.readLine()) != null) {
                data+=line;
            }
            int i = 0;
            String[] splitted_data = data.split("'");
            for (String s:splitted_data
                 ) {
                i++;
                System.out.println("Element "+i+": "+s);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        // Ausgabe Hello World!
        System.out.println(Convert_Strings.getDefinition("DTM","3"));
        System.out.println("Hello World!");
    }
}
