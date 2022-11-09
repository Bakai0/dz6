public class Main {
    public static void main(String[] args) {

        Boss boss = new Boss();
        boss.setDamage(50);
        boss.setHealth(200);
        boss.setStrely(new Weapon("дальне стрельний ","лук"));
        System.out.println();

        Skeleton skeleton = new Skeleton();
        skeleton.setHealth(400);
        skeleton.setDamage(100);
        skeleton.setNumberOfArrows(15);
        skeleton.setBow(new Weapon("Bow", "fire  "));
        System.out.println(skeleton.printInfo());

        Skeleton skeleton1 = new Skeleton();
        skeleton1.setHealth(500);
        skeleton1.setDamage(300);
        skeleton1.setNumberOfArrows(150);
        skeleton1.setBow(new Weapon("Bow", "bow "));
        System.out.println(skeleton1.printInfo());
    }

}



