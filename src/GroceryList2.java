import java.io.Serializable;
import java.util.ArrayList;

public class GroceryList2 implements Serializable
{
    ArrayList<GroceryItemOrder> groceryItemOderArrayList = new ArrayList<>();
    int total = 0;


    public void addToList(GroceryItemOrder newItem)
    {
        if(groceryItemOderArrayList.size() <= 10)
        {
            groceryItemOderArrayList.add(newItem);
        }else
            {
                System.out.println("your list is to large!");
            }
    }

    public int getTotal()
    {
        total = 0;
        for(GroceryItemOrder groceryItem: groceryItemOderArrayList)
        {
            total = groceryItem.getPrice() + total;
        }

        return total;
    }


    public String toString()
    {
        total = getTotal();
        return "GroceryList2 " +
                "groceryItemOderArrayList: " + groceryItemOderArrayList + "\n" +
                "total: " + total + "\n";
    }

    public GroceryItemOrder getItem(String name)
    {
        for (GroceryItemOrder groceryItem: groceryItemOderArrayList)
        {
            if(name.equals(groceryItem.getItemName()))
            {
                return groceryItem;
            }
        }
        return null;
    }
}
