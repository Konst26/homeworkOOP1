public class Slythering extends Hogwarts {

    private int cunning;
    private int ambition;
    private int resourcefully;
    private int lust;
    private int determination;

    public Slythering(String name,
                      int magicPower,
                      int transgressionDistance,
                      int cunning,
                      int ambition,
                      int resourcefully,
                      int lust,
                      int determination) {
        super(name, magicPower, transgressionDistance);
        this.cunning = cunning;
        this.ambition = ambition;
        this.resourcefully = resourcefully;
        this.lust = lust;
        this.determination = determination;
    }

    public int getCunning() {
        return cunning;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefully() {
        return resourcefully;
    }

    public int getLust() {
        return lust;
    }

    public int getDetermination() {
        return determination;
    }

    public int sum(){
        return cunning+ambition+resourcefully+lust+determination;
    }

    public void compare(Slythering other){
        var s1 = this.sum();
        var s2 = other.sum();
        if(s1 > s2) {
            System.out.println(this.getName() + " лучший слизеринец, чем " + other.getName());
        } else {
            System.out.println(other.getName() + " лучший слизеринец, чем " + this.getName());
        }
    }

    @Override
    public String toString() {
        return super.toString() +
                ", cunning=" + cunning +
                ", ambition=" + ambition +
                ", resourcefully=" + resourcefully +
                ", lust=" + lust +
                ", determination=" + determination;
    }
}