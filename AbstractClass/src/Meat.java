public class Meat extends Food{

    public double computeProtein(double weight){
        protein = weight * 0.4;
        return  protein;
    }

    public double computeFat(double weight){
        fat = weight * 0.6;
        return fat;
    }
}
