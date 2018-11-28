package com.uriel.entity;

public interface EntityCollection
{
    void add(Entity entity);
    Entity removeMaxValue();
    void printCollection();
}