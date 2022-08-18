public class Main {
    public static void main(String[] args) {
Boss boss = new Boss();
boss.setDamage(100);
boss.setHealth(400);
boss.getWeapon().setSTEELARMS(WeaponType.STEELARMS);
boss.getWeapon().setName("Dagger");



Skeleton skeleton = new Skeleton();
skeleton.setDamage(90);
skeleton.setHealth(35);
skeleton.getWeapon().setSTEELARMS(WeaponType.BIOWEAPONS);
skeleton.getWeapon().setName(" COVID- 25 ");
skeleton.setArrows(100);

Skeleton skeleton1 = new Skeleton();
skeleton1.setDamage(110);
skeleton1.setHealth(40);
skeleton1.getWeapon().setSTEELARMS(WeaponType.FIRESHOOT);
skeleton1.getWeapon().setName("M-416");
skeleton1.setArrows(200);


       /* System.out.println( "здоровье " + boss.getHealth() + " урон " + boss.getDamage() + " тип оружия " + boss.getWeapon().getSTEELARMS()
        + " название оружие " + boss.getWeapon().getName());*/
        System.out.println(boss.Info());
        System.out.println(skeleton.Info());
        System.out.println(skeleton1.Info());

    }
}