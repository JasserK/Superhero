public class Database {
    private Superhero[] superHeroList;
    int count;

    public Database() {
        this.superHeroList = new Superhero[5];
    }

    public void addSuperhero(String superHeroName, String name, String superPower, int age, String isHuman, int strength) {
        superHeroList[count++] = new Superhero(superHeroName, name, superPower, age, isHuman, strength);
    }
}
