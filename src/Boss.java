public class Boss extends GameEntity {
  private   Weapon weapon = new Weapon();

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }


    public String Info(){
        return  "здоровье  " + this.getHealth() + " урон " + this.getDamage() + " тип оружия " + this.getWeapon().getSTEELARMS() +
                " название оружия " + this.getWeapon().getName();
    }
}
