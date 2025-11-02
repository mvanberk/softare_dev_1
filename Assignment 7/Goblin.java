public class Goblin extends Enemy{

    public Goblin(int hp, int dmg, String name) {
        super(hp, dmg, name);
    }

    void attack(Enemy target) {
        if (target.health <= 0) {
            System.out.println(name + " tries to gobble " + target.name + " but " + target.name + " is already dead.");
            System.out.println();
            return;
        }
        System.out.println(name + " gobbles and inflicts " + damage + " damage to " + target.name + "!");
        target.health = target.health - damage;
        if (target.health <= 0) {
            System.out.println(target.name + " has been goblinated!");
        }
        else {
            System.out.println(target.name + " has " + target.health + " health left.");
        }
        System.out.println();
    }
}
