package com.perscholas.java_basics.Files.Assignment;


import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Scanner;

public class MiniHackathonVer2 {
    private final static String REGEX = ",(?=(?:[^\\\"]*\\\"[^\\\"]*\\\")*[^\\\"]*$)";
    private final static String PATH = "C:\\temp\\";
    private final static String company = "Company.csv";
    private final static String salesReps = "SalesReps.csv";

    public static void main(String[] args) throws IOException {

        findInformation();

    }

    private static void findInformation() throws IOException {
        Scanner scanner = new Scanner(System.in);
        printChooseNumber();
        int x = Integer.valueOf(scanner.nextLine());

        int y = getConstructorParameterCount(SalesReps.class);
        while (x < 1 || x > y) { // parameters to look by
            System.out.println("Invalid input. Please try again.");
            printChooseNumber();
            x = Integer.valueOf(scanner.nextLine());
        }
            String findBy = switch (x) {
                case 1 -> "userID";
                case 2 -> "firstName";
                case 3 -> "lastName";
                case 4 -> "email";
                case 5 -> "phone";
                case 6 -> "dateOfBirth";
                default -> "";
            };

        System.out.println("\n Input '" + findBy + "' key to find related info:");



        String keyword = scanner.nextLine();
        while (keyword.isEmpty()) {
            keyword = scanner.nextLine();
        }

        provideCompanyInfoBy(salesReps, company, keyword, x);
        scanner.close();
    }

    private static void printChooseNumber() {
        System.out.println("Choose how do you want to look for company information:\n"+
                "1 - By User ID (15 characters)\n"+
                "2 - By First Name\n"+
                "3 - By Last Name\n"+
                "4 - By Email address\n"+
                "5 - By Phone Number\n"+
                "6 - By Date of Birth (YYYY-MM-DD)\n");
    }

    public static void provideCompanyInfoBy(String personFile,
                                            String companyFile,
                                            String keyword,
                                            int keywordType) throws IOException {

        ArrayList<SalesReps> foundPerson = findSalesPersonBy(personFile, keyword, keywordType);
        ArrayList<Company> foundCompany = findCompanyBy(companyFile, foundPerson);
        System.out.println("================================================");
        int j = 0;
        for (int i = 0; i < foundPerson.size(); i++) {
            while(j < foundCompany.size() &&
                    foundPerson.get(i).getUserID().equals(foundCompany.get(j).getSalesRepId())) {
                System.out.println("Employee Name: " + foundPerson.get(i).getFirstName() +
                                   " " + foundPerson.get(i).getLastName());
                System.out.println("--- Company information ---\n" +
                        "Organization Id - " + foundCompany.get(j).getOrganizationId() + "\n" +
                        "Company Name - " + foundCompany.get(j).getName() + "\n" +
                        "Country - " + foundCompany.get(j).getCountry() + "\n" +
                        "Industry - " + foundCompany.get(j).getIndustry() + "\n" +
                        "Number of employees - " + foundCompany.get(j).getNumberOfEmployees() +
                        "\n================================================");
                j++;
            }
        }
    }

    public static ArrayList<SalesReps> findSalesPersonBy(String fileName,
                                                         String keyword,
                                                         int keywordType) throws IOException {
            Scanner scanner = new Scanner(new File(PATH + fileName));
            ArrayList<SalesReps> data = new ArrayList<>();
            while (scanner.hasNextLine()) {
                String[] line = scanner.nextLine().split(REGEX);
                if (line[keywordType-1].equals(keyword)) {
                    data.add(new SalesReps(line));
                }
            }
            System.out.println("\n" + data.size() + " Sales Persons found");
            scanner.close();
            return data;
        }

    public static ArrayList<Company> findCompanyBy(String fileName,
                                                   ArrayList<SalesReps> persons) throws IOException {
            var file = new File(PATH + fileName);
            Scanner scanner = new Scanner(file);
            ArrayList<Company> data = new ArrayList<>();

            for (int i = 0; i < persons.size(); i++) {
            while (scanner.hasNextLine()) {
                String[] line = scanner.nextLine().split(REGEX);

                if (line[2].equals(persons.get(i).getUserID()))
                    data.add(new Company(line));
            }
                scanner.reset();
                scanner = new Scanner(file);
            }
        System.out.println("\n" + data.size() + " Companies found\n");
            scanner.close();
        return data;
    }

    /**
     * Counts number of parameters in the constructor of a given class.
     *
     * @param clazz The class for which to count the number of constructor parameters.
     * @return The number of constructor parameters.
     */
    public static int getConstructorParameterCount(Class<?> clazz) {
        Constructor<?>[] constructors = clazz.getConstructors();
        if (constructors.length > 0) {
            return constructors[0].getParameterCount();
        } else {
            return 0;
        }
    }
}
