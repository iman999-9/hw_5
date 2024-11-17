public class main {
    public static void main(String[] args) {
        // Создаем объект босса
        Boss boss = new Boss();
        boss.setHealth(800);
        boss.setDamage(100);
        boss.setDefenseType("Magical");

        // Вывод информации о боссе
        System.out.println("Boss info:");
        System.out.println("Health: " + boss.getHealth());
        System.out.println("Damage: " + boss.getDamage());
        System.out.println("Defense Type: " + boss.getDefenseType());

        // Создаем героев и выводим их информацию
        Hero[] heroes = createHeroes();
        System.out.println("\nHeroes info:");
        for (Hero hero : heroes) {
            System.out.println("Health: " + hero.getHealth() +
                    ", Damage: " + hero.getDamage() +
                    ", Super Power: " + hero.getSuperPower());
        }
    }

    // Метод для создания массива героев
    public static Hero[] createHeroes() {
        // Создаем героев с использованием разных конструкторов
        Hero hero1 = new Hero(300, 50, "Fireball");
        Hero hero2 = new Hero(400, 40, "Invisibility");
        Hero hero3 = new Hero(250, 60);

        // Возвращаем массив героев
        return new Hero[]{hero1, hero2, hero3};
    }
}
