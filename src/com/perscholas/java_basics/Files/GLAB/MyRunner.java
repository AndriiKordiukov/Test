package com.perscholas.java_basics.Files.GLAB;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class MyRunner {

    private static String PATH = "C:\\temp\\";
    private static String FILE = "CourseData.csv";
    
    public static void main(String[] args) throws FileNotFoundException {
        formatingFile(PATH,FILE);
    }

    private static void formatingFile(String path, String fileName) throws RuntimeException {
        try {
            File file = new File(PATH+FILE);
            printingData(getCourses(file));
        } catch (FileNotFoundException e) {
            System.out.println("File not found! ");
            e.printStackTrace();
        }
    }

    private static ArrayList<Course> getCourses(File file) throws FileNotFoundException {
        Scanner input = new Scanner(file);
        ArrayList<Course> data = new ArrayList<Course>();

        while (input.hasNextLine()) {
            String[] splitedLine = input.nextLine().split(",");
            Course cObj = new Course();
            cObj.setCode(splitedLine[0]);
            cObj.setCourse_name( splitedLine[1]);
            cObj.setInstructor_name(splitedLine[2]);
            data.add(cObj);
        }
        return data;
    }

    private static void printingData(ArrayList<Course> data) {
        for (Course c : data) {
            System.out.println("==========================================================");
            System.out.println(c.getCode() + " | " + c.getCourse_name() + " | " + c.getInstructor_name());
        }   System.out.println("==========================================================");
    }
}
