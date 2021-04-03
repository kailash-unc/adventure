# adventure

## Introduction

This is a text-based, directional adventure video game that can be played in the console. The player will explore a two-dimensional, gridded map in search of treasures. The player will navigate through the world by entering keyword inputs such as "go north" or "go east" into the console. Each input will return a message based on what the player chose to do and their current surroundings. Some locations in the map will have "chests" containing items; the player can "open" a chest and take the items inside. The goal of the game is to find all the treasure in the map.

Text-based adventure games were first popularized in the late 1970's and early 1980's. Zork, [which you can read about here](https://en.wikipedia.org/wiki/Zork) [or play here](https://classicreload.com/zork-i.html), is a classic example of a text-based adventure game like this one.

The environment that the player will navigate through is two-dimensional, so let's assume a 2D, integer Cartesian coordinate system. This means the player's current position on the map can be modeled by two integers representing their `x` and `y` location. The player should be able to move north (i.e. in the positive-`y` direction), south (i.e. in the negative-`y` direction), east (i.e. in the positive-`x` direction), and west (i.e. in the negative-`x` direction) through the environment.

## Playing the Game

The starter code also includes the classes `MapUNC` and `Main`, which have been commented out. Once you have finished the "jedi" portion of the assignment, these can be used to play a short treasure hunting game that uses the UNC-CH campus as a map! Feel free to play it as is, make modifications, or create an entirely new game!

To play, open the `Main` class file and hit run (the small green icon next to the line numbers at the top of the class)
