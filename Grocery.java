import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Grocery {

    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        boolean flag = true;
        ArrayList<String> groceries = new ArrayList<>();
        while(flag){
            printActions();
            switch(Integer.parseInt(scan.nextLine())){
                case 1-> addItems(groceries);
                case 2-> removeItems(groceries);
                default -> flag = false;

            }
            groceries.sort(Comparator.naturalOrder());
            System.out.println(groceries);
        }
    }

    private static void addItems(ArrayList<String> groceries){
        System.out.println("Add item(s) (seperate items by a comma)");
        String[] items = scan.nextLine().split(",");
        // groceries.addAll(List.of(items));
        for(String i: items){
            String trimmed = i.trim();
            if(groceries.indexOf(trimmed) < 0){
                groceries.add(trimmed);
            }
        }
    }

    private static void removeItems(ArrayList<String> groceries){
        System.out.println("Remove item(s) (seperate items by a comma)");
        String[] items = scan.nextLine().split(",");
        for(String i: items){
            String trimmed = i.trim();
                groceries.remove(trimmed);
            }
        }




    private static void printActions(){
        String textBlok = """
                0 - shutdown
                1 - add items to list
                2 - remove items from list

                Please enter your selection""";
                System.out.println(textBlok + " ");
    }
}
