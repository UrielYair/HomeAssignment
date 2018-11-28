public interface EntityCollection
{
    void add(Entity entity);
    Entity removeMaxValue();
    abstract void printCollection();
}