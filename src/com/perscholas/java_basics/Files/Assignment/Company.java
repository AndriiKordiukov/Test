package com.perscholas.java_basics.Files.Assignment;

public class Company {


    private String index = ""; // read only
    private String organizationId = "";
    private String salesRepId = "";
    private String name = "";
    private String website = "";
    private String country = "";
    private String description = "";
    private String founded = "";
    private String industry = "";
    private String numberOfEmployees = "";

    public Company(String index,
                   String organizationId,
                   String salesRepId,
                   String name,
                   String website,
                   String country,
                   String description,
                   String founded,
                   String industry,
                   String numberOfEmployees) {
        this.index = index;
        this.organizationId = organizationId;
        this.salesRepId = salesRepId;
        this.name = name;
        this.website = website;
        this.country = country;
        this.description = description;
        this.founded = founded;
        this.industry = industry;
        this.numberOfEmployees = numberOfEmployees;
    }

    public Company(String[] dataArray) {
        this.index = dataArray[0];
        this.organizationId = dataArray[1];
        this.salesRepId = dataArray[2];
        this.name = dataArray[3];
        this.website = dataArray[4];
        this.country = dataArray[5];
        this.description = dataArray[6];
        this.founded = dataArray[7];
        this.industry = dataArray[8];
        this.numberOfEmployees = dataArray[9];
    }


    public Company(){}


    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public String getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }

    public String getSalesRepId() {
        return salesRepId;
    }

    public String getKeyParameter(){
        return salesRepId;
    }

    public void setSalesRepId(String salesRepId) {
        this.salesRepId = salesRepId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFounded() {
        return founded;
    }

    public void setFounded(String founded) {
        this.founded = founded;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public String getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(String numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }
}
