import java.util.ArrayList;

public class ArrayCollection implements EntityCollection
{
    // Implement of the collection in an ordered Array
    // Add    - O(n)
    // Remove - O(1)

    private ArrayList<Entity> collection;
    public ArrayCollection()
    {
        this.collection = new ArrayList<>();
    }

    @Override
    public void add(Entity entity)
    {
        if (collection.isEmpty())
            this.collection.add(entity);
        else
        {
            for (int i = 0; i < collection.size()-1; i++)
            {
                if (entity.getValue()>collection.get(i).getValue() && entity.getValue()<=collection.get(i+1).getValue())
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
        for (Entity entity: this.collection) {
            System.out.println(entity.getValue() + ", ");
        }
    }
}
