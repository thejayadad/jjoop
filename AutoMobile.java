import java.util.ArrayList;
import java.util.Scanner;

public class AutoMobile {
    private String make;
    private  String model;
    private  String color;
    private int year;
    private int mileage;


    public AutoMobile(String make, String model, String color, int year, int mileage) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.year = year;
        this.mileage = mileage;

    }

    @Override
    public String toString(){
        String invetory = "";
        invetory = "Make: " + make + "| " + " Model: " + model + "| " + " Color: " + color + "| " +" Year: " + year + "| " + " Mileage: " + mileage + "\n";
        return invetory;

    }




    public String getMake() {
        return this.make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMileage() {
        return this.mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }






}
