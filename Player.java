public class Player {
    private final String name;
    private int hp = 100;

    public Player(String name) {
        this.name = name;
    }
    public void greet () {
        System.out.println("Bonjour, je suis " + name + " ! ") ;
    }
    public void takeDamage(int amount) {
        hp -= amount;
        System.out.println(name + " a perdu " + amount + "PV ! Il a désormais " + hp + "PV");
    }

    public boolean isAlive() {
        return hp > 0;
    }

    public int getHp() {
        return hp;
    }

    public static void main(String[] args) {
        Player p = new Player("Jean");
        p.greet();

        Weapon Kunai = new Weapon(10, 20); 
        int dmg = Kunai.rollDamage(); 
        System.out.println("L'arme inflige " + dmg + " dégâts !");
        p.takeDamage(dmg); 

        System.out.println("PV restants : " + p.getHp());
        
    }
}