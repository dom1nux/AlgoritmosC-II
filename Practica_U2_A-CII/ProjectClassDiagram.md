classDiagram
direction BT
class CombatEntity {
<<Interface>>
  + attack(Entity) void
  + takeDamage(int) void
}
class Enemy {
  + move(int, int) void
  + attack(Entity) void
  + takeDamage(int) void
}
class Entity {
   String name
   int health
}
class Goblin {
  + attack(Entity) void
}
class NonPlayer {
  + takeDamage(int) void
  + attack(Entity) void
  + move(int, int) void
}
class Player {
  + attack(Entity) void
  + takeDamage(int) void
  + move(int, int) void
}
class SharedBehavior {
<<Interface>>
  + move(int, int) void
}
class Swordman {
  + attack(Entity) void
}
class Thief {
  + attack(Entity) void
}
class Villager
class Wizard {
  + attack(Entity) void
}

Enemy  ..>  CombatEntity 
Enemy  -->  Entity 
Enemy  ..>  SharedBehavior 
Goblin  -->  Enemy 
NonPlayer  ..>  CombatEntity 
NonPlayer  -->  Entity 
NonPlayer  ..>  SharedBehavior 
Player  ..>  CombatEntity 
Player  -->  Entity 
Player  ..>  SharedBehavior 
Swordman  -->  Player 
Thief  -->  Enemy 
Villager  -->  NonPlayer 
Villager  ..>  SharedBehavior 
Wizard  -->  Player 
