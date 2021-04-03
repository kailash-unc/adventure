package com.comp301.a02adventure;

public class ItemImpl implements Item {

  private String _name;

  public ItemImpl(String name) {
    // Constructor code goes here
    if (name == null) {
      throw new IllegalArgumentException("name cannot be null");
    }
    _name = name;
  }

  public boolean equals(Object other) {
    if (other instanceof Item) {
      Item something = (ItemImpl) (other);
      return getName().equals(something.getName());
    } else {
      return false;
    }
  }

  public String getName() {
    return _name;
  }

  public String toString() {
    return this.getName();
  }
}
