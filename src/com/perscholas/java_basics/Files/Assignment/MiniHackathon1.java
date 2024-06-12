package com.perscholas.java_basics.Files.Assignment;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MiniHackathon1 {
    private final static String REGEX = ",(?=(?:[^\\\"]*\\\"[^\\\"]*\\\")*[^\\\"]*$)";
    private final static String PATH = "C:\\temp\\";
    private final static String company = "Company.csv";
    private final static String salesReps = "SalesReps.csv";

    public static void main(String[] args) throws IOException {

//        ArrayList<Company> companyFile = new ArrayList<>();
//        ArrayList<SalesReps> salesRepsFile = new ArrayList<>();
//        try {
//            companyFile = fileToCompanyList(company);
//            salesRepsFile = fileToSalesPersonList(salesReps);
//
//        } catch (IOException e) {
//            System.out.println("Error reading file");
//        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input Sales Persons Last name to get his company info: ");
        String lastName = scanner.nextLine();
        scanner.close();
        provideCompanyInfoBy(salesReps, company, lastName);
//        companyDataByName(lastName, companyFile, salesRepsFile);
    }

    private static void companyDataByName(String nameToFind,
                                          ArrayList<Company> companyFile,
                                          ArrayList<SalesReps> salesRepsFile) {
                // creating an object to find
        List<SalesReps> foundPerson =
                salesRepsFile.stream().
                filter(sr -> sr.getLastName().
                equals(nameToFind)).
                toList();

        System.out.println(foundPerson.size() + " Sales Persons found:\n");

        for (SalesReps fp : foundPerson) {
            System.out.println("Employee Name: " + fp.getFirstName() + " " + fp.getLastName());
            List<Company> companies = new ArrayList<>();

            companies = companyFile.stream().
                    filter(company -> company.
                    getSalesRepId().
                    equals(fp.getUserID())).
                    toList();
            for (Company foundCompany : companies) {
                System.out.println("Organization Id - " + foundCompany.getOrganizationId() + "\n" +
                        "Company Name - " + foundCompany.getName() + "\n" +
                        "Country - " + foundCompany.getCountry() + "\n" +
                        "Industry - " + foundCompany.getIndustry() + "\n" +
                        "Number of employees - " + foundCompany.getNumberOfEmployees()+
                        "\n=====================================================");
            }
            System.out.println();
        }
    }

    public static void provideCompanyInfoBy(String personFile,
                                            String companyFile,
                                            String lastName) throws IOException {

        ArrayList<SalesReps> foundPerson = findSalesPersonBy(personFile, lastName);
        ArrayList<Company> foundCompany = findCompanyBy(companyFile, foundPerson);

        for (int i = 0; i < foundPerson.size(); i++) {
            System.out.println("Employee Name: " + foundPerson.get(i).getFirstName() + " " + foundPerson.get(i).getLastName());
            System.out.println(foundCompany.size());
            System.out.println("Company information: \n" +
                    "Organization Id - " + foundCompany.get(i).getOrganizationId() + "\n" +
                    "Company Name - " + foundCompany.get(i).getName() + "\n" +
                    "Country - " + foundCompany.get(i).getCountry() + "\n" +
                    "Industry - " + foundCompany.get(i).getIndustry() + "\n" +
                    "Number of employees - " + foundCompany.get(i).getNumberOfEmployees()+
                    "\n=====================================================");
        }
    }

    public static ArrayList<Company> fileToCompanyList(String fileName) throws IOException {
        Scanner scanner = new Scanner(new File(PATH + fileName));
        ArrayList<Company> data = new ArrayList<>();
        while (scanner.hasNextLine()) {
            String[] line = scanner.nextLine().split(REGEX);
            var comp = new Company(line);
            data.add(comp);
        }
        scanner.close();
        return data;
    }

    public static ArrayList<SalesReps> fileToSalesPersonList(String fileName) throws IOException {
        Scanner scanner = new Scanner(new File(PATH + fileName));
        ArrayList<SalesReps> data = new ArrayList<>();
        while (scanner.hasNextLine()) {
            String[] line = scanner.nextLine().split(REGEX);
            var salesReps1 = new SalesReps(line);
            data.add(salesReps1);
        }
        scanner.close();
        return data;
    }

    public static ArrayList<SalesReps> findSalesPersonBy(String fileName, String lastName) throws IOException {
        Scanner scanner = new Scanner(new File(PATH + fileName));
        ArrayList<SalesReps> data = new ArrayList<>();
        while (scanner.hasNextLine()) {
            String[] line = scanner.nextLine().split(REGEX);
            if (line[2].equals(lastName)) {
                data.add(new SalesReps(line));
            }
        }
        System.out.println(data.size() + " Sales Persons found:\n");
        scanner.close();
        return data;
    }

    public static ArrayList<Company> findCompanyBy(String fileName, ArrayList<SalesReps> persons) throws IOException {
        var file = new File(PATH + fileName);
        Scanner scanner = new Scanner(file);
        ArrayList<Company> data = new ArrayList<>();
        int i = 0;

            while (scanner.hasNextLine() && i < persons.size()) {
            String[] line = scanner.nextLine().split(REGEX);

            if (line[2].equals(persons.get(i).getUserID())) {
                data.add(new Company(line));
                i++;
                scanner.reset();
                scanner = new Scanner(file);
                }
            }
        return data;
    }
}
