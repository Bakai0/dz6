public class Boss extends GameEntity {
    private static Weapon strely;

    public static Weapon getStrely() {
        return strely;
    }

    public void setStrely(Weapon strely) {
        this.strely = strely;
    }

    public static String print() {  //МЕТОД
        return getHealth() + "  " + getDamage() + " " + getStrely().getWeapon() + " " + getStrely().getNameWeapon();
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