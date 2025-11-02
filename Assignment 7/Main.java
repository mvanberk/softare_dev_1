//Assignment 7 - Martijn van Berk

public class Main {
    public static void main(String[] args) {

        //create objects
        Enemy rat1 = new Enemy(30, 5, "Rat");
        Wizard wiz1 = new Wizard(40, 20, "Fire Wizard", "fire");
        Wizard wiz2 = new Wizard(40, 20, "Ice Wizard", "ice");
        Goblin goblinKing = new Goblin(200, 35, "Goblin King");

        //generic enemy functions
        rat1.attack(wiz1);

        //fire and ice wizard functions
        wiz1.attack(rat1);
        wiz2.attack(rat1);
        wiz1.damageType(goblinKing);
        wiz2.damageType(goblinKing);

        //goblin functions
        goblinKing.attack(wiz1);
    }
}
