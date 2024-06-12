package com.perscholas.java_basics.Files.GLAB;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ScanDelimiterdFile {

    private static String PATH = "C:\\temp\\";
    private static String FILE_NAME = "cars.csv";

    public static void main(String[] args) {

        ArrayList<String[]> lineData = new ArrayList<>();
        try {
            lineData = splitReadFile(FILE_NAME);
        } catch (IOException e) {
            System.out.println("Error reading file");
        }
        printDataByLines(lineData);
    }

    private static void printDataByLines(ArrayList<String[]> lineData) {
        for (String[] line : lineData) {
            //System.out.println(line[0] + "|" + line[1] + "|" + line[2] + "|" + line[3]  + line[4] + "|" + line[5] + "|" + line[6] + "|" + line[7] + "|" + line[8]);
            System.out.println("Car Name :" + line[0] );
            System.out.println("MPG :" + line[1] );
            System.out.println("Cylinder :" + line[2] );
            System.out.println("Displacement :" + line[3]);
            System.out.println("Horsepower :" + line[4]);
            System.out.println("Weight :" + line[5]);
            System.out.println("Acceleration :" + line[6]);
            System.out.println("Model :" + line[7]);
            System.out.println("Origin :" + line[8]);
            System.out.println("===============================");
        }
    }

    public static ArrayList<String[]> splitReadFile(String fileName) throws IOException {
        Scanner scanner = new Scanner(new File(PATH + fileName));
        ArrayList<String[]> data = new ArrayList<String[]>();
        while (scanner.hasNextLine()) {
            // data.add(scanner.nextLine().split(","));
            String[] line = scanner.nextLine().split(",");
            data.add(line);
        }
        return data;
    }
}
