package me.geesy.util;

import java.io.*;

public class IO {
    public static void writeStringToFile(String fileName, String item) throws IOException {

            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
            writer.write(item);

            writer.close();
        }

    public static void writeFloatToFile(String fileName, Float item) throws IOException {

        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
        writer.write(item.toString());

        writer.close();
    }

    public static void readFile(String fileName) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
        reader.close();
    }

    public static void readInt(String fileName, int item) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
        reader.close();
    }


}
