public class Main {
    public static void main(String[] args) {
        Hogwarts dambldor = new Hogwarts("Albus", 100, 100);
        Griffindor harry = new Griffindor("Harry", 70, 50, 45, 60, 70);
        Griffindor ron = new Griffindor("Ron", 50, 40, 55, 40, 60);
        Griffindor germiona = new Griffindor("Germiona", 60, 45, 55, 70, 60);
        harry.compare(germiona);

        Slythering drako = new Slythering("Drako", 70, 50, 45, 60, 70, 10, 30);
        Slythering greh = new Slythering("Grehem", 60, 40, 20, 60, 50, 30, 20);
        Slythering goil = new Slythering("Goil", 50, 45, 30, 60, 60, 20, 15);
        drako.compare(goil);

        Hufflepuff zahariya = new Hufflepuff("Zahariya", 50, 60, 10, 15, 20);
        Hufflepuff sedrik = new Hufflepuff("Sedrik", 80, 70, 60, 50, 40);
        Hufflepuff dzhastin = new Hufflepuff("Dzhastin", 10, 20, 30, 40, 50);
        sedrik.compare(zahariya);

        Rawenclaw chzhou = new Rawenclaw("Chzhou", 10, 20, 30,40,50, 60);
        Rawenclaw padma = new Rawenclaw("Padma", 10,10,10,10,10,10);
        Rawenclaw markus = new Rawenclaw("Markus",20,10,20,10,20,10);
        chzhou.compare(markus);
    }
}