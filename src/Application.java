public class Application
{
    public static void main(String[] args)
    {
        LinkedList dataBase = new LinkedList();
        
        dataBase.addToHead(23, "Theo");
        dataBase.addToHead(14, "Charles");
        dataBase.addToHead(18, "Pearl");
        dataBase.addToHead(76, "Nikki");
        
        dataBase.showAllItems();
        
        dataBase.removeFromHead();
        
        dataBase.showAllItems();

        dataBase.addItemAt(2, 12345, "Mr. Brand New");
        
        dataBase.showAllItems();

        if(!dataBase.isEmpty()) {
            System.out.println("Size = " + dataBase.size());
        }
    }
}
