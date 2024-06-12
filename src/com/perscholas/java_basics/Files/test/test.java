package com.perscholas.java_basics.Files.test;

import java.io.*;

public class test {
    private static final String PATH = "C:\\Users\\Home\\Desktop\\Горшок\\Ads";
    private static String fileName = "\\tegs.txt";
    private static String newFileName = "\\tegsNew.txt";
    public static void main(String[] args) throws FileNotFoundException {

        File dir = new File(PATH);
        System.out.println(dir.isDirectory() + " | Directory name - " + dir.getName());

        // Reading file

        byte[] bytes = readFromFile(fileName);
        System.out.println("Содержимое файла: " + new String(bytes));

        // Copy file

        copyFile(fileName, newFileName, true);


/*        File[] files = dir.listFiles();

        for (File file : files) {
            System.out.print(file.getName());
            if (file.isDirectory())
                System.out.println(" - Folder");
            else
                System.out.println(" - File");
        }*/
    }

    private static void copyFile(String fileToCopyName, String newFileName, boolean print) {
        var fileToCopy = new File(PATH+fileName);
        var createNewFile = new File(PATH+newFileName);
        try (OutputStream os = new FileOutputStream(createNewFile)) {

            if(createNewFile.createNewFile())
            os.write(readFromFile(fileToCopyName));
            else
                System.out.println("File already exists");
            if (print == true)
                System.out.println("Содержимое нового файла: " + new String(readFromFile(newFileName)));
        } catch (IOException e) {
            System.out.println("Не получилось создать файл в данной папке");
        }
    }

    private static byte[] readFromFile(String fileName) {

        var fileRead = new File(PATH+fileName);

        byte[] bytes = new byte[(int) fileRead.length()];

        try (InputStream is = new FileInputStream(fileRead)){

            is.read(bytes);

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Ошибка чтения файла");
        }
        return bytes;
    }
}
