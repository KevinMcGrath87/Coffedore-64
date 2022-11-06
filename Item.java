public class Item {
    private String name;
    private double price;
    private int index;

//getters
    public int getIndex(){
        return index;
    }
    public String getItemName(){
        return this.name;
    }
    public double getItemPrice(){
        return this.price;
    }
//setters
    public void setItemName(String newName){
        this.name = newName;
    }
    public void setItemPrice(double newPrice){
        this.price = newPrice;
    }

    private void setIndex(){
        this.index = CoffeeKiosk.getMenu().indexOf(this);
    }
//constructor
    public Item(String itemName, double itemPrice){
        this.name = itemName;
        this.price = itemPrice;
        CoffeeKiosk.getMenu().add(this);
        setIndex();
    }
}