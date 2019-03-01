public class LLItem
{
    private int id;
    private String name;
    private float balance;
    private LLItem nextItem;
    
    public LLItem(int theId, String theName, LLItem restOfList) {
        id = theId;
        name = theName;
        balance = 0.0F;
        nextItem = restOfList;
    }
    
    public LLItem(int theId, String theName) {
        this(theId, theName, null);
    }
    
    public LLItem(LLItem restOfList) {
        nextItem = restOfList;
    }
    
    
    public LLItem getNextItem() {
        return nextItem;
    }

    public void setNextItem(LLItem nextOne) {
        nextItem = nextOne;
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }
    
    public String getAllDataAsString() {
        return (id + ", " + name + ", " + balance);
    }
}
