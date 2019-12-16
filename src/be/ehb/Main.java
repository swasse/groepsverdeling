package be.ehb;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String[] namen = {"Dymas", "Jochem", "Talia", "Michael", "Egon", "Seppe", "Wouter", "David", "Steven", "Leander", "Amin", "Sabah"};
        ArrayList<String> namenLijst = new ArrayList<>(Arrays.asList(namen));

        Collections.shuffle(namenLijst);
        Collections.shuffle(namenLijst);

        try(FileWriter writer = new FileWriter("plakt.txt")){
            int length = namenLijst.size();
            for (int i = 0; i < length; i++){
                writer.write(namenLijst.get(i));
                writer.write("\n");
                if(i % 2 != 0){
                    writer.write("________\n");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
