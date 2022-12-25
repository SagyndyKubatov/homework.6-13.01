public class Weapon {
    private String name;
    private String weaponType;

    public Weapon(String name, String weaponType) {
        this.name = name;
        this.weaponType = weaponType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeaponType() {
        return weaponType;
    }

    public void setWeaponType(String weaponType) {
        this.weaponType = weaponType;
    }

    public String toString(){
        return "Weapon name: "+
                name+", weapon type: "+
                weaponType;
    }
}
