package com.comp301.a02adventure;

import java.util.ArrayList;
import java.util.List;

public class InventoryImpl implements Inventory {
  private List<Item> _inventory;

  public InventoryImpl() {
    _inventory = new ArrayList<Item>();
  }

  @Override
  public boolean isEmpty() {
    return _inventory.isEmpty();
  }

  @Override
  public int getNumItems() {
    return _inventory.size();
  }

  @Override
  public List<Item> getItems() {
    List<Item> _inventory_clone = new ArrayList<>();
    int total = getNumItems();
    for (int i = 0; i < total; i++) {
      _inventory_clone.add(new ItemImpl(_inventory.get(i).getName()));
    }
    return _inventory_clone;
  }

  @Override
  public void addItem(Item item) {
    if (item instanceof Item) {
      _inventory.add(item);
    }
  }

  @Override
  public void removeItem(Item item) {
    _inventory.remove(item); // might not work, check to see
  }

  @Override
  public void clear() {
    _inventory = new ArrayList<Item>();
  }

  @Override
  public void transferFrom(Inventory other) {
    List<Item> _inventory_clone = other.getItems();
    int total = other.getNumItems();
    for (int i = 0; i < total; i++) {
      _inventory.add(new ItemImpl(_inventory_clone.get(i).getName()));
    }
    other.clear();
  }
}
