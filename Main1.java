import java.util.Arrays;

public class Main1 {

    // record currentInvetory(String make, String model, String color,  int year, int mileage){
    //     public currentInvetory(String make){
    //         this(make, "Dairy", "white", 2020, 23100);
    //     }
    // }


        public static void main(String[] args) {
            Car[] cars = new Car[2];
            cars[0] = new Car("Dodge", "challenger", 2020);
            cars[1] = new Car("Honda", "CRV", 2021);
            System.out.println(Arrays.toString(cars));
        }

}
