public class MainClass {
    public static void main(String[] args) {
        Cat[] cat = new Cat[5];
        cat[0] = new Cat("Barsic", 40);
        cat[1] = new Cat("Murzic", 15);
        cat[2] = new Cat("Pushok", 30);
        cat[3] = new Cat("Vaska", 18);
        cat[4] = new Cat("Muska", 20);
        Plate plate = new Plate(100);
        plate.info();
        for (int i = 0; i < cat.length; i++) {
            cat[i].eat(plate);
            System.out.println(cat[i].getName() + " " +  (cat[i].isSatiety() ? "cытый" : "голодный"));
        }
        plate.info();
    }
}
