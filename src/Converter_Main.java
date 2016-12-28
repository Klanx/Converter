import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

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
                ArrayList<String> element_splitted = splitter(s);
                System.out.println();
                for (String s2:element_splitted
                     ) {
                    System.out.print("|"+s2);
                }
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
        System.out.println(Convert_Strings.getDefinition("UNH","0"));
        System.out.println("Hello World!");
    }

    public static ArrayList<String> splitter(String input){
        ArrayList<String> output = new ArrayList<>();
        String[] splitarray_outter; // Used for splitting the elements with :
        String[] splitarray_inner; // Userd for splitting the elements with +
        splitarray_outter = input.split(":");
        for (String s1:splitarray_outter
             ) {
            splitarray_inner=s1.split("\\+");
            for (String s2:splitarray_inner
                 ) {
                output.add(s2);
            }
        }

        return output;

    }
}
