abstract class Character {
    private String name;
    private int health;

    public Character(String name, int health) {
        this.name = name;
        this.health = health;
    }

    // Common method for all characters
    public void takeDamage(int damage) {
        health -= damage;
        if (health <= 0) {
            System.out.println(name + " has been defeated.");
        }
    }

    // Abstract method for moving
    public abstract void move();

    // Abstract method for attacking
    public abstract void attack(Character target);

    // Abstract method for interacting with the environment
    public abstract void interact();
}

class Warrior extends Character {
    public Warrior(String name, int health) {
        super(name, health);
    }

    @Override
    public void move() {
        System.out.println("Warrior is charging forward.");
    }

    @Override
    public void attack(Character target) {
        System.out.println("Warrior swings sword at " + target.name);
        // Code for attacking...
    }

    @Override
    public void interact() {
        System.out.println("Warrior interacts with an object.");
        // Code for interacting...
    }
}

class Mage extends Character {
    public Mage(String name, int health) {
        super(name, health);
    }

    @Override
    public void move() {
        System.out.println("Mage is teleporting.");
    }

    @Override
    public void attack(Character target) {
        System.out.println("Mage casts a spell at " + target.name);
        // Code for attacking...
    }

    @Override
    public void interact() {
        System.out.println("Mage interacts with an object.");
        // Code for interacting...
    }
}
