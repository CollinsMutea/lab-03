package com.example.listycitylab3;

public class City {
    private String name = "";
    private String province = "";

    public City(String name, String province) {
        this.name = name;
        this.province = province;
    }

    public String getProvince() {
        return province;
    }

    public String getName() {
        return name;
    }

    //Add setters to your City class so that you can modify its name and province.
    public void setName(String name) {
        this.name = name;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    // make a constructor for the Fragment that takes in a City, and store the City in the Fragment as an instance variable
    public static void main(String[] args) {
        City city = new City(System.in.toString(), System.in.toString());

    }
}
