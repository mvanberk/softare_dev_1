public class Wizard extends Enemy{
    String type;
    public Wizard(int hp, int dmg, String name, String dmgType) {
        super(hp, dmg, name);
        type = dmgType;
    }

    void damageType(Enemy target) {
        if (type == "fire") {
            if (target.health <= 0) { //checks if target is already dead
                System.out.println(name + " tries to cast Fireball on " + target.name + " but " + target.name + " is already dead.");
                System.out.println();
                return;
            }
            System.out.println(name + " casts Fireball and inflicts " + 2*damage + " fire damage to " + target.name + "!"); //inflict damage
            target.health = target.health - 2*damage;
            if (target.health <= 0) {  //checks if attack killed target
                System.out.println(target.name + " has been reduced to ashes!");
            } else {
                System.out.println(target.name + " has " + target.health + " health left.");
            }
        }
        if (type == "ice") {
            if (target.health <= 0) { //checks if target is already dead
                System.out.println(name + " tries to cast Cone of Cold on " + target.name + " but " + target.name + " is already dead.");
                System.out.println();
                return;
            }
            System.out.println(name + " casts Cone of Cold and inflicts " + 2*damage + " ice damage to " + target.name + "!"); //inflict damage
            target.health = target.health - 2*damage;
            if (target.health <= 0) {  //checks if attack killed target
                System.out.println(target.name + " has been shattered into a million pieces!");
            } else {
                System.out.println(target.name + " has " + target.health + " health left.");
            }
        }
        System.out.println();
    }
}
