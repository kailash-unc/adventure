package com.comp301.a02adventure;

import java.util.List;

public class GameImpl implements Game {
  private Map _map;
  private Player _player;

  public GameImpl(Map map, Player player) {
    // Constructor code goes here
    if (map == null || player == null) {
      throw new IllegalArgumentException("Invalid Arguments");
    }
    _map = map;
    _player = player;
  }

  @Override
  public Position getPlayerPosition() {
    return _player.getPosition();
  }

  @Override
  public String getPlayerName() {
    return _player.getName();
  }

  @Override
  public List<Item> getPlayerItems() {
    return _player.getInventory().getItems();
  }

  @Override
  public boolean getIsWinner() {
    return (_player.getInventory().getNumItems() == _map.getNumItems());
  }

  @Override
  public void printCellInfo() {
    System.out.println("Location: " + _map.getCell(_player.getPosition()).getName());
    // System.out.println(_map.getCell(_player.getPosition()).getName() + ": ");
    System.out.println(_map.getCell(_player.getPosition()).getDescription());
    if (_map.getCell(_player.getPosition()).getIsVisited()) {
      System.out.println("You have already visited this location.");
    }
    if (_map.getCell(_player.getPosition()).hasChest()) {
      System.out.println("You found a chest! Type 'open' to see what's inside, or keep moving.");
    }
    _map.getCell(_player.getPosition()).visit();
  }

  @Override
  public void openChest() {
    if (!(_map.getCell(_player.getPosition()).hasChest())) {
      System.out.println("No chest to open, sorry!");
    } else if (_map.getCell(_player.getPosition()).getChest().getNumItems() == 0) {
      System.out.println("The chest is empty.");
    } else {
      System.out.print("You collected these items: ");
      List<Item> holder = _map.getCell(_player.getPosition()).getChest().getItems();
      System.out.println(holder.toString());
      _player.getInventory().transferFrom(_map.getCell(_player.getPosition()).getChest());
    }
  }

  @Override
  public boolean canMove(Direction direction) {
    try {
      Cell direction_wanted = _map.getCell(_player.getPosition().getNeighbor(direction));
      if (direction_wanted == null) {
        throw new IllegalArgumentException("Null Position");
      }
      return true;
    } catch (Exception e) {
      return false;
    }
  }

  @Override
  public void move(Direction direction) {
    if (canMove(direction)) {
      _player.move(direction);
      printCellInfo();
    } else {
      System.out.println("You can't go that way! Try another direction.");
    }
  }
}
