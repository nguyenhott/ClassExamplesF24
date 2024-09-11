public class Vegetable extends Food{

    public double computeProtein(double weight){
        protein = weight * 0.8;
        return  protein;
    }

    public double computeFat(double weight){
        fat = weight * 0.2;
        return fat;
    }
}
