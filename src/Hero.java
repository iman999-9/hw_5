public class Hero {
    private int health;
    private int damage;
    private String superPower;

    // Конструктор для задания всех полей
    public Hero(int health, int damage, String superPower) {
        this.health = health;
        this.damage = damage;
        this.superPower = superPower;
    }

    // Конструктор для задания только здоровья и урона
    public Hero(int health, int damage) {
        this.health = health;
        this.damage = damage;
        this.superPower = "None"; // Значение по умолчанию
    }

    // Геттеры для всех полей
    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public String getSuperPower() {
        return superPower;
    }
}