public class WeightConvertion {
    public WeightConvertion(){

    }
    public int kg_to_grams_conversion(int kg){
        int grams = 1000 * kg;
        return grams;
    }
    public int pound_to_kg_conversion(double kg){
        double pds = 2.2 * kg;
        return (int)pds;
    }
    public int grams_to_mg(int gm){
        int mg = 1000 * gm;
        return mg;
    }
}

