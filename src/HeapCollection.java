import java.util.Comparator;
import java.util.PriorityQueue;

public class HeapCollection implements EntityCollection
{
    // Implement of the collection in priority queue
    // Add    - O(log n)
    // Remove - O(log n)

    private PriorityQueue<Entity> collection;

    public HeapCollection()
    {
        Comparator<Entity> comparator = new SortByValue();
        this.collection = new PriorityQueue<>(comparator);
    }

    @Override
    public void add(Entity entity)
    {
        this.collection.add(entity);
    }

    @Override
    public Entity removeMaxValue()
    {
        Entity entityToReturn = this.collection.peek();
        this.collection.poll();
        return entityToReturn;
    }

    @Override
    public void printCollection()
    {
        for (int i = 0; i < this.collection.size(); i++) {
            System.out.print(this.collection.poll().getValue() + ", ");
        }
        System.out.println();
    }
}
