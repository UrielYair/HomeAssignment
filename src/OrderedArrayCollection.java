import java.util.ArrayList;

public class OrderedArrayCollection implements EntityCollection
{
    // Implement of the collection in an ordered Array
    // Add    - O(n)
    // Remove - O(1)

    private ArrayList<Entity> collection;
    public OrderedArrayCollection()
    {
        this.collection = new ArrayList<Entity>();
    }

    @Override
    public void add(Entity entity)
    {
        if (collection.isEmpty())
            this.collection.add(entity);
        else
        {
            for (int i = 0; i < collection.size(); i++)
            {
                if (entity.getValue()<this.collection.get(i).getValue())
                {
                    this.collection.add(i, entity);
                    break;
                }
            }
        }
    }

    @Override
    public Entity removeMaxValue()
    {
        Entity entityToReturn = this.collection.get(this.collection.size()-1);
        this.collection.remove(this.collection.size()-1);
        return entityToReturn;
    }

    @Override
    public void printCollection()
    {
        if (this.collection.isEmpty())
            System.out.println("Array is empty.");
        else {
            for (Entity entity : this.collection) {
                System.out.print(entity.getValue() + ", ");
            }
            System.out.println();
        }
    }
}
