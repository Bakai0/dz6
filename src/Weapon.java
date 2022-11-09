public class Weapon {
    private String weapon; //тип оружия
    private String nameWeapon;//названи оружия

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public String getNameWeapon() {
        return nameWeapon;
    }

    public void setNameWeapon(String nameWeapon) {
        this.nameWeapon = nameWeapon;
    }

    public Weapon(String weapon, String nameWeapon) {
        this.weapon = weapon;
        this.nameWeapon = nameWeapon;
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