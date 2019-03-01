public class LinkedList
{
    private LLItem head;  
    
    public LinkedList() {
        head = null;
    }
    
    public void addToHead(int anId, String aName) {
        head = new LLItem(anId, aName, head);
    }
    
    public void showAllItems() {
        int count = 0;
        LLItem currItem = head;
        while(currItem != null) {
            System.out.println(count + ": " + currItem.getAllDataAsString());
            count++;
            currItem = currItem.getNextItem();
        }
        System.out.print("\n");
    }
    
    public int size() {
        int count = 0;
        LLItem currItem = head;
        while(currItem != null) {
            count++;
            currItem = currItem.getNextItem();
        }
        return count;
    }

    public boolean isEmpty() {
        return (size() == 0);
    }

    public void removeFromHead() {
        head = head.getNextItem();
    }
    
    public void addItemAt(int index, int newId, String newName) {
        
        if (index == 0) {
            addToHead(newId, newName);
        } else {
            LLItem item1 = null; // Will point the the item preceeding the inserted item.
            LLItem item2 = null; // Will point the the item following the inserted item.
            
            LLItem currItem = head;
            for(int i = 0; i < (index-1); i++) {
                currItem = currItem.getNextItem();
            }
            item1 = currItem;
            item2 = currItem.getNextItem();
            
            // Insert a new item between item1 and item2 now.
            LLItem newItem = new LLItem(newId, newName, item2);
            item1.setNextItem(newItem);
        }
    }
}

