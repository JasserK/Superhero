public class Superhero {
    private String superHeroName;
    private String name;
    private String superPower;
    private int age;
    private String isHuman;
    private int strength;

    public Superhero(String superHeroName, String name, String superPower, int age, String isHuman, int strength) {
        this.superHeroName = superHeroName;
        this.name = name;
        this.superPower = superPower;
        this.age = age;
        this.isHuman = isHuman;
        this.strength = strength;
    }

    public String getSuperHeroName() {
        return superHeroName;
    }

    public String name() {
        return name;
    }

    public String getSuperPower() {
        return superPower;
    }

    public int getAge() {
        return age;
    }

    public String isHuman() {
        return isHuman;
    }

    public int getStrength() {
        return strength;
    }

    @Override
    public String toString() {
        return "Your Superhero: " +
                "Superhero name = " + superHeroName +
                ", Name = " + name +
                ", Super power = " + superPower +
                ", Age = " + age +
                ", Human = " + isHuman +
                ", Strength = " + strength;
    }
}
