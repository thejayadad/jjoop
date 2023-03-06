import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    record GroceryItem(String name, String type, int count){
        public GroceryItem(String name){
            this(name, "Dairy", 1);
        }
    }
    public static void main(String[] args) {
        GroceryItem[] groceryArray = new GroceryItem[3];
        groceryArray[0] = new GroceryItem("milk");
        groceryArray[1] = new GroceryItem("apple", "fruit",5);

        System.out.println(Arrays.toString(groceryArray));
        ArrayList<GroceryItem> groceryList = new ArrayList<>();
        groceryList.add(new GroceryItem("fish", "seafood", 1));

        System.out.println(groceryList);

    }
}
