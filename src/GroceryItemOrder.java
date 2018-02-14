import java.io.Serializable;

public class GroceryItemOrder implements Serializable
{
    private String itemName = "";
    private int quantity = 0;
    private int price = 0;

    public GroceryItemOrder(String itemName, int quantity, int price)
    {
        this.itemName = itemName;
        this.quantity = quantity;
        this.price = price;
    }
    public String toString()
    {
        return "GroceryItemOrder: \n" +
                "Item Name: " + itemName + "\n" +
                "Quantity: " + quantity + "\n" +
                "Prince: " + price + "";
    }

    public int getCost()
    {
        return price;
    }

    public String getItemName() {
        return itemName;
    }
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }

}
