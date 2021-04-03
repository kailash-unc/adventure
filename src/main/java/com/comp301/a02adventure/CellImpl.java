package com.comp301.a02adventure;

public class CellImpl implements Cell {

  private Position _pos;
  private String _name;
  private String _description;
  private Inventory _chest;
  private boolean _visited;

  public CellImpl(int x, int y, String name, String description) {
    // Constructor code goes here
    if (name == null || description == null) {
      throw new IllegalArgumentException("Invalid Arguments");
    }
    _pos = new PositionImpl(x, y);
    _name = name;
    _description = description;
    _visited = false;
  }

  public CellImpl(int x, int y) {
    this(x, y, "", "");
  }

  @Override
  public String getName() {
    return _name;
  }

  @Override
  public void setName(String name) {
    if (name == null) {
      throw new IllegalArgumentException("Invalid Argument");
    }
    _name = name;
  }

  @Override
  public String getDescription() {
    return _description;
  }

  @Override
  public void setDescription(String description) {
    if (description == null) {
      throw new IllegalArgumentException("Invalid Argument");
    }
    _description = description;
  }

  @Override
  public Position getPosition() {
    return _pos;
  }

  @Override
  public Inventory getChest() {
    return _chest;
  }

  @Override
  public void setChest(Inventory chest) {
    if (chest == null) {
      throw new IllegalArgumentException("Invalid Argument");
    }
    _chest = chest;
  }

  @Override
  public boolean getIsVisited() {
    return _visited;
  }

  @Override
  public boolean hasChest() {
    if (_chest == null) {
      return false;
    } else {
      return true;
    }
  }

  @Override
  public void visit() {
    _visited = true;
  }
}
