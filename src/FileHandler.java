import java.io.*;

public class FileHandler
{
    //  Gemmer de forskellige arraylists med medlemmer og arbejdere
    //skriver til filen
    public void saveObject(GroceryList2 list)
    {
        try
        {
            FileOutputStream fileOut = new FileOutputStream("grocery.txt");
            BufferedOutputStream buff = new BufferedOutputStream(fileOut);
            ObjectOutputStream out = new ObjectOutputStream(buff);

            out.writeObject(list);
            out.close();
            System.out.println("save");

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    //Læser fra filen
    public GroceryList2 loadObject(GroceryList2 list)
    {
        // vi nulstiller alle lister
        list = null;

        try
        {
            FileInputStream fileIn = new FileInputStream("grocery.txt");
            BufferedInputStream buff = new BufferedInputStream(fileIn);
            ObjectInputStream in = new ObjectInputStream(buff);

            list = (GroceryList2) in.readObject();

            in.close();

            System.out.println("Loaded");
        }
        catch (FileNotFoundException eFNF)
        {
            eFNF.printStackTrace();

        }
        catch (IOException eIO){
            System.out.println("eIO");
            eIO.printStackTrace();
        }
        catch(ClassNotFoundException eCNF){
            System.out.println("eCNF");
        }
        return list;
    }
}
