import java.util.Arrays;

public class GroceryList
{
    GroceryItemOrder[] groceryItemOrdersArray = new GroceryItemOrder[10];
    int total = 0;
    int counter = 0;


    public void add (GroceryItemOrder newItem)
    {
        groceryItemOrdersArray[counter] = newItem;
        counter++;
    }

    public int getTotalCost()
    {
        total = 0;

        try {
            for (int i = 0; i <= groceryItemOrdersArray.length; i++)
            {
                total = groceryItemOrdersArray[i].getPrice() + total;
            }
        }catch (NullPointerException NPe)
        {
            return total;
        }

        return total;
    }

    public String toString()
    {
        total = getTotalCost();
        return "GroceryList: \n" +
                "groceryItemOrder: " + Arrays.toString(groceryItemOrdersArray)+ "\n" +
                "total:" + total + "\n";
    }

}
