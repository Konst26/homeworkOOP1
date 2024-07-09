public class Rawenclaw extends Hogwarts {

    private int creativity;
    private int witty;
    private int wisdom;
    private int brain;

    public Rawenclaw(String name,
                     int magicPower,
                     int transgressionDistance,
                     int creativity,
                     int witty,
                     int wisdom,
                     int brain) {
        super(name, magicPower, transgressionDistance);
        this.creativity = creativity;
        this.witty = witty;
        this.wisdom = wisdom;
        this.brain = brain;
    }

    public int getCreativity() {
        return creativity;
    }

    public int getWitty() {
        return witty;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getBrain() {
        return brain;
    }

    public int sum(){
        return creativity + wisdom + witty + brain;
    }

    public void compare(Rawenclaw other){
        var s1 = this.sum();
        var s2 = other.sum();
        if(s1 > s2) {
            System.out.println(this.getName() + " лучший когтевранец, чем " + other.getName());
        } else {
            System.out.println(other.getName() + " лучший когтевранец, чем " + this.getName());
        }
    }

    @Override
    public String toString() {
        return super.toString() +
                ", creativity=" + creativity +
                ", witty=" + witty +
                ", wisdom=" + wisdom +
                ", brain=" + brain;
    }
}