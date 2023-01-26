import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner scanner = new Scanner(new File("src/OOE_Beliebteste_Vornamen_seit_2010.csv"));

        //AT31;2018;2;19;Julia;87;;;;;;
        while (scanner.hasNextLine()) {

            String line = scanner.nextLine();
            String[] beliebtesteVornamen = line.split(";");
            String date = beliebtesteVornamen[1];
            String name = beliebtesteVornamen[4];
            String gender = beliebtesteVornamen[2];
            int rank = parseInt(beliebtesteVornamen[3]);
            int count = parseInt(beliebtesteVornamen[5]);
            HashMap<String , String> beliebteVornamen = new HashMap<String, String>();
            //ArrayList<String> beliebteVornamen = new ArrayList<String>();
            ArrayList<String> namenInformation = new ArrayList<String>();

            namenInformation.add(name + " (Geschlecht: " + gender + " Reihung: " + rank + " Anzahl: " + count + " ) ");
            beliebteVornamen.put(date, namenInformation.toString());
            System.out.println(beliebteVornamen.get("2017"));
            p = new Population(name, gender, rank, count);
            year_names.putIfAbsent(year, new ArrayList<Population>());
            year_names.get(year).add(p);


        }
        scanner.close();

    }
}