public class GameEntity {
    private static int health;
    private static int damage;

    private  String weapon;

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String mech) {
        this.weapon = weapon;
    }

    public static int getHealth() {
        return health;
    }

    public static int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}











//    Создать класс Weapon (Оружие), с приватными полями тип оружия и название
//оружия.
//        ● Создать класс GameEntity (Игровая сущность), выделить все общие поля которые
//        присущи и Боссу и Героям и добавить геттеры и сеттеры к ним.
//        ● Создать класс Босса, наследовать его от класса GameEntity и дополнить его полем
//        сложного типа данных Weapon (то есть дать оружие боссу). Также добавить
//        геттеры и сеттеры для этого поля.
//        ● В классе Main создать 1 экземпляр босса и задать ему все свойства (значения
//        полям). Затем распечатать всю информацию о боссе.
