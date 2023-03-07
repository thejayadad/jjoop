import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Dealership {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Vehicle> car = new ArrayList<Vehicle>();
        int num;
        do{
            System.out.println("0. Exit");
            System.out.println("1. Add Vehicle");
            System.out.println("2. Remove Vehicle");
            System.out.println("3. See all Vehicle");
            System.out.println("4. Update Vehicle");
            System.out.println("5. Search Vehicle");

            System.out.println("Please enter your choice : ");
            num = scan.nextInt();

            switch(num){
                case 1:
                System.out.println("Please enter the Make");
                String cstMake = scan.next();
                System.out.println("Please enter the Model");
                String cstModel = scan.next();
                System.out.println("Please enter the Color");
                String cstColor = scan.next();
                System.out.println("Please enter the Year");
                int cstYear = scan.nextInt();
                System.out.println("Please enter the Mileage");
                int cstMileage = scan.nextInt();
                System.out.println("Please enter the Vin Number");
                int cstVin = scan.nextInt();
                    car.add(new Vehicle(cstMake, cstModel, cstColor, cstYear, cstMileage, cstVin));
                break;

                case 2:
                boolean found = false;
                System.out.println("Enter vin to look up and remove");
                int vin = scan.nextInt();
                System.out.println("==================");
                Iterator<Vehicle> i = car.iterator();
                i = car.iterator();
                while(i.hasNext()){
                    Vehicle v = i.next();
                    if(v.getVin() == vin){
                        found = true;
                        System.out.println("Vehicle Removed");
                        i.remove();
                    }
                    System.out.println("==================");

                    if(!found){
                        System.out.println("Record not found");
                    } else{
                        System.out.println("Vehicle deleted");
                    }
                }


            break;


                case 3:
                System.out.println("==================");
                i = car.iterator();
                while(i.hasNext()){
                    Vehicle v = i.next();
                    System.out.println(v);
                }

                System.out.println("==================");

                break;

                case 4:
                found = false;
                System.out.println("Enter vin to look update");
                vin = scan.nextInt();
                System.out.println("==================");
                ListIterator<Vehicle>li = car.listIterator();
                while(li.hasNext()){
                    Vehicle v = li.next();
                    if(v.getVin() == vin){
                        System.out.println("Please enter the Make");
                        String mke = scan.next();
                        System.out.println("Please enter the Model");
                        String mdel = scan.next();
                        System.out.println("Please enter the Color");
                        String clor = scan.next();
                        System.out.println("Please enter the Year");
                        int yr = scan.nextInt();
                        System.out.println("Please enter the Mileage");
                        int mle = scan.nextInt();
                        System.out.println("Please enter the Vin Number");
                        int vn = scan.nextInt();
                        li.set(new Vehicle(mke, mdel, clor, yr, mle, vn));
                        found = true;


                    }
                    System.out.println("==================");

                    if(!found){
                        System.out.println("Record not found");
                    } else{
                        System.out.println("Vehicle Updated");
                    }
                }


            break;


                case 5:
                    found = false;
                    System.out.println("Enter vin to look up");
                    vin = scan.nextInt();
                    System.out.println("==================");
                    i = car.iterator();
                    while(i.hasNext()){
                        Vehicle v = i.next();
                        if(v.getVin() == vin){
                            found = true;
                            System.out.println("Vehicle Found");
                            System.out.println(v);
                        }
                        System.out.println("==================");

                        if(!found){
                            System.out.println("Record not found");
                        }
                    }


                break;

            }


        } while (num != 0);
    }
}
