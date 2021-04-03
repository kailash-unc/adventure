package com.comp301.a02adventure;

public class PositionImpl implements Position {

  private int _x;
  private int _y;

  public PositionImpl(int x, int y) {
    // Constructor code goes here
    _x = x;
    _y = y;
  }

  @Override
  public int getX() {
    return _x;
  }

  @Override
  public int getY() {
    return _y;
  }

  @Override
  public Position getNeighbor(Direction direction) {
    switch (direction) {
      case NORTH:
        return new PositionImpl(getX(), getY() + 1);
      case SOUTH:
        return new PositionImpl(getX(), getY() - 1);
      case EAST:
        return new PositionImpl(getX() + 1, getY());
      case WEST:
        return new PositionImpl(getX() - 1, getY());
    }
    return null;
  }
}
