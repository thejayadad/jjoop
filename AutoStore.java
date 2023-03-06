import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class AutoStore {

    private static Scanner scan = new Scanner(System.in);



    public static void main(String[] args) {
        ArrayList<AutoMobile> newInvetory = new ArrayList<>();
        newInvetory.add(new AutoMobile("Dodge", "Challenger", "Silver", 2010, 220102 ));
        newInvetory.add(new AutoMobile("Honda", "Crv", "Blue", 2022, 2000));



        boolean view = true;
        while(true){
            printMenu();
            int option = scan.nextInt();
            switch(option){
                case 0:
                    System.out.println(newInvetory.toString());
                    break;
                case 1:
                    addVehicle(newInvetory);
                    break;
                case 2:
                    removeVehicle(newInvetory);
                    break;
            default:
                break;

        }

    }

    }


    public static void printMenu(){
        String textBlock = """
            0 - View Invetory
            1 - Add Vehicle
            2 - Remove Vehicle
            Please enter your selection""";
        System.out.println(textBlock + " ");
    }

    private static void addVehicle(ArrayList<AutoMobile> newInvetory){
        System.out.println("Make: ");

        String custMake = scan.next();

        System.out.println("Model: ");
        String custModel = scan.next();


        System.out.println("Color: ");
        String custColor = scan.next();


        System.out.println("Year: ");
        int custYea = scan.nextInt();

        System.out.println("Mileage");
        int custMileage  = scan.nextInt();


        newInvetory.add(new AutoMobile(custMake, custModel, custColor, custYea, custMileage));


    }

    public static void removeVehicle(ArrayList<AutoMobile> newInvetory, String make, String model, String color, int year, int mileage ){

        System.out.println("Make: ");

        String custMake = scan.next();

        System.out.println("Model: ");
        String custModel = scan.next();


        System.out.println("Color: ");
        String custColor = scan.next();


        System.out.println("Year: ");
        int custYea = scan.nextInt();

        System.out.println("Mileage");
        int custMileage  = scan.nextInt();
        if(custMake.contains(make) && custModel.contains(model) && custColor.contains(color) && custYea == year && custMileage == mileage){
           newInvetory =  newInvetory.remove(custMake, custModel, custColor, custYea, custMileage);
        }




    }










}
