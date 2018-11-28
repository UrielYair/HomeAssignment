package com.uriel.entity;

import java.util.Comparator;

import java.util.PriorityQueue;


public class HeapCollection implements EntityCollection
{
    // Implement of the collection in priority queue using comparator.
    // Add    - O(log n)
    // Remove - O(log n)

    private PriorityQueue<Entity> collection;

    public HeapCollection() {
        Comparator<Entity> comparator = new SortByValue();
        this.collection = new PriorityQueue<>(comparator);
    }

    @Override
    public void add(Entity entity)
    {
        this.collection.add(entity);
    }

    @Override
    public Entity removeMaxValue() {
        if (!this.collection.isEmpty())
        {
            Entity entityToReturn = this.collection.peek();
            this.collection.poll();
            return entityToReturn;
        }
        else
            return null;
    }

    @Override
    public void printCollection(){

        if(this.collection.isEmpty())
            System.out.println("Heap is empty.");
        else
        {
            while (!this.collection.isEmpty()) {
                System.out.print(this.collection.poll().getValue() + ", ");
            }
            System.out.println();
        }
    }
}
