package com.comp301.a02adventure;

public class PlayerImpl implements Player {
  private String _name;
  private Position _pos;
  private Inventory _inventory;

  public PlayerImpl(String name, int startX, int startY) {
    // Constructor code goes here
    if (name == null) {
      throw new IllegalArgumentException("Invalid Arguments");
    }
    _inventory = new InventoryImpl();
    _name = name;
    _pos = new PositionImpl(startX, startY);
  }

  @Override
  public Position getPosition() {
    return _pos;
  }

  @Override
  public Inventory getInventory() {
    return _inventory;
  }

  @Override
  public String getName() {
    return _name;
  }

  @Override
  public void move(Direction direction) {
    _pos = _pos.getNeighbor(direction);
  }
}
