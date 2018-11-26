import java.util.LinkedList;

public class LinkedListCollection implements EntityCollection
{
    // Implement of the collection in a Linked List (Unordered)
    // Add    - O(1)
    // Remove - O(n)

    LinkedList<Entity> collection;

    public LinkedListCollection()
    {
        this.collection = new LinkedList<>() ;
    }

    @Override
    public void add(Entity entity)
    {
        this.collection.add(entity);
    }

    @Override
    public Entity removeMaxValue()
    {
        //TODO: check if duplicate value are allowed.


        if (this.collection.isEmpty())
            return null;

        int indexOfMaxValue = -1, maxValue = Integer.MIN_VALUE;
        Entity maxEntity = null;

        for (int i = 0; i < this.collection.size(); i++)
        {
            if (collection.get(i).getValue() > maxValue)
            {
                maxEntity = collection.get(i);
                indexOfMaxValue = i;
            }
        }

        this.collection.remove(indexOfMaxValue);
        return maxEntity;
    }
}
