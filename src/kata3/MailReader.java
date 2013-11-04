package kata3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class MailReader {
    public static ArrayList<String> readMail(String filename) throws FileNotFoundException, IOException{
        ArrayList<String> list;
        list = new ArrayList<>();
        
        BufferedReader reader = new BufferedReader (new FileReader(new File(filename)));
        while(true){
            String mail = reader.readLine();
            if(mail == null) break;
            if (!mail.contains("@")) continue;
            list.add(mail.split("@")[1].toLowerCase());
        }
        return list;
   }
}
