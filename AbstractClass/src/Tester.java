public class Tester {

    public static void main(String[] args){

        Vegetable v = new Vegetable();
        v.computeProtein(100);
        v.computeFat(100);
        v.displayCalories();

        Meat m = new Meat();
        m.computeProtein(100);
        m.computeFat(100);
        m.displayCalories();
    }
}
