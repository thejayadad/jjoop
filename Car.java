public class Car {


    private String make;
    private String model;
    private int year;

    public Car(String make, String model, int year){
        this.make = make;
        this.model = model;
        this.year = year;
    }

    String make(){
        return this.make;
    }
    String model(){
        return this.model;
    }
    int year(){
        return this.year;
    }

    @Override
    public String toString(){
        String info = "";
        info = "make: " + make + " model: " + model + " year: " + year + "|";
        return info;
    }


}
