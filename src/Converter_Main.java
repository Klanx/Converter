import java.io.*;
import java.util.ArrayList;

/**
 * Created by Joshua on 28.12.2016.
 */
public class Converter_Main {
    public static void dosomething(){
        BufferedReader reader = null;
        try {
            //getting the File and load the text into one String
            File file = new File("C:\\Users\\Joshua\\Documents\\Beispieldateien\\Beispiel DESADV D96A.edi");
            reader = new BufferedReader(new FileReader(file));
            String line;
            String data="";
            while ((line = reader.readLine()) != null) {
                if (line!=""){
                    data += line;
                }
            }
            //--
            String definition = "";//Used for the definition of the Segments
            String[] splitted_data = data.split("'");//The segements of the Message seperated by '
            for (String s:splitted_data
                 ) {        //go trough each of the segments
                ArrayList<String> element_splitted = splitter(s);//split the segment into single segments(remove ; and +)
                System.out.println("");
                switch(element_splitted.get(0)){ //check if there are sub-groups and get the specific definition
                    case "DTM":
                    case "RFF":
                    case "QTY":
                    case "NAD":
                    case "GIN":
                            definition=(Convert_Strings.getDefinition(element_splitted.get(0),element_splitted.get(1)));
                        break;
                    default:
                        definition=(Convert_Strings.getDefinition(element_splitted.get(0),"0"));//Segments without sub-groups only have the group 0
                }
                System.out.printf("%-50s",definition);//Prints out the definintion and applies a format
                for (String s2:element_splitted
                     ) {    //Printing out the single Elements

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

        return output;//Returns an array list with each part as an own Segment, e.g PCI+17 is now [PCI,17]

    }
}
