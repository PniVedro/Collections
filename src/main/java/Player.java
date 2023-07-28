public class Player implements Comparable<Player>{
    private int id;
    private String name;
    private int strength;

    public Player() {
    }

    public Player(int id, String name, int strength) {
        this.id = id;
        this.name = name;
        this.strength = strength;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int compareTo(Player o) {
        if (this.strength < o.strength) {
            return -1;
        } else if (this.strength > o.strength) {
            return 1;
        } else {
            return 0;
        }
    }
}