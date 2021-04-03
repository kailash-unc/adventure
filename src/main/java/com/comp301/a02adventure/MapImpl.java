package com.comp301.a02adventure;

public class MapImpl implements Map {

  private int _width;
  private int _height;
  private int _numItems;
  private Cell[][] _grid;

  public MapImpl(int width, int height, int numItems) {
    // Constructor code goes here

    if (width <= 0 || height <= 0) {
      throw new IllegalArgumentException("Invalid Arguments");
    }

    _width = width;
    _height = height;
    _numItems = numItems;
    _grid = new Cell[width][height];
  }

  @Override
  public int getWidth() {
    return _width;
  }

  @Override
  public int getHeight() {
    return _height;
  }

  @Override
  public Cell getCell(int x, int y) {
    if (x < 0 || y < 0 || x >= _width || y >= _height) {
      throw new IndexOutOfBoundsException("Invalid Index");
    }
    return _grid[x][y];
  }

  @Override
  public Cell getCell(Position position) {
    if (position == null) {
      throw new IllegalArgumentException("Invalid Argument");
    }
    return getCell(position.getX(), position.getY());
  }

  @Override
  public void initCell(int x, int y) {
    if (x < 0 || y < 0 || x >= _width || y >= _height) {
      throw new IndexOutOfBoundsException("Invalid Index");
    }
    _grid[x][y] = new CellImpl(x, y);
  }

  @Override
  public int getNumItems() {
    return _numItems;
  }
}
