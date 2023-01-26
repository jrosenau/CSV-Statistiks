import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner scanner = new Scanner(new File("src/OOE_Beliebteste_Vornamen_seit_2010.csv"));
        HashMap<Integer , String> beliebteVornamen = new HashMap<Integer, String>();
        //ArrayList<String> beliebteVornamen = new ArrayList<String>();
        ArrayList<String> namenInformation = new ArrayList<String>();
        //AT31;2018;2;19;Julia;87;;;;;;
        while (scanner.hasNextLine()) {

            Population p = null;
            String line = scanner.nextLine();
            String[] beliebtesteVornamen = line.split(";");
            int date = parseInt(beliebtesteVornamen[1]);
            String name = beliebtesteVornamen[4];
            String gender = beliebtesteVornamen[2];
            int rank = parseInt(beliebtesteVornamen[3]);
            int count = parseInt(beliebtesteVornamen[5]);


            namenInformation.add(name + " (Geschlecht: " + gender + " Reihung: " + rank + " Anzahl: " + count + " ) ");
            beliebteVornamen.put(date, namenInformation.toString());
            System.out.println(beliebteVornamen.get("2017"));
            p = new Population(name, gender, count, rank);

            beliebteVornamen.putIfAbsent(date, new ArrayList<Population>());
            beliebteVornamen.get(date).add(p);


        }
        scanner.close();

    }
}