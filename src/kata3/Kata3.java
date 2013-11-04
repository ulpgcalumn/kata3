package kata3;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Kata3 {


   public static void main(String[] args) throws FileNotFoundException, IOException {
       Control control = new Control(args[0]);
       control.execute();
   }
}
