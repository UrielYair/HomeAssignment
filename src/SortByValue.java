import java.util.Comparator;

public class SortByValue implements Comparator<Entity>
{
    @Override
    public int compare(Entity a, Entity b)
    {
        return a.getValue()-b.getValue();
    }
}
