
public class Enemy {
    int health;
    int damage;
    String name;

    public Enemy(int hp, int dmg, String nm) {
        health = hp;
        damage = dmg;
        name = nm;
    }

    void attack(Enemy target) {
        if (target.health <= 0) { //checks if target is already dead
            System.out.println(name + " tries to attack " + target.name + " but " + target.name + " is already dead.");
            System.out.println();
            return;
        }
        System.out.println(name + " inflicts " + damage + " damage to " + target.name + "!"); //inflict damage
        target.health = target.health - damage;
        if (target.health <= 0) { //checks if attack killed target
            System.out.println(target.name + " has been killed!");
        }
        else {
            System.out.println(target.name + " has " + target.health + " health left.");
        }
        System.out.println();
    }

}
