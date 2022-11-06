import java.util.ArrayList;

public class Order {
    private String name;
    private double total;
    private boolean ready;
    private ArrayList<Item> items;
    private static int ordersMade = 0;
//getters
    public String getName(){
        return this.name;
    }
    public double getTotal(){
        return this.total;
    }
    public ArrayList<Item> getItems() {
        return items;
    }
    public static int getNumberOfOrders(){
        return ordersMade;
    }
    public boolean isReady(){
        return ready;
    }
//setters
    public void setName(String nameArg){
        this.name = nameArg;
    }
    public void setTotal() {
        this.total = sumOfItems(items);
    }
    public void setBoolean(boolean flag){
        this.ready = flag;
    }
    public void addItem(Item newItem){
        items.add(newItem);
    }
    private double sumOfItems(ArrayList<Item> itemList){
        double orderTotal = 0;
        for(Item each: itemList){
            orderTotal = orderTotal + each.getItemPrice();
        }
        return orderTotal;
        }
// order created from all relevant fields
    public Order(String orderName, boolean readyBoole, ArrayList<Item> itemList){
        this.name = orderName;
        this.total = sumOfItems(itemList);
        this.ready = readyBoole;
        this.items = itemList;
        ordersMade++;
    }
//order created by just entering a name for the order
    public Order (String orderName){
        this.name = orderName;
        this.total = 0;
        this.ready = false;
        this.items = new ArrayList<Item>();
        ordersMade++;
    }
// order created without necessary fields
    public Order(){
        this.name = "Guest";
        this.items = new ArrayList<Item>();
    }
}