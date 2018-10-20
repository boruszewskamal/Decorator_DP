import java.util.ArrayList;

public class Meal {
    ArrayList<Item> items = new ArrayList<Item>();

    public void addItem(Item item) {
        items.add(item);
    }

    public float getCost() {
        float cost = 0;
        for (Item i : items) {
            cost += i.price();
        }
        return cost;
    }

    public void listItems() {
        for (Item i : items){
            System.out.println(i.name());
        }
    }
}
