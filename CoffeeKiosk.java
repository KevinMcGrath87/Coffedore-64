import java.util.ArrayList;


public class CoffeeKiosk {
    private static ArrayList<Item> menu;
    private static ArrayList<Order> orders;
//getters
    public static ArrayList<Item> getMenu() {
        return menu;
    }
    public static void displayMenu(){
        for(Item menuItem: menu){
            System.out.println(menuItem.getItemName() + " " +"-" + " " + menuItem.getItemPrice());
        }
    }


//setters
public static void addMenuItemByInput(){
    String name = System.console().readLine();
    double price = Double.parseDouble(System.console().readLine());
    new Item(name, price);
}


public void newOrderEntry(){
    System.out.println("Please enter customer name for the order.");
    String name = System.console().readLine();
    Order newOrder = new Order(name);
    displayMenu();
    System.out.println("Please type the index of the item you would like to order or enter q to quit");
    String indexOfItem = System.console().readLine();
    newOrder.addItem(CoffeeKiosk.getMenu().get(Integer.parseInt(indexOfItem)));
    while(!indexOfItem.equals("q")){
        System.out.println("enter another item to order or input q to quit");
        String indexOfNextItem = System.console().readLine();
        if(!indexOfNextItem.equals("q")){
            newOrder.addItem(CoffeeKiosk.getMenu().get(Integer.parseInt(indexOfNextItem)));
        }
        else{ break;}
    }
    System.out.println(newOrder.getName() + " " + newOrder.getTotal());
}

public void addMenuItem(String itemName, double price){
    new Item(itemName, price);
}

//constructor
public CoffeeKiosk(){
    menu = new ArrayList<Item>();
    orders = new ArrayList<Order>();
}
}
