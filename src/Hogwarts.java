public class Hogwarts {

    private String name;
    private int magicPower;
    private int transgressionDistance;

    public Hogwarts(String name, int magicPower, int transgressionDistance) {
        this.name = name;
        this.magicPower = magicPower;
        this.transgressionDistance = transgressionDistance;
    }

    public String getName() {
        return name;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    public String description() {
        return "Имя: " + name + ", сила магии: " + magicPower + ", сила трансгресирования: " + transgressionDistance;
    }

    ;

    public void compare(Hogwarts other) {

        if (magicPower > other.magicPower) {
            System.out.println(name + " Обладает большей магией, чем " + other.name);
        } else {
            System.out.println(other.name + " Обладает большей магией, чем " + name);
        }
        if (transgressionDistance > other.transgressionDistance) {
            System.out.println(name + "Обладает большей дистанцией, чем " + other.name);
        } else {
            System.out.println(other.name + "Обладает большей дистанцией, чем " + name);
        }
    }



    @Override
    public String toString() {
        return  "name='" + name + '\'' +
                ", magicPower=" + magicPower +
                ", transgressionDistance=" + transgressionDistance;
    }
}