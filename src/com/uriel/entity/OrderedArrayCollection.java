package com.uriel.entity;

import java.util.ArrayList;

public class OrderedArrayCollection implements EntityCollection
{
    // Implement of the collection in an ordered Array
    // Add    - O(n)
    // Remove - O(1)

    private ArrayList<Entity> collection;
    public OrderedArrayCollection()
    {
        this.collection = new ArrayList<>();
    }

    @Override
    public void add(Entity entity) {
        boolean entityAdded = false;
        if (collection.isEmpty()) {
            this.collection.add(entity);
            entityAdded = true;
        }

        else
        {
            for (int i = 0; i < collection.size(); i++)
            {
                if (entity.getValue()<this.collection.get(i).getValue())
                {
                    this.collection.add(i, entity);
                    entityAdded = true;
                    break;
                }
            }
        }
        if (!entityAdded)
            this.collection.add(this.collection.size(),entity);

    }

    @Override
    public Entity removeMaxValue() {

        if (!this.collection.isEmpty())
        {
            Entity entityToReturn = this.collection.get(this.collection.size() - 1);
            this.collection.remove(this.collection.size() - 1);
            return entityToReturn;
        }
        else
            return null;
    }

    @Override
    public void printCollection() {

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
