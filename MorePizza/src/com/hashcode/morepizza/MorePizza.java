package com.hashcode.morepizza;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class MorePizza {
    public static void main(String args[]) throws IOException {

        /**
         * TODO: This can be utilized later to read all dataset files at once.

        File directory = new File("src\\resources");
        File[] files = directory.listFiles();

        for(File file : files) {
            System.out.println(file.toString());
        }*/

        var fileName = "src/resources/a_example";
        String data = Files.readString(Paths.get(fileName));
        String[] inputLines = data.split("\n");

        /** Capture the first input line details */
        String totalNumbersString = inputLines[0];
        String[] totalNumbers = totalNumbersString.split(" ");

        /** Capture the total number of Pizzas and number of teams by member count */
        int totalPizzas = Integer.valueOf(totalNumbers[0]);
        int noOf2PersonTeams = Integer.valueOf(totalNumbers[1]);
        int noOf3PersonTeams = Integer.valueOf(totalNumbers[2]);
        int noOf4PersonTeams = Integer.valueOf(totalNumbers[3]);

        Map<Integer, List<String>> ingredientByPizza = new HashMap<>();
        /** Capture number of ingredients for each type of Pizza */
        for(int i = 1; i <= totalPizzas; i++) {
            String ingredientString = inputLines[i];
            List<String> ingredients = List.of(ingredientString.split(" "));
            ingredientByPizza.put(i, ingredients);
        }

        /** Just to verify the contents of the map

        for (Map.Entry<Integer,List<String>> entry : ingredientByPizza.entrySet())
            System.out.println("Key = " + entry.getKey() +
                    ", Value = " + entry.getValue().toString());*/
    }
}
